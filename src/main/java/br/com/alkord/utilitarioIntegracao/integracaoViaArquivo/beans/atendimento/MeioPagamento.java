package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.atendimento;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;

public class MeioPagamento implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private String TIPO;
	private String NOME;
	private String ACESSO_RAPIDO;
	private String OBSERVACAO;
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

	public String getTIPO() {
		return TIPO;
	}

	public void setTIPO(String TIPO) {
		this.TIPO = TIPO;
	}

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String NOME) {
		this.NOME = NOME;
	}

	public String getACESSO_RAPIDO() {
		return ACESSO_RAPIDO;
	}

	public void setACESSO_RAPIDO(String ACESSO_RAPIDO) {
		this.ACESSO_RAPIDO = ACESSO_RAPIDO;
	}

	public String getOBSERVACAO() {
		return OBSERVACAO;
	}

	public void setOBSERVACAO(String OBSERVACAO) {
		this.OBSERVACAO = OBSERVACAO;
	}

	public String getEXCLUIDO() {
		return EXCLUIDO;
	}

	public void setEXCLUIDO(String EXCLUIDO) {
		this.EXCLUIDO = EXCLUIDO;
	}
}
