package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.atendimento;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.pessoa.Pessoa;

public class Boleto implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private Atendimento ATENDIMENTO;
	private AtendimentoPagamento PAGAMENTO;
	private Banco BANCO;
	private String AGENCIA;
	private String AGENCIA_DIGITO;
	private String CONTA;
	private String CONTA_DIGITO;
	private String CEDENTE;
	private String CEDENTE_DIGITO;
	private String CARTEIRA;
	private String CARTEIRA_VARIACAO;
	private Pessoa BENEFICIARIO;
	private String INFORMACOES_CLIENTE;
	private String INSTRUCOES_CAIXA;
	private String PRIMEIRA_INSTRUCAO;
	private String PERCENTUAL_MORA;
	private String PERCENTUAL_MULTA;
	private String VENCIMENTO;
	private String PROCESSAMENTO;
	private String VALOR;
	private String NOSSO_NUMERO;
	private String NUMERO_DOCUMENTO;
	private String CODIGO_BANCO;
	private String LINHA_DIGITAVEL;
	private String CODIGO_BARRAS;
	private String REMESSA;
	private String VALOR_PAGO;
	private String DATA_PAGAMENTO;
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

	public Banco getBANCO() {
		return BANCO;
	}

	public void setBANCO(Banco BANCO) {
		this.BANCO = BANCO;
	}

	public String getAGENCIA() {
		return AGENCIA;
	}

	public void setAGENCIA(String AGENCIA) {
		this.AGENCIA = AGENCIA;
	}

	public String getAGENCIA_DIGITO() {
		return AGENCIA_DIGITO;
	}

	public void setAGENCIA_DIGITO(String AGENCIA_DIGITO) {
		this.AGENCIA_DIGITO = AGENCIA_DIGITO;
	}

	public String getCONTA() {
		return CONTA;
	}

	public void setCONTA(String CONTA) {
		this.CONTA = CONTA;
	}

	public String getCONTA_DIGITO() {
		return CONTA_DIGITO;
	}

	public void setCONTA_DIGITO(String CONTA_DIGITO) {
		this.CONTA_DIGITO = CONTA_DIGITO;
	}

	public String getCEDENTE() {
		return CEDENTE;
	}

	public void setCEDENTE(String CEDENTE) {
		this.CEDENTE = CEDENTE;
	}

	public String getCEDENTE_DIGITO() {
		return CEDENTE_DIGITO;
	}

	public void setCEDENTE_DIGITO(String CEDENTE_DIGITO) {
		this.CEDENTE_DIGITO = CEDENTE_DIGITO;
	}

	public String getCARTEIRA() {
		return CARTEIRA;
	}

	public void setCARTEIRA(String CARTEIRA) {
		this.CARTEIRA = CARTEIRA;
	}

	public String getCARTEIRA_VARIACAO() {
		return CARTEIRA_VARIACAO;
	}

	public void setCARTEIRA_VARIACAO(String CARTEIRA_VARIACAO) {
		this.CARTEIRA_VARIACAO = CARTEIRA_VARIACAO;
	}

	public Pessoa getBENEFICIARIO() {
		return BENEFICIARIO;
	}

	public void setBENEFICIARIO(Pessoa BENEFICIARIO) {
		this.BENEFICIARIO = BENEFICIARIO;
	}

	public String getINFORMACOES_CLIENTE() {
		return INFORMACOES_CLIENTE;
	}

	public void setINFORMACOES_CLIENTE(String INFORMACOES_CLIENTE) {
		this.INFORMACOES_CLIENTE = INFORMACOES_CLIENTE;
	}

	public String getINSTRUCOES_CAIXA() {
		return INSTRUCOES_CAIXA;
	}

	public void setINSTRUCOES_CAIXA(String INSTRUCOES_CAIXA) {
		this.INSTRUCOES_CAIXA = INSTRUCOES_CAIXA;
	}

	public String getPRIMEIRA_INSTRUCAO() {
		return PRIMEIRA_INSTRUCAO;
	}

	public void setPRIMEIRA_INSTRUCAO(String PRIMEIRA_INSTRUCAO) {
		this.PRIMEIRA_INSTRUCAO = PRIMEIRA_INSTRUCAO;
	}

	public String getPERCENTUAL_MORA() {
		return PERCENTUAL_MORA;
	}

	public void setPERCENTUAL_MORA(String PERCENTUAL_MORA) {
		this.PERCENTUAL_MORA = PERCENTUAL_MORA;
	}

	public String getPERCENTUAL_MULTA() {
		return PERCENTUAL_MULTA;
	}

	public void setPERCENTUAL_MULTA(String PERCENTUAL_MULTA) {
		this.PERCENTUAL_MULTA = PERCENTUAL_MULTA;
	}

	public String getVENCIMENTO() {
		return VENCIMENTO;
	}

	public void setVENCIMENTO(String VENCIMENTO) {
		this.VENCIMENTO = VENCIMENTO;
	}

	public String getPROCESSAMENTO() {
		return PROCESSAMENTO;
	}

	public void setPROCESSAMENTO(String PROCESSAMENTO) {
		this.PROCESSAMENTO = PROCESSAMENTO;
	}

	public String getVALOR() {
		return VALOR;
	}

	public void setVALOR(String VALOR) {
		this.VALOR = VALOR;
	}

	public String getNOSSO_NUMERO() {
		return NOSSO_NUMERO;
	}

	public void setNOSSO_NUMERO(String NOSSO_NUMERO) {
		this.NOSSO_NUMERO = NOSSO_NUMERO;
	}

	public String getNUMERO_DOCUMENTO() {
		return NUMERO_DOCUMENTO;
	}

	public void setNUMERO_DOCUMENTO(String NUMERO_DOCUMENTO) {
		this.NUMERO_DOCUMENTO = NUMERO_DOCUMENTO;
	}

	public String getCODIGO_BANCO() {
		return CODIGO_BANCO;
	}

	public void setCODIGO_BANCO(String CODIGO_BANCO) {
		this.CODIGO_BANCO = CODIGO_BANCO;
	}

	public String getLINHA_DIGITAVEL() {
		return LINHA_DIGITAVEL;
	}

	public void setLINHA_DIGITAVEL(String LINHA_DIGITAVEL) {
		this.LINHA_DIGITAVEL = LINHA_DIGITAVEL;
	}

	public String getCODIGO_BARRAS() {
		return CODIGO_BARRAS;
	}

	public void setCODIGO_BARRAS(String CODIGO_BARRAS) {
		this.CODIGO_BARRAS = CODIGO_BARRAS;
	}

	public String getREMESSA() {
		return REMESSA;
	}

	public void setREMESSA(String REMESSA) {
		this.REMESSA = REMESSA;
	}

	public String getVALOR_PAGO() {
		return VALOR_PAGO;
	}

	public void setVALOR_PAGO(String VALOR_PAGO) {
		this.VALOR_PAGO = VALOR_PAGO;
	}

	public String getDATA_PAGAMENTO() {
		return DATA_PAGAMENTO;
	}

	public void setDATA_PAGAMENTO(String DATA_PAGAMENTO) {
		this.DATA_PAGAMENTO = DATA_PAGAMENTO;
	}

	public String getEXCLUIDO() {
		return EXCLUIDO;
	}

	public void setEXCLUIDO(String EXCLUIDO) {
		this.EXCLUIDO = EXCLUIDO;
	}
}
