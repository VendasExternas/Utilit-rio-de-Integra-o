package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.pessoa;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.atendimento.CondicaoPagamento;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.atendimento.MeioPagamento;

public class PessoaComercialVenda {

	private Pessoa REPRESENTANTE;
	private CondicaoPagamento CONDICAO_PAGAMENTO;
	private MeioPagamento MEIO_PAGAMENTO;
	private Pessoa TRANSPORTADORA;
	private String DESCONTO_MAXIMO;
	private String LIMITE_CREDITO;
	private String CREDITO_UTILIZADO;
	private String PERFIL;
	private String PERFIL_RESTRICAO;
	private String META_COMPRA;
	private String SITUACAO_CADASTRO;

	public Pessoa getREPRESENTANTE() {
		return REPRESENTANTE;
	}

	public void setREPRESENTANTE(Pessoa REPRESENTANTE) {
		this.REPRESENTANTE = REPRESENTANTE;
	}

	public CondicaoPagamento getCONDICAO_PAGAMENTO() {
		return CONDICAO_PAGAMENTO;
	}

	public void setCONDICAO_PAGAMENTO(CondicaoPagamento CONDICAO_PAGAMENTO) {
		this.CONDICAO_PAGAMENTO = CONDICAO_PAGAMENTO;
	}

	public MeioPagamento getMEIO_PAGAMENTO() {
		return MEIO_PAGAMENTO;
	}

	public void setMEIO_PAGAMENTO(MeioPagamento MEIO_PAGAMENTO) {
		this.MEIO_PAGAMENTO = MEIO_PAGAMENTO;
	}

	public Pessoa getTRANSPORTADORA() {
		return TRANSPORTADORA;
	}

	public void setTRANSPORTADORA(Pessoa TRANSPORTADORA) {
		this.TRANSPORTADORA = TRANSPORTADORA;
	}

	public String getDESCONTO_MAXIMO() {
		return DESCONTO_MAXIMO;
	}

	public void setDESCONTO_MAXIMO(String DESCONTO_MAXIMO) {
		this.DESCONTO_MAXIMO = DESCONTO_MAXIMO;
	}

	public String getLIMITE_CREDITO() {
		return LIMITE_CREDITO;
	}

	public void setLIMITE_CREDITO(String LIMITE_CREDITO) {
		this.LIMITE_CREDITO = LIMITE_CREDITO;
	}

	public String getCREDITO_UTILIZADO() {
		return CREDITO_UTILIZADO;
	}

	public void setCREDITO_UTILIZADO(String CREDITO_UTILIZADO) {
		this.CREDITO_UTILIZADO = CREDITO_UTILIZADO;
	}

	public String getPERFIL() {
		return PERFIL;
	}

	public void setPERFIL(String PERFIL) {
		this.PERFIL = PERFIL;
	}

	public String getPERFIL_RESTRICAO() {
		return PERFIL_RESTRICAO;
	}

	public void setPERFIL_RESTRICAO(String PERFIL_RESTRICAO) {
		this.PERFIL_RESTRICAO = PERFIL_RESTRICAO;
	}

	public String getMETA_COMPRA() {
		return META_COMPRA;
	}

	public void setMETA_COMPRA(String META_COMPRA) {
		this.META_COMPRA = META_COMPRA;
	}

	public String getSITUACAO_CADASTRO() {
		return SITUACAO_CADASTRO;
	}

	public void setSITUACAO_CADASTRO(String SITUACAO_CADASTRO) {
		this.SITUACAO_CADASTRO = SITUACAO_CADASTRO;
	}
}
