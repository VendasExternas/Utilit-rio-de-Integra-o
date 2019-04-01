package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.pessoa;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.Pais;

import java.util.ArrayList;

public class Pessoa implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private String NOME;
	private String APELIDO;
	private String TIPO_PESSOA;
	private String DOCUMENTO;
	private String DOCUMENTO2;
	private String SITUACAO;
	private String RESTRICAO;
	private String INTERNET;
	private String ESTADO_CIVIL;
	private String SEXO;
	private String NASCIMENTO_CONSTITUICAO;
	private String EXCLUIDO;
	private Pais PAIS_ORIGEM;
	private Pessoa RESPONSAVEL;
	private Regiao REGIAO;
	private PessoaComercialVenda COMERCIAL_VENDA;
	private PessoaFiscal FISCAL;
	private PessoaRH RH;
	private PessoaIntegracao INTEGRACAO;
	private ArrayList<PessoaRamoAtividade> RAMOS_ATIVIDADE;
	private ArrayList<PessoaTelefone> TELEFONES;
	private ArrayList<PessoaEmail> EMAILS;
	private ArrayList<PessoaEndereco> ENDERECOS;

	public PessoaFiscal getFISCAL() {
		return FISCAL;
	}

	public void setFISCAL(PessoaFiscal FISCAL) {
		this.FISCAL = FISCAL;
	}

	public PessoaRH getRH() {
		return RH;
	}

	public void setRH(PessoaRH RH) {
		this.RH = RH;
	}

	public PessoaIntegracao getINTEGRACAO() {
		return INTEGRACAO;
	}

	public void setINTEGRACAO(PessoaIntegracao INTEGRACAO) {
		this.INTEGRACAO = INTEGRACAO;
	}

	public ArrayList<PessoaRamoAtividade> getRAMOS_ATIVIDADE() {
		return RAMOS_ATIVIDADE;
	}

	public void setRAMOS_ATIVIDADE(
			ArrayList<PessoaRamoAtividade> RAMOS_ATIVIDADE) {
		this.RAMOS_ATIVIDADE = RAMOS_ATIVIDADE;
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

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String NOME) {
		this.NOME = NOME;
	}

	public String getAPELIDO() {
		return APELIDO;
	}

	public void setAPELIDO(String APELIDO) {
		this.APELIDO = APELIDO;
	}

	public String getTIPO_PESSOA() {
		return TIPO_PESSOA;
	}

	public void setTIPO_PESSOA(String TIPO_PESSOA) {
		this.TIPO_PESSOA = TIPO_PESSOA;
	}

	public String getDOCUMENTO() {
		return DOCUMENTO;
	}

	public void setDOCUMENTO(String DOCUMENTO) {
		this.DOCUMENTO = DOCUMENTO;
	}

	public String getDOCUMENTO2() {
		return DOCUMENTO2;
	}

	public void setDOCUMENTO2(String DOCUMENTO2) {
		this.DOCUMENTO2 = DOCUMENTO2;
	}

	public String getSITUACAO() {
		return SITUACAO;
	}

	public void setSITUACAO(String SITUACAO) {
		this.SITUACAO = SITUACAO;
	}

	public String getRESTRICAO() {
		return RESTRICAO;
	}

	public void setRESTRICAO(String RESTRICAO) {
		this.RESTRICAO = RESTRICAO;
	}

	public String getINTERNET() {
		return INTERNET;
	}

	public void setINTERNET(String INTERNET) {
		this.INTERNET = INTERNET;
	}

	public String getESTADO_CIVIL() {
		return ESTADO_CIVIL;
	}

	public void setESTADO_CIVIL(String ESTADO_CIVIL) {
		this.ESTADO_CIVIL = ESTADO_CIVIL;
	}

	public String getSEXO() {
		return SEXO;
	}

	public void setSEXO(String SEXO) {
		this.SEXO = SEXO;
	}

	public String getNASCIMENTO_CONSTITUICAO() {
		return NASCIMENTO_CONSTITUICAO;
	}

	public void setNASCIMENTO_CONSTITUICAO(String NASCIMENTO_CONSTITUICAO) {
		this.NASCIMENTO_CONSTITUICAO = NASCIMENTO_CONSTITUICAO;
	}

	public String getEXCLUIDO() {
		return EXCLUIDO;
	}

	public void setEXCLUIDO(String EXCLUIDO) {
		this.EXCLUIDO = EXCLUIDO;
	}

	public Pais getPAIS_ORIGEM() {
		return PAIS_ORIGEM;
	}

	public void setPAIS_ORIGEM(Pais PAIS_ORIGEM) {
		this.PAIS_ORIGEM = PAIS_ORIGEM;
	}

	public Pessoa getRESPONSAVEL() {
		return RESPONSAVEL;
	}

	public void setRESPONSAVEL(Pessoa RESPONSAVEL) {
		this.RESPONSAVEL = RESPONSAVEL;
	}

	public Regiao getREGIAO() {
		return REGIAO;
	}

	public void setREGIAO(Regiao REGIAO) {
		this.REGIAO = REGIAO;
	}

	public ArrayList<PessoaTelefone> getTELEFONES() {
		return TELEFONES;
	}

	public void setTELEFONES(ArrayList<PessoaTelefone> TELEFONES) {
		this.TELEFONES = TELEFONES;
	}

	public ArrayList<PessoaEmail> getEMAILS() {
		return EMAILS;
	}

	public void setEMAILS(ArrayList<PessoaEmail> EMAILS) {
		this.EMAILS = EMAILS;
	}

	public ArrayList<PessoaEndereco> getENDERECOS() {
		return ENDERECOS;
	}

	public void setENDERECOS(ArrayList<PessoaEndereco> ENDERECOS) {
		this.ENDERECOS = ENDERECOS;
	}

	public PessoaComercialVenda getCOMERCIAL_VENDA() {
		return COMERCIAL_VENDA;
	}

	public void setCOMERCIAL_VENDA(
			PessoaComercialVenda COMERCIAL_VENDA) {
		this.COMERCIAL_VENDA = COMERCIAL_VENDA;
	}
}
