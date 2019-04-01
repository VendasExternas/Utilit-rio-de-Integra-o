package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.atendimento;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.pessoa.Pessoa;

import java.util.ArrayList;

public class AtendimentoPagamento implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private Pessoa UNIDADE;
	private MeioPagamento MEIO_PAGAMENTO;
	private CondicaoPagamento CONDICAO_PAGAMENTO;
	private String EXTRA;
	private String VALOR;
	private String CARTAO_DESCONTO_PREMIADO;
	private String EXCLUIDO;
	private ArrayList<Boleto> BOLETOS;
	private ArrayList<PagamentoParcela> PARCELAS;

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

	public Pessoa getUNIDADE() {
		return UNIDADE;
	}

	public void setUNIDADE(Pessoa UNIDADE) {
		this.UNIDADE = UNIDADE;
	}

	public MeioPagamento getMEIO_PAGAMENTO() {
		return MEIO_PAGAMENTO;
	}

	public void setMEIO_PAGAMENTO(
			MeioPagamento MEIO_PAGAMENTO) {
		this.MEIO_PAGAMENTO = MEIO_PAGAMENTO;
	}

	public CondicaoPagamento getCONDICAO_PAGAMENTO() {
		return CONDICAO_PAGAMENTO;
	}

	public void setCONDICAO_PAGAMENTO(
			CondicaoPagamento CONDICAO_PAGAMENTO) {
		this.CONDICAO_PAGAMENTO = CONDICAO_PAGAMENTO;
	}

	public String getEXTRA() {
		return EXTRA;
	}

	public void setEXTRA(String EXTRA) {
		this.EXTRA = EXTRA;
	}

	public String getVALOR() {
		return VALOR;
	}

	public void setVALOR(String VALOR) {
		this.VALOR = VALOR;
	}

	public String getCARTAO_DESCONTO_PREMIADO() {
		return CARTAO_DESCONTO_PREMIADO;
	}

	public void setCARTAO_DESCONTO_PREMIADO(String CARTAO_DESCONTO_PREMIADO) {
		this.CARTAO_DESCONTO_PREMIADO = CARTAO_DESCONTO_PREMIADO;
	}

	public String getEXCLUIDO() {
		return EXCLUIDO;
	}

	public void setEXCLUIDO(String EXCLUIDO) {
		this.EXCLUIDO = EXCLUIDO;
	}

	public ArrayList<Boleto> getBOLETOS() {
		return BOLETOS;
	}

	public void setBOLETOS(
			ArrayList<Boleto> BOLETOS) {
		this.BOLETOS = BOLETOS;
	}

	public ArrayList<PagamentoParcela> getPARCELAS() {
		return PARCELAS;
	}

	public void setPARCELAS(
			ArrayList<PagamentoParcela> PARCELAS) {
		this.PARCELAS = PARCELAS;
	}
}
