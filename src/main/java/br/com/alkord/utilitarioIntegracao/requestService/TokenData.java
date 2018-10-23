package br.com.alkord.utilitarioIntegracao.requestService;

public class TokenData {

	private String token_acesso;
	private String token_renovacao;

	public String getTOKEN_ACESSO() {
		return token_acesso;
	}

	public void setTOKEN_ACESSO(String token_acesso) {
		this.token_acesso = token_acesso;
	}

	public String getTOKEN_RENOVACAO() {
		return token_renovacao;
	}

	public void setTOKEN_RENOVACAO(String token_renovacao) {
		this.token_renovacao = token_renovacao;
	}
}
