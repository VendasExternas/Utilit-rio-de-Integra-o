package br.com.alkord.utilitarioIntegracao.requestService;

import br.com.alkord.utilitarioIntegracao.Configurations;
import br.com.alkord.utilitarioIntegracao.exceptions.AuthenticationException;
import br.com.alkord.utilitarioIntegracao.exceptions.ConfigurationException;
import br.com.alkord.utilitarioIntegracao.exceptions.ParameterException;
import br.com.alkord.utilitarioIntegracao.requestMethods.RequestMethod;
import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public abstract class RequestService {

	protected String apiURL;
	protected String endpoint;
	protected String licenca;
	private Configurations configurations;

	public RequestService(Configurations configurations) {
		this.configurations = configurations;
		this.apiURL = configurations.getAPI_URL();
		this.licenca = configurations.getLICENCA();
	}

	public abstract String executar(String[] args) throws Exception;

	public abstract String buildURL();

	protected void validateRequest() {
		validateEndpoint();
		validateLicense();
		validateIntegration();
	}

	private void validateEndpoint() {
		if (StringUtils.isBlank(endpoint))
			throw new ParameterException("O endpoint é obrigatório e não foi informado");
	}

	private void validateLicense() {
		if (!endpoint.equals("licencas") && StringUtils.isBlank(configurations.getLICENCA()))
			throw new ConfigurationException("O código da licença é obrigatório e não foi informado");
	}

	private void validateIntegration() {
		if (!endpoint.matches("licencas|integracoes") && StringUtils.isBlank(configurations.getINTEGRACAO()))
			throw new ConfigurationException("O código de integração é obrigatório e não foi informado");
	}

	protected String process(String[] args, HttpResult httpResult) throws Exception {
		if ((httpResult.getResponseCode() == HttpURLConnection.HTTP_UNAUTHORIZED) ||
			(httpResult.getResponseCode() == HttpURLConnection.HTTP_BAD_REQUEST) &&
			httpResult.getResult().contains("Token inv")) {
			renewAccessToken();
			httpResult.setResult(executar(args));
		}

		return httpResult.getResult();
	}

	private void renewAccessToken() throws Exception {
		if ((configurations.getTOKEN_RENOVACAO() == null) || configurations.getTOKEN_RENOVACAO().isEmpty()) {
			getAccessToken();
			return;
		}

		String url = apiURL + "renovar-token?token=" + configurations.getTOKEN_RENOVACAO();
		RequestConfiguration request = new RequestConfiguration();
		request.setRequestMethod(RequestMethod.GET);
		request.setURL(url);
		HttpResult httpResult = sendRequest(request);

		if (httpResult.getResponseCode() == HttpURLConnection.HTTP_OK)
			saveAccessToken(httpResult.getResult());
		else if ((httpResult.getResponseCode() == HttpURLConnection.HTTP_UNAUTHORIZED) ||
				 httpResult.getResult().contains("Token inv"))
			getAccessToken();
		else
			throw new AuthenticationException("Token de renovação inválido");
	}

	private void getAccessToken() throws Exception {
		String url = apiURL + "token?licenca=" + licenca;
		url += "&integracao=" + configurations.getINTEGRACAO() + "&finalidade=1";

		RequestConfiguration request = new RequestConfiguration();
		request.setRequestMethod(RequestMethod.GET);
		request.setURL(url);
		request.setBasicAuthorization(getBasicAuthorization());
		HttpResult httpResult = sendRequest(request);

		if (httpResult.getResponseCode() == HttpURLConnection.HTTP_OK)
			saveAccessToken(httpResult.getResult());
		else
			throw new AuthenticationException(httpResult.getResult());
	}

	private String getBasicAuthorization() {
		String userPassword = configurations.getUSUARIO() + ":" + configurations.getSENHA();
		return Base64.getEncoder().encodeToString(userPassword.getBytes());
	}

	private void saveAccessToken(String accessToken) throws Exception {
		TokenData tokenData = new Gson().fromJson(accessToken, TokenData.class);
		String data = "token_acesso=" + tokenData.getTOKEN_ACESSO() + "\n";
		data += "token_renovacao=" + tokenData.getTOKEN_RENOVACAO();
		FileUtils.writeStringToFile(new File("dados_token.txt"), data, "UTF-8");

		configurations.loadTokenData();
	}

	protected HttpResult sendRequest(RequestConfiguration request) throws Exception {
		if (endpoint.matches("licencas|integracoes"))
			request.setBasicAuthorization(getBasicAuthorization());

		URL obj = new URL(request.getURL());
		final HttpURLConnection connection = (HttpURLConnection) obj.openConnection();
		connection.setUseCaches(false);
		connection.setRequestMethod(request.getRequestMethod().getValor());
		connection.setRequestProperty("Content-Type", "application/json");

		if (request.hasAuthentication())
			connection.setRequestProperty("Authorization", "Basic " + request.getBasicAuthorization());

		if (request.getData() != null) {
			connection.setDoOutput(true);
			OutputStream os = connection.getOutputStream();
			os.write(request.getData().getBytes());
			os.flush();
		}

		HttpResult httpResult = new HttpResult();
		httpResult.setResponseCode(connection.getResponseCode());
		httpResult.setResult(httpReadContent(connection));

		connection.disconnect();

		return httpResult;
	}

	private String httpReadContent(HttpURLConnection httpConn) throws Exception {
		StringBuilder response = new StringBuilder();
		final InputStreamReader inputStream;

		if (httpConn.getResponseCode() < HttpURLConnection.HTTP_BAD_REQUEST)
			inputStream = new InputStreamReader(httpConn.getInputStream());
		else
			inputStream = new InputStreamReader(httpConn.getErrorStream());

		final BufferedReader reader = new BufferedReader(inputStream);
		String line;

		while ((line = reader.readLine()) != null)
			response.append(line);

		reader.close();

		return response.toString();
	}

	protected String getToken() {
		return configurations.getTOKEN_ACESSO();
	}
}
