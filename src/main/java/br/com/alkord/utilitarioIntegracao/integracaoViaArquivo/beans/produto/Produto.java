package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.produto;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.pessoa.Pessoa;

import java.util.ArrayList;

public class Produto implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private String CODIGO_BARRAS;
	private String NOME;
	private String FABRICACAO_PROPRIA;
	private String ORIGEM;
	private String CEST;
	private String DISPONIBILIDADE;
	private String FATOR_CONVERSAO;
	private String EXCLUIDO;
	private String NCM;
	private Categoria CATEGORIA;
	private Pessoa FABRICANTE;
	private UnidadeMedida UNIDADE_MEDIDA_VENDA;
	private UnidadeMedida UNIDADE_MEDIDA_COMPRA;
	private ProdutoLivro LIVRO;
	private ProdutoTexto TEXTOS;
	private ProdutoTributario TRIBUTARIOS;
	private ArrayList<ProdutoEstoque> ESTOQUES;
	private ArrayList<ProdutoTributarioICMS> TRIBUTARIOS_ICMS;
	private ArrayList<ProdutoPreco> PRECOS;
	private ArrayList<ProdutoFornecedor> FORNECEDORES;
	private ArrayList<ProdutoLink> LINKS;
	private ProdutoInformacoesAdicionais INFORMACOES_ADICIONAIS;
	private ArrayList<ProdutoPessoa> PESSOAS;

	public String getNCM() {
		return NCM;
	}

	public void setNCM(String NCM) {
		this.NCM = NCM;
	}

	public String getEXCLUIDO() {
		return EXCLUIDO;
	}

	public void setEXCLUIDO(String EXCLUIDO) {
		this.EXCLUIDO = EXCLUIDO;
	}

	public String getDISPONIBILIDADE() {
		return DISPONIBILIDADE;
	}

	public void setDISPONIBILIDADE(String DISPONIBILIDADE) {
		this.DISPONIBILIDADE = DISPONIBILIDADE;
	}

	public String getFATOR_CONVERSAO() {
		return FATOR_CONVERSAO;
	}

	public void setFATOR_CONVERSAO(String FATOR_CONVERSAO) {
		this.FATOR_CONVERSAO = FATOR_CONVERSAO;
	}

	public ArrayList<ProdutoLink> getLINKS() {
		return LINKS;
	}

	public void setLINKS(ArrayList<ProdutoLink> LINKS) {
		this.LINKS = LINKS;
	}

	public ArrayList<ProdutoPessoa> getPESSOAS() {
		return PESSOAS;
	}

	public void setPESSOAS(ArrayList<ProdutoPessoa> PESSOAS) {
		this.PESSOAS = PESSOAS;
	}

	public UnidadeMedida getUNIDADE_MEDIDA_COMPRA() {
		return UNIDADE_MEDIDA_COMPRA;
	}

	public void setUNIDADE_MEDIDA_COMPRA(UnidadeMedida UNIDADE_MEDIDA_COMPRA) {
		this.UNIDADE_MEDIDA_COMPRA = UNIDADE_MEDIDA_COMPRA;
	}

	public ArrayList<ProdutoTributarioICMS> getTRIBUTARIOS_ICMS() {
		return TRIBUTARIOS_ICMS;
	}

	public void setTRIBUTARIOS_ICMS(
			ArrayList<ProdutoTributarioICMS> TRIBUTARIOS_ICMS) {
		this.TRIBUTARIOS_ICMS = TRIBUTARIOS_ICMS;
	}

	@Override
	public String getCODIGO() {
		return CODIGO;
	}

	public void setCODIGO(String CODIGO) {
		this.CODIGO = CODIGO;
	}

	public Categoria getCATEGORIA() {
		return CATEGORIA;
	}

	public void setCATEGORIA(Categoria CATEGORIA) {
		this.CATEGORIA = CATEGORIA;
	}

	public Pessoa getFABRICANTE() {
		return FABRICANTE;
	}

	public void setFABRICANTE(Pessoa FABRICANTE) {
		this.FABRICANTE = FABRICANTE;
	}

	public String getCODIGO_BARRAS() {
		return CODIGO_BARRAS;
	}

	public void setCODIGO_BARRAS(String CODIGO_BARRAS) {
		this.CODIGO_BARRAS = CODIGO_BARRAS;
	}

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String NOME) {
		this.NOME = NOME;
	}

	public String getFABRICACAO_PROPRIA() {
		return FABRICACAO_PROPRIA;
	}

	public void setFABRICACAO_PROPRIA(String FABRICACAO_PROPRIA) {
		this.FABRICACAO_PROPRIA = FABRICACAO_PROPRIA;
	}

	public UnidadeMedida getUNIDADE_MEDIDA_VENDA() {
		return UNIDADE_MEDIDA_VENDA;
	}

	public void setUNIDADE_MEDIDA_VENDA(UnidadeMedida UNIDADE_MEDIDA_VENDA) {
		this.UNIDADE_MEDIDA_VENDA = UNIDADE_MEDIDA_VENDA;
	}

	public String getORIGEM() {
		return ORIGEM;
	}

	public void setORIGEM(String ORIGEM) {
		this.ORIGEM = ORIGEM;
	}

	public String getCEST() {
		return CEST;
	}

	public void setCEST(String CEST) {
		this.CEST = CEST;
	}

	public ProdutoTributario getTRIBUTARIOS() {
		return TRIBUTARIOS;
	}

	public void setTRIBUTARIOS(ProdutoTributario TRIBUTARIOS) {
		this.TRIBUTARIOS = TRIBUTARIOS;
	}

	public ArrayList<ProdutoTributarioICMS> getICMS() {
		return TRIBUTARIOS_ICMS;
	}

	public void setICMS(ArrayList<ProdutoTributarioICMS> TRIBUTARIO_ICMS) {
		this.TRIBUTARIOS_ICMS = TRIBUTARIO_ICMS;
	}

	public ArrayList<ProdutoPreco> getPRECOS() {
		return PRECOS;
	}

	public void setPRECOS(ArrayList<ProdutoPreco> PRECOS) {
		this.PRECOS = PRECOS;
	}

	public ArrayList<ProdutoFornecedor> getFORNECEDORES() {
		return FORNECEDORES;
	}

	public void setFORNECEDORES(ArrayList<ProdutoFornecedor> FORNECEDORES) {
		this.FORNECEDORES = FORNECEDORES;
	}

	public ProdutoInformacoesAdicionais getINFORMACOES_ADICIONAIS() {
		return INFORMACOES_ADICIONAIS;
	}

	public void setINFORMACOES_ADICIONAIS(ProdutoInformacoesAdicionais INFORMACOES_ADICIONAIS) {
		this.INFORMACOES_ADICIONAIS = INFORMACOES_ADICIONAIS;
	}

	public ProdutoTexto getTEXTOS() {
		return TEXTOS;
	}

	public void setTEXTOS(ProdutoTexto TEXTOS) {
		this.TEXTOS = TEXTOS;
	}

	public ArrayList<ProdutoEstoque> getESTOQUES() {
		return ESTOQUES;
	}

	public void setESTOQUES(ArrayList<ProdutoEstoque> ESTOQUES) {
		this.ESTOQUES = ESTOQUES;
	}

	public ProdutoLivro getLIVRO() {
		return LIVRO;
	}

	public void setLIVRO(ProdutoLivro LIVRO) {
		this.LIVRO = LIVRO;
	}

	@Override
	public String getREFERENCIA_INTEGRACAO() {
		return REFERENCIA_INTEGRACAO;
	}

	public void setREFERENCIA_INTEGRACAO(String REFERENCIA_INTEGRACAO) {
		this.REFERENCIA_INTEGRACAO = REFERENCIA_INTEGRACAO;
	}
}
