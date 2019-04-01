package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.atendimento;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;

public class RegraNegociacao implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private String TIPO;
	private String DESCRICAO;
	private String VALIDADE_INICIAL;
	private String VALIDADE_FINAL;
	private String VALOR;
	private String EXCLUIDO;
	private String LISTA_PRECO_APLICAR;

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

	public String getTIPO() {
		return TIPO;
	}

	public void setTIPO(String TIPO) {
		this.TIPO = TIPO;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

	public String getVALIDADE_INICIAL() {
		return VALIDADE_INICIAL;
	}

	public void setVALIDADE_INICIAL(String VALIDADE_INICIAL) {
		this.VALIDADE_INICIAL = VALIDADE_INICIAL;
	}

	public String getVALIDADE_FINAL() {
		return VALIDADE_FINAL;
	}

	public void setVALIDADE_FINAL(String VALIDADE_FINAL) {
		this.VALIDADE_FINAL = VALIDADE_FINAL;
	}

	public String getVALOR() {
		return VALOR;
	}

	public void setVALOR(String VALOR) {
		this.VALOR = VALOR;
	}

	public String getEXCLUIDO() {
		return EXCLUIDO;
	}

	public void setEXCLUIDO(String EXCLUIDO) {
		this.EXCLUIDO = EXCLUIDO;
	}

	public String getLISTA_PRECO_APLICAR() {
		return LISTA_PRECO_APLICAR;
	}

	public void setLISTA_PRECO_APLICAR(String LISTA_PRECO_APLICAR) {
		this.LISTA_PRECO_APLICAR = LISTA_PRECO_APLICAR;
	}
}
