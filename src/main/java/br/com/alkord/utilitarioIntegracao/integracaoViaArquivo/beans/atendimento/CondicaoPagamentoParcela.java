package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.atendimento;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;

public class CondicaoPagamentoParcela implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private CondicaoPagamento CONDICAO;
	private String NUMERO;
	private String DIAS;
	private String PERCENTUAL;
	private String EXCLUIDO;

	@Override
	public String getCODIGO() {
		return CODIGO;
	}

	public void setCODIGO(String CODIGO) {
		this.CODIGO = CODIGO;
	}

	@Override
	public String getREFERENCIA_INTEGRACAO() {
		return REFERENCIA_INTEGRACAO;
	}

	public void setREFERENCIA_INTEGRACAO(String REFERENCIA_INTEGRACAO) {
		this.REFERENCIA_INTEGRACAO = REFERENCIA_INTEGRACAO;
	}

	public CondicaoPagamento getCONDICAO() {
		return CONDICAO;
	}

	public void setCONDICAO(CondicaoPagamento CONDICAO) {
		this.CONDICAO = CONDICAO;
	}

	public String getNUMERO() {
		return NUMERO;
	}

	public void setNUMERO(String NUMERO) {
		this.NUMERO = NUMERO;
	}

	public String getDIAS() {
		return DIAS;
	}

	public void setDIAS(String DIAS) {
		this.DIAS = DIAS;
	}

	public String getPERCENTUAL() {
		return PERCENTUAL;
	}

	public void setPERCENTUAL(String PERCENTUAL) {
		this.PERCENTUAL = PERCENTUAL;
	}

	public String getEXCLUIDO() {
		return EXCLUIDO;
	}

	public void setEXCLUIDO(String EXCLUIDO) {
		this.EXCLUIDO = EXCLUIDO;
	}
}
