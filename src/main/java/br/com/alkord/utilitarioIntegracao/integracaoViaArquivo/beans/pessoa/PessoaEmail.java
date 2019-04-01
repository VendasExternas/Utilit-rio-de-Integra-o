package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.pessoa;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;

public class PessoaEmail implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private Pessoa CONTATO;
	private Pessoa PESSOA;
	private String EMAIL;
	private String PRINCIPAL;
	private String EXCLUSIVO;
	private String PADRAO_NFE;
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

	public Pessoa getCONTATO() {
		return CONTATO;
	}

	public void setCONTATO(Pessoa CONTATO) {
		this.CONTATO = CONTATO;
	}

	public Pessoa getPESSOA() {
		return PESSOA;
	}

	public void setPESSOA(Pessoa PESSOA) {
		this.PESSOA = PESSOA;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}

	public String getPRINCIPAL() {
		return PRINCIPAL;
	}

	public void setPRINCIPAL(String PRINCIPAL) {
		this.PRINCIPAL = PRINCIPAL;
	}

	public String getEXCLUSIVO() {
		return EXCLUSIVO;
	}

	public void setEXCLUSIVO(String EXCLUSIVO) {
		this.EXCLUSIVO = EXCLUSIVO;
	}

	public String getPADRAO_NFE() {
		return PADRAO_NFE;
	}

	public void setPADRAO_NFE(String PADRAO_NFE) {
		this.PADRAO_NFE = PADRAO_NFE;
	}

	public String getEXCLUIDO() {
		return EXCLUIDO;
	}

	public void setEXCLUIDO(String EXCLUIDO) {
		this.EXCLUIDO = EXCLUIDO;
	}
}
