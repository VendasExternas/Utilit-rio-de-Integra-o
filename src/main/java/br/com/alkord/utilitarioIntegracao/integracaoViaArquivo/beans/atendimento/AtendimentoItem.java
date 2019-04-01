package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.atendimento;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.pessoa.Pessoa;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.produto.Produto;

public class AtendimentoItem implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private Pessoa UNIDADE;
	private Produto PRODUTO;
	private String ITEM;
	private String GRADE;
	private String PESO;
	private String QUANTIDADE;
	private String QUANTIDADE_RESERVA;
	private String QUANTIDADE_ATENDIDA;
	private String VALOR_UNITARIO;
	private String DESCONTO_PERCENTUAL;
	private String DESCONTO_VALOR;
	private String CONTA_CORRENTE;
	private String ACRESCIMO_PERCENTUAL;
	private String ACRESCIMO_VALOR;
	private String VALOR_TOTAL;
	private String VALOR_IPI;
	private String VALOR_ICMS_ST;
	private String RESERVAR;
	private String OBSERVACAO;
	private Pessoa VENDEDOR;
	private RegraNegociacao REGRA_PRECIFICACAO;
	private Pessoa USUARIO_AUTORIZACAO;
	private Pessoa USUARIO_AUTORIZACAO_ESTOQUE;
	private String OPERACAO_FISCAL;
	private String EXCLUIDO;
	private String DATA_ALTERACAO;
	private String CFOP;
	private RegraComissionamento COMISSAO_REGRA;
	private String COMISSAO_VALOR;
	private String VALOR_FCP_ST;

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

	public Produto getPRODUTO() {
		return PRODUTO;
	}

	public void setPRODUTO(Produto PRODUTO) {
		this.PRODUTO = PRODUTO;
	}

	public String getGRADE() {
		return GRADE;
	}

	public void setGRADE(String GRADE) {
		this.GRADE = GRADE;
	}

	public String getPESO() {
		return PESO;
	}

	public void setPESO(String PESO) {
		this.PESO = PESO;
	}

	public String getQUANTIDADE() {
		return QUANTIDADE;
	}

	public void setQUANTIDADE(String QUANTIDADE) {
		this.QUANTIDADE = QUANTIDADE;
	}

	public String getQUANTIDADE_RESERVA() {
		return QUANTIDADE_RESERVA;
	}

	public void setQUANTIDADE_RESERVA(String QUANTIDADE_RESERVA) {
		this.QUANTIDADE_RESERVA = QUANTIDADE_RESERVA;
	}

	public String getQUANTIDADE_ATENDIDA() {
		return QUANTIDADE_ATENDIDA;
	}

	public void setQUANTIDADE_ATENDIDA(String QUANTIDADE_ATENDIDA) {
		this.QUANTIDADE_ATENDIDA = QUANTIDADE_ATENDIDA;
	}

	public String getVALOR_UNITARIO() {
		return VALOR_UNITARIO;
	}

	public void setVALOR_UNITARIO(String VALOR_UNITARIO) {
		this.VALOR_UNITARIO = VALOR_UNITARIO;
	}

	public String getDESCONTO_PERCENTUAL() {
		return DESCONTO_PERCENTUAL;
	}

	public void setDESCONTO_PERCENTUAL(String DESCONTO_PERCENTUAL) {
		this.DESCONTO_PERCENTUAL = DESCONTO_PERCENTUAL;
	}

	public String getDESCONTO_VALOR() {
		return DESCONTO_VALOR;
	}

	public void setDESCONTO_VALOR(String DESCONTO_VALOR) {
		this.DESCONTO_VALOR = DESCONTO_VALOR;
	}

	public String getCONTA_CORRENTE() {
		return CONTA_CORRENTE;
	}

	public void setCONTA_CORRENTE(String CONTA_CORRENTE) {
		this.CONTA_CORRENTE = CONTA_CORRENTE;
	}

	public String getACRESCIMO_PERCENTUAL() {
		return ACRESCIMO_PERCENTUAL;
	}

	public void setACRESCIMO_PERCENTUAL(String ACRESCIMO_PERCENTUAL) {
		this.ACRESCIMO_PERCENTUAL = ACRESCIMO_PERCENTUAL;
	}

	public String getACRESCIMO_VALOR() {
		return ACRESCIMO_VALOR;
	}

	public void setACRESCIMO_VALOR(String ACRESCIMO_VALOR) {
		this.ACRESCIMO_VALOR = ACRESCIMO_VALOR;
	}

	public String getVALOR_TOTAL() {
		return VALOR_TOTAL;
	}

	public void setVALOR_TOTAL(String VALOR_TOTAL) {
		this.VALOR_TOTAL = VALOR_TOTAL;
	}

	public String getVALOR_IPI() {
		return VALOR_IPI;
	}

	public void setVALOR_IPI(String VALOR_IPI) {
		this.VALOR_IPI = VALOR_IPI;
	}

	public String getVALOR_ICMS_ST() {
		return VALOR_ICMS_ST;
	}

	public void setVALOR_ICMS_ST(String VALOR_ICMS_ST) {
		this.VALOR_ICMS_ST = VALOR_ICMS_ST;
	}

	public String getRESERVAR() {
		return RESERVAR;
	}

	public void setRESERVAR(String RESERVAR) {
		this.RESERVAR = RESERVAR;
	}

	public String getOBSERVACAO() {
		return OBSERVACAO;
	}

	public void setOBSERVACAO(String OBSERVACAO) {
		this.OBSERVACAO = OBSERVACAO;
	}

	public Pessoa getVENDEDOR() {
		return VENDEDOR;
	}

	public void setVENDEDOR(Pessoa VENDEDOR) {
		this.VENDEDOR = VENDEDOR;
	}

	public RegraNegociacao getREGRA_PRECIFICACAO() {
		return REGRA_PRECIFICACAO;
	}

	public void setREGRA_PRECIFICACAO(
			RegraNegociacao REGRA_PRECIFICACAO) {
		this.REGRA_PRECIFICACAO = REGRA_PRECIFICACAO;
	}

	public Pessoa getUSUARIO_AUTORIZACAO() {
		return USUARIO_AUTORIZACAO;
	}

	public void setUSUARIO_AUTORIZACAO(
			Pessoa USUARIO_AUTORIZACAO) {
		this.USUARIO_AUTORIZACAO = USUARIO_AUTORIZACAO;
	}

	public Pessoa getUSUARIO_AUTORIZACAO_ESTOQUE() {
		return USUARIO_AUTORIZACAO_ESTOQUE;
	}

	public void setUSUARIO_AUTORIZACAO_ESTOQUE(
			Pessoa USUARIO_AUTORIZACAO_ESTOQUE) {
		this.USUARIO_AUTORIZACAO_ESTOQUE = USUARIO_AUTORIZACAO_ESTOQUE;
	}

	public String getOPERACAO_FISCAL() {
		return OPERACAO_FISCAL;
	}

	public void setOPERACAO_FISCAL(String OPERACAO_FISCAL) {
		this.OPERACAO_FISCAL = OPERACAO_FISCAL;
	}

	public String getEXCLUIDO() {
		return EXCLUIDO;
	}

	public void setEXCLUIDO(String EXCLUIDO) {
		this.EXCLUIDO = EXCLUIDO;
	}

	public String getDATA_ALTERACAO() {
		return DATA_ALTERACAO;
	}

	public void setDATA_ALTERACAO(String DATA_ALTERACAO) {
		this.DATA_ALTERACAO = DATA_ALTERACAO;
	}

	public String getCFOP() {
		return CFOP;
	}

	public void setCFOP(String CFOP) {
		this.CFOP = CFOP;
	}

	public RegraComissionamento getCOMISSAO_REGRA() {
		return COMISSAO_REGRA;
	}

	public void setCOMISSAO_REGRA(
			RegraComissionamento COMISSAO_REGRA) {
		this.COMISSAO_REGRA = COMISSAO_REGRA;
	}

	public String getCOMISSAO_VALOR() {
		return COMISSAO_VALOR;
	}

	public void setCOMISSAO_VALOR(String COMISSAO_VALOR) {
		this.COMISSAO_VALOR = COMISSAO_VALOR;
	}

	public String getVALOR_FCP_ST() {
		return VALOR_FCP_ST;
	}

	public void setVALOR_FCP_ST(String VALOR_FCP_ST) {
		this.VALOR_FCP_ST = VALOR_FCP_ST;
	}

	public String getITEM() {
		return ITEM;
	}

	public void setITEM(String ITEM) {
		this.ITEM = ITEM;
	}
}
