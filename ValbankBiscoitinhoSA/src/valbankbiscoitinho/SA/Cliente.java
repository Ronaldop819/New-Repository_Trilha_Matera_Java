package valbankbiscoitinho.SA;

public class Cliente {
	private String nome;
	private String tipoString;
	
	
	

	public Cliente(String nome, String tipoString) {
		super();
		this.nome = nome;
		this.tipoString = tipoString;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoString() {
		return tipoString;
	}

	public void setTipoString(String tipoString) {
		this.tipoString = tipoString;
	}
}
