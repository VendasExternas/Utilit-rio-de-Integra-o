package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.pessoa;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;
import org.apache.commons.lang3.StringUtils;

public class PessoaTelefone implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private Pessoa CONTATO;
	private String TIPO = "L";
	private String PRINCIPAL;
	private String DDI = "55";
	private String DDD = "";
	private String TELEFONE;
	private String RAMAL;
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

	public String getTIPO() {
		return TIPO;
	}

	public void setTIPO(String TIPO) {
		this.TIPO = TIPO;
	}

	public String getPRINCIPAL() {
		return PRINCIPAL;
	}

	public void setPRINCIPAL(String PRINCIPAL) {
		this.PRINCIPAL = PRINCIPAL;
	}

	public String getDDI() {
		return DDI;
	}

	public void setDDI(String DDI) {
		this.DDI = DDI;
	}

	public String getDDD() {
		return DDD;
	}

	public void setDDD(String DDD) {
		this.DDD = DDD;
	}

	public String getTELEFONE() {
		return TELEFONE;
	}

	public void setTELEFONE(String TELEFONE) {
		if (!StringUtils.isBlank(TELEFONE)) {
			String ddd = StringUtils.substringBetween(TELEFONE, "(", ")");

			if (!StringUtils.isBlank(ddd)) {
				if (StringUtils.isBlank(this.DDD))
					this.DDD = ddd.trim().equals("0") ? "00" : ddd.trim();

				TELEFONE = TELEFONE.replace("(" + ddd + ")", "");
			}

			if (StringUtils.isBlank(DDI)) {
				if (TELEFONE.startsWith("+")) {
					DDI = TELEFONE.substring(1, 3);
					TELEFONE = TELEFONE.replace("+" + DDI, "");
				}
			}
		}

		this.TELEFONE = TELEFONE;
	}

	public String getRAMAL() {
		return RAMAL;
	}

	public void setRAMAL(String RAMAL) {
		this.RAMAL = RAMAL;
	}

	public String getEXCLUIDO() {
		return EXCLUIDO;
	}

	public void setEXCLUIDO(String EXCLUIDO) {
		this.EXCLUIDO = EXCLUIDO;
	}
}
