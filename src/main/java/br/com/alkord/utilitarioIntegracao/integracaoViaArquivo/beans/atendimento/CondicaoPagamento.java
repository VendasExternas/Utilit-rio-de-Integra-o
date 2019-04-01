package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.atendimento;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;

import java.util.ArrayList;

public class CondicaoPagamento implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private String OPERACAO;
	private String NOME;
	private String VALOR_MINIMO;
	private String EXCLUIDO;
	private ArrayList<CondicaoPagamentoParcela> PARCELAS;

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

	public String getOPERACAO() {
		return OPERACAO;
	}

	public void setOPERACAO(String OPERACAO) {
		this.OPERACAO = OPERACAO;
	}

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String NOME) {
		this.NOME = NOME;
	}

	public String getVALOR_MINIMO() {
		return VALOR_MINIMO;
	}

	public void setVALOR_MINIMO(String VALOR_MINIMO) {
		this.VALOR_MINIMO = VALOR_MINIMO;
	}

	public String getEXCLUIDO() {
		return EXCLUIDO;
	}

	public void setEXCLUIDO(String EXCLUIDO) {
		this.EXCLUIDO = EXCLUIDO;
	}

	public ArrayList<CondicaoPagamentoParcela> getPARCELAS() {
		return PARCELAS;
	}

	public void setPARCELAS(
			ArrayList<CondicaoPagamentoParcela> PARCELAS) {
		this.PARCELAS = PARCELAS;
	}
}
