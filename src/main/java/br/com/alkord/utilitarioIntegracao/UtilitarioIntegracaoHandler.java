package br.com.alkord.utilitarioIntegracao;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.ImportProcessor;
import br.com.alkord.utilitarioIntegracao.requestMethods.DeleteRequest;
import br.com.alkord.utilitarioIntegracao.requestMethods.GetRequest;
import br.com.alkord.utilitarioIntegracao.requestMethods.PostRequest;
import br.com.alkord.utilitarioIntegracao.requestMethods.PutRequest;
import org.apache.commons.cli.*;
import org.apache.commons.io.FileUtils;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.File;
import java.io.IOException;

@Singleton
class UtilitarioIntegracaoHandler {

	private GetRequest getRequest;
	private PutRequest putRequest;
	private PostRequest postRequest;
	private DeleteRequest deleteRequest;
	private ImportProcessor importProcessor;

	@Inject
	UtilitarioIntegracaoHandler(GetRequest getRequest, PutRequest putRequest, PostRequest postRequest,
			DeleteRequest deleteRequest, ImportProcessor importProcessor) {
		this.getRequest = getRequest;
		this.putRequest = putRequest;
		this.postRequest = postRequest;
		this.deleteRequest = deleteRequest;
		this.importProcessor = importProcessor;
	}

	void processar(String[] args) throws Exception {
		Options options = getOptions();

		try {
			CommandLine commandLine = new DefaultParser().parse(options, args, true);

			if (commandLine.hasOption("buscar"))
				salvarRetorno(getRequest.executar(args));
			else if (commandLine.hasOption("atualizar"))
				salvarRetorno(putRequest.executar(args));
			else if (commandLine.hasOption("inserir"))
				salvarRetorno(postRequest.executar(args));
			else if (commandLine.hasOption("deletar"))
				salvarRetorno(deleteRequest.executar(args));
			else if (commandLine.hasOption("importar"))
				salvarRetorno(importProcessor.processIntegration(args));
		}
		catch (ParseException exception) {
			if (Utils.contemHelp(args)) {
				final HelpFormatter helpFormatter = new HelpFormatter();
				helpFormatter.setOptionComparator(null);

				helpFormatter.printHelp("<command> [operação] [parâmetros] [-help]", "Operações:", options, "");
			}
			else
				Utils.salvarErro(exception);
		}
		catch (Exception exception) {
			Utils.salvarErro(exception);
		}
	}

	private void salvarRetorno(String retornoRequisicao) throws IOException {
		if (retornoRequisicao == null)
			return;

		FileUtils.writeStringToFile(new File("retorno.txt"), retornoRequisicao, "UTF-8");
	}

	private static Options getOptions() {
		Options options = new Options();
		options.addOption(Option.builder("endpoint").hasArg().argName("endpoint")
				.desc("modelo que deseja processar").required().build());

		OptionGroup primaryGroup = new OptionGroup();
		primaryGroup.addOption(new Option("buscar", "operação busca de dados"));
		primaryGroup.addOption(new Option("atualizar", "operação de atualização de dados"));
		primaryGroup.addOption(new Option("inserir", "operação de inserção de dados"));
		primaryGroup.addOption(new Option("deletar", "operação de exclusão de dados"));
		primaryGroup.addOption(new Option("importar", "operação de importação de dados"));
		primaryGroup.addOption(new Option("exportar", "operação de exportação de dados"));
		primaryGroup.setRequired(true);
		options.addOptionGroup(primaryGroup);

		return options;
	}
}
