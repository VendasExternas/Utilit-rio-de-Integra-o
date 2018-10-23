package br.com.alkord.utilitarioIntegracao.requestService;

public class HttpResult {

	private String result;
	private Integer responseCode;

	String getResult() {
		return result;
	}

	void setResult(String result) {
		this.result = result;
	}

	Integer getResponseCode() {
		return responseCode;
	}

	void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
}
