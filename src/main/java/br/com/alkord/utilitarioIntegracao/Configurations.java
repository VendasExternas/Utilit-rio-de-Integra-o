package br.com.alkord.utilitarioIntegracao;

import br.com.alkord.utilitarioIntegracao.exceptions.ConfigurationException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configurations {

	private Properties configurations = new Properties();
	private Properties tokenData = new Properties();

	Configurations() throws Exception {
		loadConfigurations();
		validateRequiredConfigurations();
		loadTokenData();
	}

	private void loadConfigurations() throws Exception {
		try (InputStream input = new FileInputStream("config.properties")) {
			configurations.load(input);
		}
	}

	private void validateRequiredConfigurations() {
		if ((getAPI_URL() == null) || getAPI_URL().isEmpty())
			throw new ConfigurationException("A URL da API é obrigatória e não foi informada");

		if ((getUSUARIO() == null) || getUSUARIO().isEmpty())
			throw new ConfigurationException("O usuário é obrigatório e não foi informado");

		if ((getSENHA() == null) || getSENHA().isEmpty())
			throw new ConfigurationException("A senha é obrigatória e não foi informada");
	}

	public String getUSUARIO() {
		return configurations.getProperty("usuario");
	}

	public String getSENHA() {
		return configurations.getProperty("senha");
	}

	public String getAPI_URL() {
		return configurations.getProperty("api_url");
	}

	public void loadTokenData() throws IOException {
		if (!new File("dados_token.txt").exists() && !new File("dados_token.txt").createNewFile())
			throw new ConfigurationException("Não foi possível criar o arquivo de armazenamento do token");

		try (InputStream input = new FileInputStream("dados_token.txt")) {
			tokenData.load(input);
		}
	}

	public String getLICENCA() {
		return configurations.getProperty("licenca");
	}

	public String getINTEGRACAO() {
		return configurations.getProperty("integracao");
	}

	public String getTOKEN_ACESSO() {
		return tokenData.getProperty("token_acesso");
	}

	public String getTOKEN_RENOVACAO() {
		return tokenData.getProperty("token_renovacao");
	}
}
