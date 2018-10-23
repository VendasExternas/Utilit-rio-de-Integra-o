package br.com.alkord.utilitarioIntegracao.requestMethods;

import com.google.gson.annotations.SerializedName;

public enum RequestMethod {

	@SerializedName("GET") GET("GET"),
	@SerializedName("PUT") PUT("PUT"),
	@SerializedName("POST") POST("POST"),
	@SerializedName("DELETE") DELETE("DELETE");
	private final String method;

	RequestMethod(String valor) {
		this.method = valor;
	}

	public String getValor() {
		return method;
	}
}
