package br.com.alkord.utilitarioIntegracao.integracaoViaArquivo.beans;

import java.util.ArrayList;
import java.util.List;

public class ProcessResult {

	private List<String> API_RETORNO_INSERCAO = new ArrayList<>();
	private List<Boolean> API_RESULTADO_INSERCAO = new ArrayList<>();
	private List<String> API_RETORNO_ATUALIZACAO = new ArrayList<>();
	private List<Boolean> API_RESULTADO_ATUALIZACAO = new ArrayList<>();

	public List<String> getAPI_RETORNO_INSERCAO() {
		return API_RETORNO_INSERCAO;
	}

	public void setAPI_RETORNO_INSERCAO(List<String> API_RETORNO_INSERCAO) {
		this.API_RETORNO_INSERCAO = API_RETORNO_INSERCAO;
	}

	public List<Boolean> getAPI_RESULTADO_INSERCAO() {
		return API_RESULTADO_INSERCAO;
	}

	public void setAPI_RESULTADO_INSERCAO(List<Boolean> API_RESULTADO_INSERCAO) {
		this.API_RESULTADO_INSERCAO = API_RESULTADO_INSERCAO;
	}

	public List<String> getAPI_RETORNO_ATUALIZACAO() {
		return API_RETORNO_ATUALIZACAO;
	}

	public void setAPI_RETORNO_ATUALIZACAO(List<String> API_RETORNO_ATUALIZACAO) {
		this.API_RETORNO_ATUALIZACAO = API_RETORNO_ATUALIZACAO;
	}

	public List<Boolean> getAPI_RESULTADO_ATUALIZACAO() {
		return API_RESULTADO_ATUALIZACAO;
	}

	public void setAPI_RESULTADO_ATUALIZACAO(List<Boolean> API_RESULTADO_ATUALIZACAO) {
		this.API_RESULTADO_ATUALIZACAO = API_RESULTADO_ATUALIZACAO;
	}
}
