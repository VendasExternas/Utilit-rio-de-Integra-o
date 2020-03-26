package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.atendimento;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.Localizacao;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.pessoa.Pessoa;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.pessoa.PessoaEndereco;

import java.util.ArrayList;

public class Atendimento implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private Pessoa UNIDADE;
	private TipoAtendimento TIPO_ATENDIMENTO;
	private String SITUACAO;
	private String DATA_ALTERACAO;
	private String DATA_INICIO;
	private String DATA;
	private String DATA_VISUALIZACAO;
	private Pessoa CLIENTE;
	private String CONSUMIDOR_FINAL;
	private Pessoa VENDEDOR;
	private Pessoa INTERMEDIARIO;
	private Pessoa REPRESENTADA;
	private Localizacao LOCALIZACAO;
	private String REFERENCIA;
	private String MOTIVO_CANCELAMENTO;
	private FormaEntrega FORMA_ENTREGA;
	private Pessoa TRANSPORTADORA;
	private String FRETE_MODALIDADE;
	private String FRETE_DATA_SAIDA;
	private String FRETE_VALOR;
	private String TRANSPORTE_VEICULO_PLACA;
	private String TRANSPORTE_VEICULO_ESTADO;
	private PessoaEndereco ENDERECO;
	private String NUMERO_LICITACAO;
	private String DATA_ENTREGA;
	private String VALIDADE_PROPOSTA;
	private String TOTAL_PRODUTOS;
	private String TOTAL_IPI;
	private String TOTAL_ICMS_ST;
	private String TOTAL_DESCONTO_PERCENTUAL;
	private String TOTAL_DESCONTO_VALOR;
	private String TOTAL_ACRESCIMO_VALOR;
	private String TOTAL_BONIFICACAO;
	private String TOTAL_CONSIGNACAO;
	private String TOTAL;
	private String TOTAL_PAGO;
	private String TROCO;
	private String PESO_TOTAL;
	private String FORMATO_IMPRESSAO_PADRAO;
	private RegraNegociacao REGRA_PRECO_GERAL;
	private String ASSINATURA;
	private String TIPO_DOCUMENTO_FISCAL;
	private String TOTAL_COMODATO;
	private String TOTAL_FCP_ST;
	private String ATENDIMENTO_ACERTO_CONSIGNACAO;
	private String TIPO_OPERACAO;
	private AtendimentoTexto TEXTOS;
	private ArrayList<AtendimentoItem> ITENS;
	private ArrayList<AtendimentoPagamento> PAGAMENTOS;

	public Pessoa getUNIDADE() {
		return UNIDADE;
	}

	public void setUNIDADE(Pessoa UNIDADE) {
		this.UNIDADE = UNIDADE;
	}

	public TipoAtendimento getTIPO_ATENDIMENTO() {
		return TIPO_ATENDIMENTO;
	}

	public void setTIPO_ATENDIMENTO(
			TipoAtendimento TIPO_ATENDIMENTO) {
		this.TIPO_ATENDIMENTO = TIPO_ATENDIMENTO;
	}

	public String getSITUACAO() {
		return SITUACAO;
	}

	public void setSITUACAO(String SITUACAO) {
		this.SITUACAO = SITUACAO;
	}

	public String getDATA_ALTERACAO() {
		return DATA_ALTERACAO;
	}

	public void setDATA_ALTERACAO(String DATA_ALTERACAO) {
		this.DATA_ALTERACAO = DATA_ALTERACAO;
	}

	public String getDATA_INICIO() {
		return DATA_INICIO;
	}

	public void setDATA_INICIO(String DATA_INICIO) {
		this.DATA_INICIO = DATA_INICIO;
	}

	public String getDATA() {
		return DATA;
	}

	public void setDATA(String DATA) {
		this.DATA = DATA;
	}

	public String getDATA_VISUALIZACAO() {
		return DATA_VISUALIZACAO;
	}

	public void setDATA_VISUALIZACAO(String DATA_VISUALIZACAO) {
		this.DATA_VISUALIZACAO = DATA_VISUALIZACAO;
	}

	public Pessoa getCLIENTE() {
		return CLIENTE;
	}

	public void setCLIENTE(Pessoa CLIENTE) {
		this.CLIENTE = CLIENTE;
	}

	public String getCONSUMIDOR_FINAL() {
		return CONSUMIDOR_FINAL;
	}

	public void setCONSUMIDOR_FINAL(String CONSUMIDOR_FINAL) {
		this.CONSUMIDOR_FINAL = CONSUMIDOR_FINAL;
	}

	public Pessoa getVENDEDOR() {
		return VENDEDOR;
	}

	public void setVENDEDOR(Pessoa VENDEDOR) {
		this.VENDEDOR = VENDEDOR;
	}

	public Pessoa getINTERMEDIARIO() {
		return INTERMEDIARIO;
	}

	public void setINTERMEDIARIO(Pessoa INTERMEDIARIO) {
		this.INTERMEDIARIO = INTERMEDIARIO;
	}

	public Pessoa getREPRESENTADA() {
		return REPRESENTADA;
	}

	public void setREPRESENTADA(Pessoa REPRESENTADA) {
		this.REPRESENTADA = REPRESENTADA;
	}

	public Localizacao getLOCALIZACAO() {
		return LOCALIZACAO;
	}

	public void setLOCALIZACAO(Localizacao LOCALIZACAO) {
		this.LOCALIZACAO = LOCALIZACAO;
	}

	public String getREFERENCIA() {
		return REFERENCIA;
	}

	public void setREFERENCIA(String REFERENCIA) {
		this.REFERENCIA = REFERENCIA;
	}

	public String getMOTIVO_CANCELAMENTO() {
		return MOTIVO_CANCELAMENTO;
	}

	public void setMOTIVO_CANCELAMENTO(String MOTIVO_CANCELAMENTO) {
		this.MOTIVO_CANCELAMENTO = MOTIVO_CANCELAMENTO;
	}

	public FormaEntrega getFORMA_ENTREGA() {
		return FORMA_ENTREGA;
	}

	public void setFORMA_ENTREGA(
			FormaEntrega FORMA_ENTREGA) {
		this.FORMA_ENTREGA = FORMA_ENTREGA;
	}

	public Pessoa getTRANSPORTADORA() {
		return TRANSPORTADORA;
	}

	public void setTRANSPORTADORA(Pessoa TRANSPORTADORA) {
		this.TRANSPORTADORA = TRANSPORTADORA;
	}

	public String getFRETE_MODALIDADE() {
		return FRETE_MODALIDADE;
	}

	public void setFRETE_MODALIDADE(String FRETE_MODALIDADE) {
		this.FRETE_MODALIDADE = FRETE_MODALIDADE;
	}

	public String getFRETE_DATA_SAIDA() {
		return FRETE_DATA_SAIDA;
	}

	public void setFRETE_DATA_SAIDA(String FRETE_DATA_SAIDA) {
		this.FRETE_DATA_SAIDA = FRETE_DATA_SAIDA;
	}

	public String getFRETE_VALOR() {
		return FRETE_VALOR;
	}

	public void setFRETE_VALOR(String FRETE_VALOR) {
		this.FRETE_VALOR = FRETE_VALOR;
	}

	public String getTRANSPORTE_VEICULO_PLACA() {
		return TRANSPORTE_VEICULO_PLACA;
	}

	public void setTRANSPORTE_VEICULO_PLACA(String TRANSPORTE_VEICULO_PLACA) {
		this.TRANSPORTE_VEICULO_PLACA = TRANSPORTE_VEICULO_PLACA;
	}

	public String getTRANSPORTE_VEICULO_ESTADO() {
		return TRANSPORTE_VEICULO_ESTADO;
	}

	public void setTRANSPORTE_VEICULO_ESTADO(String TRANSPORTE_VEICULO_ESTADO) {
		this.TRANSPORTE_VEICULO_ESTADO = TRANSPORTE_VEICULO_ESTADO;
	}

	public PessoaEndereco getENDERECO() {
		return ENDERECO;
	}

	public void setENDERECO(PessoaEndereco ENDERECO) {
		this.ENDERECO = ENDERECO;
	}

	public String getNUMERO_LICITACAO() {
		return NUMERO_LICITACAO;
	}

	public void setNUMERO_LICITACAO(String NUMERO_LICITACAO) {
		this.NUMERO_LICITACAO = NUMERO_LICITACAO;
	}

	public String getDATA_ENTREGA() {
		return DATA_ENTREGA;
	}

	public void setDATA_ENTREGA(String DATA_ENTREGA) {
		this.DATA_ENTREGA = DATA_ENTREGA;
	}

	public String getVALIDADE_PROPOSTA() {
		return VALIDADE_PROPOSTA;
	}

	public void setVALIDADE_PROPOSTA(String VALIDADE_PROPOSTA) {
		this.VALIDADE_PROPOSTA = VALIDADE_PROPOSTA;
	}

	public String getTOTAL_PRODUTOS() {
		return TOTAL_PRODUTOS;
	}

	public void setTOTAL_PRODUTOS(String TOTAL_PRODUTOS) {
		this.TOTAL_PRODUTOS = TOTAL_PRODUTOS;
	}

	public String getTOTAL_IPI() {
		return TOTAL_IPI;
	}

	public void setTOTAL_IPI(String TOTAL_IPI) {
		this.TOTAL_IPI = TOTAL_IPI;
	}

	public String getTOTAL_ICMS_ST() {
		return TOTAL_ICMS_ST;
	}

	public void setTOTAL_ICMS_ST(String TOTAL_ICMS_ST) {
		this.TOTAL_ICMS_ST = TOTAL_ICMS_ST;
	}

	public String getTOTAL_DESCONTO_PERCENTUAL() {
		return TOTAL_DESCONTO_PERCENTUAL;
	}

	public void setTOTAL_DESCONTO_PERCENTUAL(String TOTAL_DESCONTO_PERCENTUAL) {
		this.TOTAL_DESCONTO_PERCENTUAL = TOTAL_DESCONTO_PERCENTUAL;
	}

	public String getTOTAL_DESCONTO_VALOR() {
		return TOTAL_DESCONTO_VALOR;
	}

	public void setTOTAL_DESCONTO_VALOR(String TOTAL_DESCONTO_VALOR) {
		this.TOTAL_DESCONTO_VALOR = TOTAL_DESCONTO_VALOR;
	}

	public String getTOTAL_ACRESCIMO_VALOR() {
		return TOTAL_ACRESCIMO_VALOR;
	}

	public void setTOTAL_ACRESCIMO_VALOR(String TOTAL_ACRESCIMO_VALOR) {
		this.TOTAL_ACRESCIMO_VALOR = TOTAL_ACRESCIMO_VALOR;
	}

	public String getTOTAL_BONIFICACAO() {
		return TOTAL_BONIFICACAO;
	}

	public void setTOTAL_BONIFICACAO(String TOTAL_BONIFICACAO) {
		this.TOTAL_BONIFICACAO = TOTAL_BONIFICACAO;
	}

	public String getTOTAL_CONSIGNACAO() {
		return TOTAL_CONSIGNACAO;
	}

	public void setTOTAL_CONSIGNACAO(String TOTAL_CONSIGNACAO) {
		this.TOTAL_CONSIGNACAO = TOTAL_CONSIGNACAO;
	}

	public String getTOTAL() {
		return TOTAL;
	}

	public void setTOTAL(String TOTAL) {
		this.TOTAL = TOTAL;
	}

	public String getTOTAL_PAGO() {
		return TOTAL_PAGO;
	}

	public void setTOTAL_PAGO(String TOTAL_PAGO) {
		this.TOTAL_PAGO = TOTAL_PAGO;
	}

	public String getTROCO() {
		return TROCO;
	}

	public void setTROCO(String TROCO) {
		this.TROCO = TROCO;
	}

	public String getPESO_TOTAL() {
		return PESO_TOTAL;
	}

	public void setPESO_TOTAL(String PESO_TOTAL) {
		this.PESO_TOTAL = PESO_TOTAL;
	}

	public String getFORMATO_IMPRESSAO_PADRAO() {
		return FORMATO_IMPRESSAO_PADRAO;
	}

	public void setFORMATO_IMPRESSAO_PADRAO(String FORMATO_IMPRESSAO_PADRAO) {
		this.FORMATO_IMPRESSAO_PADRAO = FORMATO_IMPRESSAO_PADRAO;
	}

	public RegraNegociacao getREGRA_PRECO_GERAL() {
		return REGRA_PRECO_GERAL;
	}

	public void setREGRA_PRECO_GERAL(
			RegraNegociacao REGRA_PRECO_GERAL) {
		this.REGRA_PRECO_GERAL = REGRA_PRECO_GERAL;
	}

	public String getASSINATURA() {
		return ASSINATURA;
	}

	public void setASSINATURA(String ASSINATURA) {
		this.ASSINATURA = ASSINATURA;
	}

	public String getTIPO_DOCUMENTO_FISCAL() {
		return TIPO_DOCUMENTO_FISCAL;
	}

	public void setTIPO_DOCUMENTO_FISCAL(String TIPO_DOCUMENTO_FISCAL) {
		this.TIPO_DOCUMENTO_FISCAL = TIPO_DOCUMENTO_FISCAL;
	}

	public String getTOTAL_COMODATO() {
		return TOTAL_COMODATO;
	}

	public void setTOTAL_COMODATO(String TOTAL_COMODATO) {
		this.TOTAL_COMODATO = TOTAL_COMODATO;
	}

	public String getTOTAL_FCP_ST() {
		return TOTAL_FCP_ST;
	}

	public void setTOTAL_FCP_ST(String TOTAL_FCP_ST) {
		this.TOTAL_FCP_ST = TOTAL_FCP_ST;
	}

	public ArrayList<AtendimentoItem> getITENS() {
		return ITENS;
	}

	public void setITENS(
			ArrayList<AtendimentoItem> ITENS) {
		this.ITENS = ITENS;
	}

	public ArrayList<AtendimentoPagamento> getPAGAMENTOS() {
		return PAGAMENTOS;
	}

	public void setPAGAMENTOS(
			ArrayList<AtendimentoPagamento> PAGAMENTOS) {
		this.PAGAMENTOS = PAGAMENTOS;
	}

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

	public AtendimentoTexto getTEXTOS() {
		return TEXTOS;
	}

	public void setTEXTOS(AtendimentoTexto TEXTOS) {
		this.TEXTOS = TEXTOS;
	}

	public String getATENDIMENTO_ACERTO_CONSIGNACAO() {
		return ATENDIMENTO_ACERTO_CONSIGNACAO;
	}

	public void setATENDIMENTO_ACERTO_CONSIGNACAO(String ATENDIMENTO_ACERTO_CONSIGNACAO) {
		this.ATENDIMENTO_ACERTO_CONSIGNACAO = ATENDIMENTO_ACERTO_CONSIGNACAO;
	}

	public String getTIPO_OPERACAO() {
		return TIPO_OPERACAO;
	}

	public void setTIPO_OPERACAO(String TIPO_OPERACAO) {
		this.TIPO_OPERACAO = TIPO_OPERACAO;
	}
}
