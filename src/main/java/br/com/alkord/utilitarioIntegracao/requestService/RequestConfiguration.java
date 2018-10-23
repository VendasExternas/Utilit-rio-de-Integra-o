package br.com.alkord.utilitarioIntegracao.requestService;

import br.com.alkord.utilitarioIntegracao.requestMethods.RequestMethod;
import org.apache.commons.lang3.StringUtils;

public class RequestConfiguration {

	private RequestMethod requestMethod;
	private String URL;
	private String data;
	private String basicAuthorization;

	RequestMethod getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(RequestMethod requestMethod) {
		this.requestMethod = requestMethod;
	}

	String getURL() {
		return URL;
	}

	public void setURL(String URL) {
		this.URL = URL;
	}

	String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	String getBasicAuthorization() {
		return basicAuthorization;
	}

	void setBasicAuthorization(String basicAuthorization) {
		this.basicAuthorization = basicAuthorization;
	}

	boolean hasAuthentication() {
		return !StringUtils.isBlank(basicAuthorization);
	}
}
