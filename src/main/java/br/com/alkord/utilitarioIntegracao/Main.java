package br.com.alkord.utilitarioIntegracao;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		carregarModulo(args);
	}

	private static void carregarModulo(String[] args) throws IOException {
		try {
			UtilitarioIntegracaoHandler utilitarioIntegracao = new UtilitarioIntegracaoHandler();
			utilitarioIntegracao.processar(args);
		}
		catch (ParseException exception) {
			if (Utils.contemHelp(args)) {
				final HelpFormatter helpFormatter = new HelpFormatter();
				helpFormatter.setOptionComparator(null);
				helpFormatter.printHelp("<command> [módulo] [operações] [parâmetros] [-help]", "Módulos:", new Options(), "");
			}
			else
				Utils.salvarErro(exception);
		}
		catch (Exception exception) {
			Utils.salvarErro(exception);
		}
	}
}
