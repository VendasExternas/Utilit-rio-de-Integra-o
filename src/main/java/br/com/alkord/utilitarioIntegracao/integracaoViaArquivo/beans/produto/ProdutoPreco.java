package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.produto;

public class ProdutoPreco {

	private String CODIGO;
	private String PRECO_CUSTO_MOEDA;
	private String PRECO_CUSTO_REAL;
	private String PRECO_MEDIO;
	private String PRECO_VENDA;
	private String PRECO_VENDA_MOEDA;

	public String getPRECO_CUSTO_REAL() {
		return PRECO_CUSTO_REAL;
	}

	public void setPRECO_CUSTO_REAL(String PRECO_CUSTO_REAL) {
		this.PRECO_CUSTO_REAL = PRECO_CUSTO_REAL;
	}

	public String getPRECO_MEDIO() {
		return PRECO_MEDIO;
	}

	public void setPRECO_MEDIO(String PRECO_MEDIO) {
		this.PRECO_MEDIO = PRECO_MEDIO;
	}

	public String getPRECO_VENDA_MOEDA() {
		return PRECO_VENDA_MOEDA;
	}

	public void setPRECO_VENDA_MOEDA(String PRECO_VENDA_MOEDA) {
		this.PRECO_VENDA_MOEDA = PRECO_VENDA_MOEDA;
	}

	public String getPRECO_CUSTO_MOEDA() {
		return PRECO_CUSTO_MOEDA;
	}

	public void setPRECO_CUSTO_MOEDA(String PRECO_CUSTO_MOEDA) {
		this.PRECO_CUSTO_MOEDA = PRECO_CUSTO_MOEDA;
	}

	public String getCODIGO() {
		return CODIGO;
	}

	public void setCODIGO(String CODIGO) {
		this.CODIGO = CODIGO;
	}

	public String getPRECO_VENDA() {
		return PRECO_VENDA;
	}

	public void setPRECO_VENDA(String PRECO_VENDA) {
		this.PRECO_VENDA = PRECO_VENDA;
	}
}
