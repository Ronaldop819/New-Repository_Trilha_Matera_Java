package exercicio03.Ava;

public class Universidade {

	private String nomeDaUniversidade = "nosParanaue";
	
	public void nomeDaUniversidade(String nomeDaUniversidade) {
		this.setNome(nomeDaUniversidade);
	}
	
	
	public void mostraNome() {
		System.out.println("O nome da Universidade é: " + this.nomeDaUniversidade);
	}
	

	public String getNome() {
		return nomeDaUniversidade;
	}

	public void setNome(String nome) {
		this.nomeDaUniversidade = nome;
	}
	
}
