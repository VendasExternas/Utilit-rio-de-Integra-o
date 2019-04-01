package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.produto;

public class ProdutoLivro {

	private String CODIGO_TCL;
	private String ISBN;
	private String EDICAO;
	private String PAGINAS;
	private String ANO_PUBLICACAO;
	private String COLECAO;
	private String ACABAMENTO;

	public String getCODIGO_TCL() {
		return CODIGO_TCL;
	}

	public void setCODIGO_TCL(String CODIGO_TCL) {
		this.CODIGO_TCL = CODIGO_TCL;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getEDICAO() {
		return EDICAO;
	}

	public void setEDICAO(String EDICAO) {
		this.EDICAO = EDICAO;
	}

	public String getPAGINAS() {
		return PAGINAS;
	}

	public void setPAGINAS(String PAGINAS) {
		this.PAGINAS = PAGINAS;
	}

	public String getANO_PUBLICACAO() {
		return ANO_PUBLICACAO;
	}

	public void setANO_PUBLICACAO(String ANO_PUBLICACAO) {
		this.ANO_PUBLICACAO = ANO_PUBLICACAO;
	}

	public String getCOLECAO() {
		return COLECAO;
	}

	public void setCOLECAO(String COLECAO) {
		this.COLECAO = COLECAO;
	}

	public String getACABAMENTO() {
		return ACABAMENTO;
	}

	public void setACABAMENTO(String ACABAMENTO) {
		this.ACABAMENTO = ACABAMENTO;
	}
}
