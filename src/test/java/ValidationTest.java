import br.com.alkord.utilitarioIntegracao.Main;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidationTest {

	@Test
	void validarFaltaEndpoint() throws IOException {
		String[] parametros = new String[]{
				"-buscar",
				"-endpoint", ""
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8")
				.contains("O endpoint é obrigatório e não foi informado"));
	}

	@Test
	void validarCaminhoArquivoEmBranco() throws IOException {
		String[] parametros = new String[]{
				"-atualizar",
				"-endpoint", "produtos",
				"-dados", ""
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("Arquivo inexistente"));
	}

	@Test
	void validarArquivoDadosVazioPUT() throws IOException {
		String[] parametros = new String[]{
				"-atualizar",
				"-endpoint", "produtos",
				"-dados", getClass().getResource("json/test_json_vazio.json").getPath()
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8")
				.contains("Nenhum dado foi informado no arquivo especificado"));
	}

	@Test
	void validarArquivoDadosVazioPOST() throws IOException {
		String[] parametros = new String[]{
				"-atualizar",
				"-endpoint", "produtos",
				"-dados", getClass().getResource("json/test_json_vazio.json").getPath()
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8")
				.contains("Nenhum dado foi informado no arquivo especificado"));
	}

	@Test
	void validarCodigosEmBranco() throws IOException {
		String[] parametros = new String[]{
				"-deletar",
				"-endpoint", "produtos",
				"-codigos", ""
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8")
				.contains("Os códigos dos registros a serem deletados não foram informados"));
	}
}
