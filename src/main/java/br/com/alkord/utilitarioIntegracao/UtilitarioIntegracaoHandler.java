package br.com.alkord.utilitarioIntegracao;

import br.com.alkord.utilitarioIntegracao.requestMethods.DeleteRequest;
import br.com.alkord.utilitarioIntegracao.requestMethods.GetRequest;
import br.com.alkord.utilitarioIntegracao.requestMethods.PostRequest;
import br.com.alkord.utilitarioIntegracao.requestMethods.PutRequest;
import org.apache.commons.cli.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

class UtilitarioIntegracaoHandler {

	private final GetRequest getRequest;
	private final PutRequest putRequest;
	private final PostRequest postRequest;
	private final DeleteRequest deleteRequest;

	UtilitarioIntegracaoHandler() throws Exception {
		Configurations configurations = new Configurations();

		getRequest = new GetRequest(configurations);
		putRequest = new PutRequest(configurations);
		postRequest = new PostRequest(configurations);
		deleteRequest = new DeleteRequest(configurations);
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
		primaryGroup.setRequired(true);
		options.addOptionGroup(primaryGroup);

		return options;
	}
}
