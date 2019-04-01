package br.com.alkord.utilitarioIntegracao;

import org.apache.commons.lang3.StringUtils;

import java.sql.*;

public class DatabaseHelper {

	private Connection connection;

	DatabaseHelper() {
		try {
			Class.forName("org.sqlite.JDBC");
			String url = "jdbc:sqlite::resource:" + getClass().getResource("/banco_dados.sqlite");
			connection = DriverManager.getConnection(url);
		}
		catch (ClassNotFoundException | SQLException e) {
			throw new RuntimeException("Erro ao inicilizar o banco de dados: " + e.getMessage(), e);
		}
	}

	public void insertReference(String table, String id, String reference) {
		try {
			PreparedStatement statement = connection.prepareStatement(
					"INSERT INTO integracao_apis_referencias (TABELA, CODIGO, CODIGO_REFERENCIA) " +
					"VALUES (?, ?, ?)"
			);

			statement.setString(1, table);
			statement.setString(2, id);
			statement.setString(3, reference);
			int result = statement.executeUpdate();

			if (result == 0)
				throw new RuntimeException("Não foi possível salvar a referência: " + table + " - " + reference);

			statement.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Não foi possível executar a inserção da referência: " + table + " - " + reference);
		}
	}

	public boolean referenceExists(String table, String reference) {
		if (StringUtils.isBlank(reference))
			return false;

		try {
			PreparedStatement statement = connection.prepareStatement(
					"SELECT 1 FROM integracao_apis_referencias " +
					"WHERE (TABELA = ?)" +
					"  AND (CODIGO_REFERENCIA = ?) "
			);
			statement.setString(1, table);
			statement.setString(2, reference);

			ResultSet statementResult = statement.executeQuery();
			boolean exists = statementResult.next();

			statement.close();
			statementResult.close();

			return exists;
		}
		catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Não foi possível executar a busca da referência: " + table + " - " + reference);
		}
	}

	public boolean identifierExists(String table, String id) {
		if (StringUtils.isBlank(id))
			return false;

		try {
			PreparedStatement statement = connection.prepareStatement(
					"SELECT 1 FROM integracao_apis_referencias " +
					"WHERE (TABELA = ?)" +
					"  AND (CODIGO = ?) "
			);
			statement.setString(1, table);
			statement.setString(2, id);

			ResultSet statementResult = statement.executeQuery();
			boolean exists = statementResult.next();

			statement.close();
			statementResult.close();

			return exists;
		}
		catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Não foi possível executar a busca da referência: " + table + " - " + id);
		}
	}
}
