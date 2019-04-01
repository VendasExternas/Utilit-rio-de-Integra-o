package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.atendimento;

public class AtendimentoTexto {

	private String OBSERVACAO;
	private String OBSERVACAO_ENTREGA;
	private String POSICIONAMENTO_LATITUDE;
	private String POSICIONAMENTO_LONGITUDE;

	public String getOBSERVACAO() {
		return OBSERVACAO;
	}

	public void setOBSERVACAO(String OBSERVACAO) {
		this.OBSERVACAO = OBSERVACAO;
	}

	public String getOBSERVACAO_ENTREGA() {
		return OBSERVACAO_ENTREGA;
	}

	public void setOBSERVACAO_ENTREGA(String OBSERVACAO_ENTREGA) {
		this.OBSERVACAO_ENTREGA = OBSERVACAO_ENTREGA;
	}

	public String getPOSICIONAMENTO_LATITUDE() {
		return POSICIONAMENTO_LATITUDE;
	}

	public void setPOSICIONAMENTO_LATITUDE(String POSICIONAMENTO_LATITUDE) {
		this.POSICIONAMENTO_LATITUDE = POSICIONAMENTO_LATITUDE;
	}

	public String getPOSICIONAMENTO_LONGITUDE() {
		return POSICIONAMENTO_LONGITUDE;
	}

	public void setPOSICIONAMENTO_LONGITUDE(String POSICIONAMENTO_LONGITUDE) {
		this.POSICIONAMENTO_LONGITUDE = POSICIONAMENTO_LONGITUDE;
	}
}
