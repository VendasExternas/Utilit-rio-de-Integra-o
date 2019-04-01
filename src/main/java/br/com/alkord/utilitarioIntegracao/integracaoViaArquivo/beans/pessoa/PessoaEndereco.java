package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.pessoa;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.APIIdentifierInterface;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.Cidade;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.Estado;
import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.Pais;

public class PessoaEndereco implements APIIdentifierInterface {

	private String CODIGO;
	private String REFERENCIA_INTEGRACAO;
	private String TIPO = "C";
	private String PRINCIPAL;
	private Pais PAIS;
	private Estado ESTADO;
	private String ESTADO_ESTRANGEIRO;
	private Cidade CIDADE;
	private String CIDADE_ESTRANGEIRA;
	private String CEP;
	private String ENDERECO;
	private String NUMERO;
	private String COMPLEMENTO;
	private String BAIRRO;
	private String DESCRICAO;
	private String CONTATO_ALTERNATIVO;
	private String POSICIONAMENTO_LATITUDE;
	private String POSICIONAMENTO_LONGITUDE;
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

	public Pais getPAIS() {
		return PAIS;
	}

	public void setPAIS(Pais PAIS) {
		this.PAIS = PAIS;
	}

	public Estado getESTADO() {
		return ESTADO;
	}

	public void setESTADO(Estado ESTADO) {
		this.ESTADO = ESTADO;
	}

	public String getESTADO_ESTRANGEIRO() {
		return ESTADO_ESTRANGEIRO;
	}

	public void setESTADO_ESTRANGEIRO(String ESTADO_ESTRANGEIRO) {
		this.ESTADO_ESTRANGEIRO = ESTADO_ESTRANGEIRO;
	}

	public Cidade getCIDADE() {
		return CIDADE;
	}

	public void setCIDADE(Cidade CIDADE) {
		this.CIDADE = CIDADE;
	}

	public String getCIDADE_ESTRANGEIRA() {
		return CIDADE_ESTRANGEIRA;
	}

	public void setCIDADE_ESTRANGEIRA(String CIDADE_ESTRANGEIRA) {
		this.CIDADE_ESTRANGEIRA = CIDADE_ESTRANGEIRA;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String CEP) {
		this.CEP = CEP;
	}

	public String getENDERECO() {
		return ENDERECO;
	}

	public void setENDERECO(String ENDERECO) {
		this.ENDERECO = ENDERECO;
	}

	public String getNUMERO() {
		return NUMERO;
	}

	public void setNUMERO(String NUMERO) {
		this.NUMERO = NUMERO;
	}

	public String getCOMPLEMENTO() {
		return COMPLEMENTO;
	}

	public void setCOMPLEMENTO(String COMPLEMENTO) {
		this.COMPLEMENTO = COMPLEMENTO;
	}

	public String getBAIRRO() {
		return BAIRRO;
	}

	public void setBAIRRO(String BAIRRO) {
		this.BAIRRO = BAIRRO;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}

	public void setDESCRICAO(String DESCRICAO) {
		this.DESCRICAO = DESCRICAO;
	}

	public String getCONTATO_ALTERNATIVO() {
		return CONTATO_ALTERNATIVO;
	}

	public void setCONTATO_ALTERNATIVO(String CONTATO_ALTERNATIVO) {
		this.CONTATO_ALTERNATIVO = CONTATO_ALTERNATIVO;
	}

	public String getPOSICIONAMENTO_LATITUDE() {
		return POSICIONAMENTO_LATITUDE;
	}

	public void setPOSICIONAMENTO_LATITUDE(String POSICIONAMENTO_LATITUDE) {
		this.POSICIONAMENTO_LATITUDE = POSICIONAMENTO_LATITUDE;
	}

	public String getPOSICIONAMENTO_LONGITUDE() {
		return POSICIONAMENTO_LONGITUDE;
	}

	public void setPOSICIONAMENTO_LONGITUDE(String POSICIONAMENTO_LONGITUDE) {
		this.POSICIONAMENTO_LONGITUDE = POSICIONAMENTO_LONGITUDE;
	}

	public String getEXCLUIDO() {
		return EXCLUIDO;
	}

	public void setEXCLUIDO(String EXCLUIDO) {
		this.EXCLUIDO = EXCLUIDO;
	}
}
