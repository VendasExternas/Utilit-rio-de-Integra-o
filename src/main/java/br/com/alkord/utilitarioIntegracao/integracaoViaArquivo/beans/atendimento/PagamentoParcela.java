package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.atendimento;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;

public class PagamentoParcela implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private Atendimento ATENDIMENTO;
	private AtendimentoPagamento PAGAMENTO;
	private CondicaoPagamentoParcela PARCELA;
	private String VENCIMENTO;
	private String DATA_PAGAMENTO;
	private String VALOR;
	private String VALOR_PAGO;
	private String AMORTIZACAO_PENDENTE;

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

	public Atendimento getATENDIMENTO() {
		return ATENDIMENTO;
	}

	public void setATENDIMENTO(Atendimento ATENDIMENTO) {
		this.ATENDIMENTO = ATENDIMENTO;
	}

	public AtendimentoPagamento getPAGAMENTO() {
		return PAGAMENTO;
	}

	public void setPAGAMENTO(
			AtendimentoPagamento PAGAMENTO) {
		this.PAGAMENTO = PAGAMENTO;
	}

	public CondicaoPagamentoParcela getPARCELA() {
		return PARCELA;
	}

	public void setPARCELA(CondicaoPagamentoParcela PARCELA) {
		this.PARCELA = PARCELA;
	}

	public String getVENCIMENTO() {
		return VENCIMENTO;
	}

	public void setVENCIMENTO(String VENCIMENTO) {
		this.VENCIMENTO = VENCIMENTO;
	}

	public String getDATA_PAGAMENTO() {
		return DATA_PAGAMENTO;
	}

	public void setDATA_PAGAMENTO(String DATA_PAGAMENTO) {
		this.DATA_PAGAMENTO = DATA_PAGAMENTO;
	}

	public String getVALOR() {
		return VALOR;
	}

	public void setVALOR(String VALOR) {
		this.VALOR = VALOR;
	}

	public String getVALOR_PAGO() {
		return VALOR_PAGO;
	}

	public void setVALOR_PAGO(String VALOR_PAGO) {
		this.VALOR_PAGO = VALOR_PAGO;
	}

	public String getAMORTIZACAO_PENDENTE() {
		return AMORTIZACAO_PENDENTE;
	}

	public void setAMORTIZACAO_PENDENTE(String AMORTIZACAO_PENDENTE) {
		this.AMORTIZACAO_PENDENTE = AMORTIZACAO_PENDENTE;
	}
}
