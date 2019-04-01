package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.produto;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.Localizacao;

public class ProdutoEstoque {

	private String QUANTIDADE_MINIMA;
	private String UNIDADE;
	private String QUANTIDADE_ATUAL;
	private String QUANTIDADE_RESERVA;
	private Localizacao LOCALIZACAO;

	public String getQUANTIDADE_MINIMA() {
		return QUANTIDADE_MINIMA;
	}

	public void setQUANTIDADE_MINIMA(String QUANTIDADE_MINIMA) {
		this.QUANTIDADE_MINIMA = QUANTIDADE_MINIMA;
	}

	public String getUNIDADE() {
		return UNIDADE;
	}

	public void setUNIDADE(String UNIDADE) {
		this.UNIDADE = UNIDADE;
	}

	public String getQUANTIDADE_ATUAL() {
		return QUANTIDADE_ATUAL;
	}

	public void setQUANTIDADE_ATUAL(String QUANTIDADE_ATUAL) {
		this.QUANTIDADE_ATUAL = QUANTIDADE_ATUAL;
	}

	public String getQUANTIDADE_RESERVA() {
		return QUANTIDADE_RESERVA;
	}

	public void setQUANTIDADE_RESERVA(String QUANTIDADE_RESERVA) {
		this.QUANTIDADE_RESERVA = QUANTIDADE_RESERVA;
	}

	public Localizacao getLOCALIZACAO() {
		return LOCALIZACAO;
	}

	public void setLOCALIZACAO(Localizacao LOCALIZACAO) {
		this.LOCALIZACAO = LOCALIZACAO;
	}
}
