package br.com.alkord.utilitarioIntegracao.requestMethods;

import br.com.alkord.utilitarioIntegracao.Configurations;
import br.com.alkord.utilitarioIntegracao.Utils;
import br.com.alkord.utilitarioIntegracao.requestService.HttpResult;
import br.com.alkord.utilitarioIntegracao.requestService.RequestConfiguration;
import br.com.alkord.utilitarioIntegracao.requestService.RequestService;
import org.apache.commons.cli.*;

import java.util.ArrayList;

public class GetRequest extends RequestService {

	private String colunas;
	private String filtros;

	public GetRequest(Configurations configurations) {
		super(configurations);
	}

	@Override
	public String executar(String[] args) throws Exception {
		Options options = getOptions();

		if (Utils.contemHelp(args)) {
			final HelpFormatter helpFormatter = new HelpFormatter();
			helpFormatter.setOptionComparator(null);
			helpFormatter.printHelp("<command>", options, true);

			return null;
		}
		else {
			CommandLine commandLine = new DefaultParser().parse(options, args, true);
			endpoint = commandLine.getOptionValue("endpoint");
			colunas = commandLine.getOptionValue("colunas");
			filtros = commandLine.getOptionValue("filtros");
			validateRequest();

			RequestConfiguration request = new RequestConfiguration();
			request.setRequestMethod(RequestMethod.GET);
			request.setURL(buildURL());
			HttpResult httpResult = sendRequest(request);

			return process(args, httpResult);
		}
	}

	@Override
	public String buildURL() {
		ArrayList<String> urlParams = new ArrayList<>();

		if (colunas != null)
			urlParams.add("colunas=" + colunas);

		if (filtros != null)
			urlParams.add("filtros=" + filtros);

		if (endpoint.equals("integracoes"))
			urlParams.add("licenca=" + licenca);
		else if (!endpoint.equals("licencas"))
			urlParams.add("token=" + getToken());

		return apiURL + endpoint + "?" + String.join("&", urlParams);
	}

	private Options getOptions() {
		Options options = new Options();
		options.addOption(Option.builder("buscar").desc("operação a ser realizada").required().build());
		options.addOption(Option.builder("endpoint").hasArg().argName("endpoint")
				.desc("modelo que deseja processar").required().build());
		options.addOption(Option.builder("colunas").hasArg().desc("colunas do modelo a serem retornadas").build());
		options.addOption(Option.builder("filtros").hasArg().desc("parâmetros para filtrar o resultado").build());
		options.addOption("help", "exibe esta mensagem");

		return options;
	}
}
