package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo;

import br.com.alkord.utilitarioIntegracao.DatabaseHelper;
import br.com.alkord.utilitarioIntegracao.exceptions.NoReferenceException;
import br.com.alkord.utilitarioIntegracao.exceptions.ParameterException;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIRegisterIdentifier;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIResult;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.ProcessResult;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.atendimento.Atendimento;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.pessoa.Pessoa;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.produto.Produto;
import br.com.alkord.utilitarioIntegracao.requestMethods.GetRequest;
import br.com.alkord.utilitarioIntegracao.requestMethods.PostRequest;
import br.com.alkord.utilitarioIntegracao.requestMethods.PutRequest;
import br.com.alkord.utilitarioIntegracao.requestService.RequestService;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import javax.inject.Inject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class ImportProcessor extends Integration {

	private DatabaseHelper databaseHelper;
	private GetRequest getRequest;
	private PutRequest putRequest;
	private PostRequest postRequest;

	@Inject
	public ImportProcessor(DatabaseHelper databaseHelper, GetRequest getRequest, PutRequest putRequest,
			PostRequest postRequest) {
		this.databaseHelper = databaseHelper;
		this.getRequest = getRequest;
		this.putRequest = putRequest;
		this.postRequest = postRequest;
	}

	@Override
	public String processIntegration(String[] args) throws Exception {
		String endpoint = args[2];

		HashMap<String, String> profile = loadProfile(endpoint);
		List<HashMap<String, String>> registersCSV = loadCSVRegisters(endpoint, profile);
		ProcessResult processResult;

		switch (endpoint) {
			case "produtos":
				processResult = processIntegrationRegisters(Produto.class, registersCSV, "produtos");
				break;
			case "clientes":
				processResult = processIntegrationRegisters(Pessoa.class, registersCSV, "clientes");
				break;
			case "atendimentos":
				processResult = processIntegrationRegisters(Atendimento.class, registersCSV, "atendimentos");
				break;
			default:
				throw new ParameterException("O endpoint selecionado é inválido para importação via arquivos");
		}

		return new Gson().toJson(processResult);
	}

	private ProcessResult processIntegrationRegisters(Class registerClass, List<HashMap<String, String>> registersCSV,
			String endpoint) throws Exception {
		System.out.println("Inicio da integração: " + new Date());
		ProcessResult processResult = new ProcessResult();
		List<Object> registersToUpdate = new ArrayList<>();
		List<Object> registersToInsert = new ArrayList<>();
		int line = 0;

		for (HashMap<String, String> registerFields : registersCSV) {
			Object register = registerClass.newInstance();
			line++;

			processCSV(registerFields, register);

			if (StringUtils.isBlank(((APIIdentifierInterface) register).getREFERENCIA_INTEGRACAO()))
				throw new NoReferenceException("A referência do registro na linha " + line + " não foi informada");

			if (databaseHelper.referenceExists(endpoint, ((APIIdentifierInterface) register).getREFERENCIA_INTEGRACAO())
				|| databaseHelper.identifierExists(endpoint, ((APIIdentifierInterface) register).getCODIGO()))
				registersToUpdate.add(register);
			else
				registersToInsert.add(register);
		}


		if (registersToUpdate.isEmpty() && registersToInsert.isEmpty())
			throw new RuntimeException("Não há " + endpoint + " no CSV");

		sendRegisters(registersToInsert, postRequest, endpoint, "inserir", processResult);
		sendRegisters(registersToUpdate, putRequest, endpoint, "atualizar", processResult);
		System.out.println("Fim da integração: " + new Date());

		return processResult;
	}

	private void sendRegisters(List<Object> registers, RequestService httpRequest,
			String endpoint, String action, ProcessResult processResult) throws Exception {

		if (registers.isEmpty())
			return;

		List<List<Object>> blocks = Lists.partition(registers, 100);

		for (List<Object> block : blocks) {
			String[] argsRequest = new String[]{
					"-" + action,
					"-endpoint", endpoint,
					"-dados", new Gson().toJson(block)
			};

			boolean actionSuccess = true;
			String jsonResult = httpRequest.executar(argsRequest);

			if (jsonResult.contains("{\"REFERENCIAS\":")) {
				if (action.equals("inserir")) {
					ArrayList<APIResult<APIIdentifierInterface>> objectResults =
							new Gson().fromJson(jsonResult, new TypeToken<List<APIResult<APIRegisterIdentifier>>>() {}.getType());

					for (APIResult<APIIdentifierInterface> objectResult : objectResults) {
						databaseHelper.insertReference(endpoint, objectResult.REFERENCIAS.getCODIGO(),
								objectResult.REFERENCIAS.getREFERENCIA_INTEGRACAO());
					}
				}
			}
			else
				actionSuccess = false;

			if (action.equals("inserir")) {
				processResult.getAPI_RETORNO_INSERCAO().add(jsonResult);
				processResult.getAPI_RESULTADO_INSERCAO().add(actionSuccess);
			}
			else {
				processResult.getAPI_RETORNO_ATUALIZACAO().add(jsonResult);
				processResult.getAPI_RESULTADO_ATUALIZACAO().add(actionSuccess);
			}
		}
	}

	private HashMap<String, String> loadProfile(String endpoint) throws FileNotFoundException {
		String csvFile = "perfil_importacao_" + endpoint + ".csv";
		Scanner scanner = new Scanner(new File(csvFile));
		HashMap<String, String> perfil = new HashMap<>();

		while (scanner.hasNext()) {
			List<String> line = CSVUtils.parseLine(scanner.nextLine());

			if (line.get(0).toUpperCase().equals("COLUNA VE"))
				continue;

			perfil.put(line.get(1), line.get(0));
		}

		scanner.close();

		return perfil;
	}

	private List<HashMap<String, String>> loadCSVRegisters(String endpoint, HashMap<String, String> perfil)
			throws FileNotFoundException {
		List<String> campos = new ArrayList<>();
		List<HashMap<String, String>> registros = new ArrayList<>();
		int lineIndex = 0;

		String csvFile = "registros_importacao_" + endpoint + ".csv";
		Scanner scanner = new Scanner(new FileInputStream(csvFile), StandardCharsets.UTF_8.toString());

		while (scanner.hasNext()) {
			List<String> line = CSVUtils.parseLine(scanner.nextLine());
			HashMap<String, String> dadosRegistro = new HashMap<>();

			for (int i = 0; i < line.size(); i++) {
				if (lineIndex == 0)
					campos.add(perfil.get(line.get(i)));
				else
					dadosRegistro.put(campos.get(i), line.get(i));
			}

			if (lineIndex > 0)
				registros.add(dadosRegistro);

			lineIndex++;
		}

		scanner.close();

		return registros;
	}
}
