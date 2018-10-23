package br.com.alkord.utilitarioIntegracao.requestMethods;

import br.com.alkord.utilitarioIntegracao.Configurations;
import br.com.alkord.utilitarioIntegracao.Utils;
import br.com.alkord.utilitarioIntegracao.exceptions.ParameterException;
import br.com.alkord.utilitarioIntegracao.requestService.HttpResult;
import br.com.alkord.utilitarioIntegracao.requestService.RequestConfiguration;
import br.com.alkord.utilitarioIntegracao.requestService.RequestService;
import org.apache.commons.cli.*;
import org.apache.commons.lang3.StringUtils;

public class DeleteRequest extends RequestService {

	private String codigos;

	public DeleteRequest(Configurations configurations) {
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
			codigos = commandLine.getOptionValue("codigos");
			validateRequest();

			RequestConfiguration request = new RequestConfiguration();
			request.setRequestMethod(RequestMethod.DELETE);
			request.setURL(buildURL());
			HttpResult httpResult = sendRequest(request);

			return process(args, httpResult);
		}
	}

	@Override
	public String buildURL() {
		return apiURL + endpoint + "/" + codigos + "?token=" + getToken();
	}

	private Options getOptions() {
		Options options = new Options();
		options.addOption(Option.builder("deletar").desc("operação a ser realizada").required().build());
		options.addOption(Option.builder("endpoint").hasArg().argName("endpoint")
				.desc("modelo que deseja processar").required().build());
		options.addOption(Option.builder("codigos").hasArg().argName("numérico")
				.desc("códigos dos registros a deletar").required().build());
		options.addOption("help", "exibe esta mensagem");

		return options;
	}

	@Override
	protected void validateRequest() {
		super.validateRequest();

		if (StringUtils.isBlank(codigos))
			throw new ParameterException("Os códigos dos registros a serem deletados não foram informados");
	}
}
