package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.produto;

import br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans.pessoa.Pessoa;

public class ProdutoFornecedor {

	private Pessoa FORNECEDOR;
	private String CODIGO_REFERENCIA;

	public Pessoa getFORNECEDOR() {
		return FORNECEDOR;
	}

	public void setFORNECEDOR(Pessoa FORNECEDOR) {
		this.FORNECEDOR = FORNECEDOR;
	}

	public String getCODIGO_REFERENCIA() {
		return CODIGO_REFERENCIA;
	}

	public void setCODIGO_REFERENCIA(String CODIGO_REFERENCIA) {
		this.CODIGO_REFERENCIA = CODIGO_REFERENCIA;
	}
}
