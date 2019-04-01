package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans;

import org.apache.commons.lang3.StringUtils;

public class Estado {

	private String NOME;
	private String SIGLA;
	private String CODIGO_IBGE;

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String NOME) {
		if (!StringUtils.isBlank(NOME) && NOME.startsWith("\"") && NOME.endsWith("\""))
			NOME = StringUtils.substringBetween(NOME, "\"", "\"");

		this.NOME = NOME;
	}

	public String getSIGLA() {
		return SIGLA;
	}

	public void setSIGLA(String SIGLA) {
		this.SIGLA = SIGLA;
	}

	public String getCODIGO_IBGE() {
		return CODIGO_IBGE;
	}

	public void setCODIGO_IBGE(String CODIGO_IBGE) {
		this.CODIGO_IBGE = CODIGO_IBGE;
	}
}
