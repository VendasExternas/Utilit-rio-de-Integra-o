package br.com.alkord.utilitarioIntegracao;

import br.com.alkord.utilitarioIntegracao.exceptions.AuthenticationException;
import br.com.alkord.utilitarioIntegracao.exceptions.ConfigurationException;
import br.com.alkord.utilitarioIntegracao.exceptions.ParameterException;
import com.google.gson.JsonObject;
import org.apache.commons.cli.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utils {

	private static final Option helpOption = Option.builder("h")
			.longOpt("help")
			.required(false)
			.hasArg(false)
			.build();

	public static boolean contemHelp(String[] args) {
		try {
			Options options = new Options();
			options.addOption(helpOption);

			RelaxedParser parser = new RelaxedParser();
			CommandLine cmd = parser.parse(options, args);

			return cmd.hasOption(helpOption.getOpt());
		}
		catch (ParseException ignored) {
		}

		return false;
	}

	static void salvarErro(Exception exception) throws IOException {
		JsonObject jsonObject = new JsonObject();

		if (exception instanceof AuthenticationException) {
			jsonObject.addProperty("ERRO", exception.getMessage());
			jsonObject.addProperty("CODIGO_ERRO", 1);
		}
		else if (exception instanceof ConfigurationException) {
			jsonObject.addProperty("ERRO", exception.getMessage());
			jsonObject.addProperty("CODIGO_ERRO", 2);
		}
		else if (exception instanceof ParameterException) {
			jsonObject.addProperty("ERRO", exception.getMessage());
			jsonObject.addProperty("CODIGO_ERRO", 3);
		}
		else if (exception instanceof FileNotFoundException) {
			jsonObject.addProperty("ERRO", "Arquivo inexistente: " + exception.getMessage());
			jsonObject.addProperty("CODIGO_ERRO", 4);
		}
		else if (exception.getMessage() != null) {
			jsonObject.addProperty("ERRO", exception.getMessage());
			jsonObject.addProperty("CODIGO_ERRO", -1);
		}
		else {
			jsonObject.addProperty("ERRO", "Erro desconhecido");
			jsonObject.addProperty("CODIGO_ERRO", -1);
		}

		FileUtils.writeStringToFile(new File("." + File.separator + "retorno.txt"), jsonObject.toString(), "UTF-8");
	}

	public static class RelaxedParser extends DefaultParser {

		@Override
		public CommandLine parse(Options options, String[] arguments) throws ParseException {
			List<String> knownArguments = new ArrayList<>();
			for (String arg : arguments) {
				if (options.hasOption(arg))
					knownArguments.add(arg);
			}
			return super.parse(options, knownArguments.toArray(new String[0]));
		}
	}
}
