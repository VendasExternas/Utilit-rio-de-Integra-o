package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.produto;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;

public class UnidadeMedida implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private String NOME;
	private String SIGLA;
	private String QUANTIDADE_FRACIONADA;
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

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String NOME) {
		this.NOME = NOME;
	}

	public String getSIGLA() {
		return SIGLA;
	}

	public void setSIGLA(String SIGLA) {
		this.SIGLA = SIGLA;
	}

	public String getQUANTIDADE_FRACIONADA() {
		return QUANTIDADE_FRACIONADA;
	}

	public void setQUANTIDADE_FRACIONADA(String QUANTIDADE_FRACIONADA) {
		this.QUANTIDADE_FRACIONADA = QUANTIDADE_FRACIONADA;
	}

	public String getEXCLUIDO() {
		return EXCLUIDO;
	}

	public void setEXCLUIDO(String EXCLUIDO) {
		this.EXCLUIDO = EXCLUIDO;
	}
}
