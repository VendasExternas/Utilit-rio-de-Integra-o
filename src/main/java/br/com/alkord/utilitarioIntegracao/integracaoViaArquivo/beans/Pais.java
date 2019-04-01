package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans;

import org.apache.commons.lang3.StringUtils;

public class Pais {

	private String NOME;
	private String SIGLA;
	private String CODIGO_BACEN;

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

	public String getCODIGO_BACEN() {
		return CODIGO_BACEN;
	}

	public void setCODIGO_BACEN(String CODIGO_BACEN) {
		this.CODIGO_BACEN = CODIGO_BACEN;
	}
}
