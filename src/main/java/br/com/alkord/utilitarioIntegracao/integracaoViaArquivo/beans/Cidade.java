package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans;

import org.apache.commons.lang3.StringUtils;

public class Cidade {

	private Estado ESTADO;
	private String NOME;
	private String CODIGO_IBGE;

	public Estado getESTADO() {
		return ESTADO;
	}

	public void setESTADO(Estado ESTADO) {
		this.ESTADO = ESTADO;
	}

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String NOME) {
		if (!StringUtils.isBlank(NOME) && NOME.startsWith("\"") && NOME.endsWith("\""))
			NOME = StringUtils.substringBetween(NOME, "\"", "\"");

		this.NOME = NOME;
	}

	public String getCODIGO_IBGE() {
		return CODIGO_IBGE;
	}

	public void setCODIGO_IBGE(String CODIGO_IBGE) {
		this.CODIGO_IBGE = CODIGO_IBGE;
	}
}
