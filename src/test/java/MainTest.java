import br.com.alkord.utilitarioIntegracao.Main;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

	@Test
	void buscarLicencas() throws IOException {
		String[] parametros = new String[]{
				"-buscar",
				"-endpoint", "licencas"
		};
		Main.main(parametros);

		assertFalse(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("ERRO"));
	}

	@Test
	void buscarIntegracoesTest() throws IOException {
		String[] parametros = new String[]{
				"-buscar",
				"-endpoint", "integracoes"
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("TOTAL_REGISTROS"));
	}

	@Test
	void buscarProduto() throws IOException {
		String[] parametros = new String[]{
				"-buscar",
				"-endpoint", "produtos"
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("TOTAL_REGISTROS"));
	}


	@Test
	void buscarCllientesComFiltro() throws IOException {
		String[] parametros = new String[]{
				"-buscar",
				"-endpoint", "clientes",
				"-colunas", "CODIGO,DATA_ALTERACAO",
				"-filtros", "DATA_ALTERACAO:su:2019-10-10 11:00:19",
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("TOTAL_REGISTROS"));
	}

	@Test
	void buscarCllientesComOrdenacao() throws IOException {
		String[] parametros = new String[]{
				"-buscar",
				"-endpoint", "clientes",
				"-colunas", "CODIGO,TIPO_PESSOA,NOME,APELIDO,DOCUMENTO,DOCUMENTO2,NASCIMENTO_CONSTITUICAO,EXCLUIDO,INTERNET,REGIAO[NOME],EMAILS,TELEFONES,ENDERECOS[TIPO,PRINCIPAL,EXCLUIDO,CEP,ENDERECO,NUMERO,COMPLEMENTO,BAIRRO,CONTATO_ALTERNATIVO,ESTADO[SIGLA],CIDADE[NOME]],REFERENCIAS_INTEGRACAO,DATA_CRIACAO,DATA_ALTERACAO,SEXO,FISCAL,COMERCIAL_VENDA[REPRESENTANTE[CODIGO,NOME,REFERENCIAS_INTEGRACAO],PESSOA,TRANSPORTADORA]",
				"-ordenacao", "DATA_ALTERACAO ASC",
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("TOTAL_REGISTROS"));
	}

	@Test
	void buscarProdutoComFiltros() throws IOException {
		String[] parametros = new String[]{
				"-buscar",
				"-endpoint", "produtos",
				"-colunas", "NOME",
				"-filtros", "CODIGO:ig:1"
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("TOTAL_REGISTROS"));
	}

	@Test
	void inserirIntegracao() throws IOException {
		String[] parametros = new String[]{
				"-inserir",
				"-endpoint", "integracoes",
				"-dados", getClass().getResource("json/post_integracao.json").getPath()
		};
		Main.main(parametros);

		assertFalse(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("ERRO"));
	}

	@Test
	void inserirClientes() throws IOException {
		String[] parametros = new String[]{
				"-inserir",
				"-endpoint", "clientes",
				"-dados", getClass().getResource("json/post_clientes.json").getPath()
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("REFERENCIAS"));
	}

	@Test
	void inserirProdutos() throws IOException {
		String[] parametros = new String[]{
				"-inserir",
				"-endpoint", "produtos",
				"-dados", getClass().getResource("json/post_produtos.json").getPath()
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("REFERENCIAS"));
	}

	@Test
	void inserirProdutosBatch() throws IOException {
		String[] parametros = new String[]{
				"-inserir",
				"-endpoint", "produtos",
				"-dados", getClass().getResource("json/post_produtos_batch.json").getPath()
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("REFERENCIAS"));
	}

	@Test
	void atualizarProduto() throws IOException {
		String[] parametros = new String[]{
				"-atualizar",
				"-endpoint", "produtos",
				"-dados", getClass().getResource("json/put_produtos.json").getPath()
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("REFERENCIAS"));
	}

	@Test
	void atualizarProdutosBatch() throws IOException {
		String[] parametros = new String[]{
				"-atualizar",
				"-endpoint", "produtos",
				"-dados", getClass().getResource("json/put_produtos_batch.json").getPath()
		};
		Main.main(parametros);

		assertTrue(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("REFERENCIAS"));
	}

	@Test
	void deletarProduto() throws IOException {
		String[] parametros = new String[]{
				"-deletar",
				"-endpoint", "produtos",
				"-codigos", "1"
		};
		Main.main(parametros);

		assertFalse(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("ERRO"));
	}

	@Test
	void deletarProdutos() throws IOException {
		String[] parametros = new String[]{
				"-deletar",
				"-endpoint", "produtos",
				"-codigos", "1,2,3"
		};
		Main.main(parametros);

		assertFalse(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("ERRO"));
	}

	@Test
	void importacaoProdutos() throws IOException {
		String[] parametros = new String[]{
				"-importar",
				"-endpoint", "produtos"
		};
		Main.main(parametros);

		assertFalse(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("ERRO"));
	}

	@Test
	void importacaoClientes() throws IOException {
		String[] parametros = new String[]{
				"-importar",
				"-endpoint", "clientes"
		};
		Main.main(parametros);

		assertFalse(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("ERRO"));
	}

	@Test
	void importacaoAtendimentos() throws IOException {
		String[] parametros = new String[]{
				"-importar",
				"-endpoint", "atendimentos"
		};
		Main.main(parametros);

		assertFalse(FileUtils.readFileToString(new File("retorno.txt"), "UTF-8").contains("ERRO"));
	}
}
