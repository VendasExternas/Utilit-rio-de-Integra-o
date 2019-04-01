package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans;

public class APIRegisterIdentifier implements APIIdentifierInterface {

	public String CODIGO;
	public String REFERENCIA_INTEGRACAO;

	@Override
	public String getREFERENCIA_INTEGRACAO() {
		return REFERENCIA_INTEGRACAO;
	}

	public void setREFERENCIA_INTEGRACAO(String REFERENCIA_INTEGRACAO) {
		this.REFERENCIA_INTEGRACAO = REFERENCIA_INTEGRACAO;
	}

	@Override
	public String getCODIGO() {
		return CODIGO;
	}

	public void setCODIGO(String CODIGO) {
		this.CODIGO = CODIGO;
	}
}
