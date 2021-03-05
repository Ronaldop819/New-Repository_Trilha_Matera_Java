package valbankbiscoitinho.SA;

public class Gerente implements AutorizaLimite {
	private int senha;

	public Gerente(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autoriza(int senha) {
		return this.senha == senha;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
