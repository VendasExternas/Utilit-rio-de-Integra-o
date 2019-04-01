package br.com.alkord.utilitarioIntegracao.requestMethods;

import br.com.alkord.utilitarioIntegracao.Configurations;
import br.com.alkord.utilitarioIntegracao.Utils;
import br.com.alkord.utilitarioIntegracao.exceptions.ParameterException;
import br.com.alkord.utilitarioIntegracao.requestService.HttpResult;
import br.com.alkord.utilitarioIntegracao.requestService.RequestConfiguration;
import br.com.alkord.utilitarioIntegracao.requestService.RequestService;
import org.apache.commons.cli.*;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;

public class PutRequest extends RequestService {

	private String data;

	public PutRequest(Configurations configurations) {
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
			File file = new File(commandLine.getOptionValue("dados"));

			if (file.exists())
				data = FileUtils.readFileToString(file, "UTF-8");
			else
				data = commandLine.getOptionValue("dados");

			validateRequest();

			RequestConfiguration request = new RequestConfiguration();
			request.setRequestMethod(RequestMethod.PUT);
			request.setURL(buildURL());
			request.setData(data);
			HttpResult httpResult = sendRequest(request);

			return process(args, httpResult);
		}
	}

	@Override
	public String buildURL() {
		return apiURL + endpoint + "?token=" + getToken();
	}

	private Options getOptions() {
		Options options = new Options();

		options.addOption(Option.builder("atualizar").desc("operação a ser realizada").required().build());
		options.addOption(Option.builder("endpoint").hasArg().argName("endpoint")
				.desc("modelo que deseja processar").required().build());
		options.addOption(Option.builder("dados").hasArg().argName("dados")
				.desc("arquivo json com os dados do modelo").required().build());
		options.addOption("help", "exibe esta mensagem");

		return options;
	}

	@Override
	protected void validateRequest() {
		super.validateRequest();

		if (StringUtils.isBlank(data))
			throw new ParameterException("Nenhum dado foi informado no arquivo especificado");
	}
}
