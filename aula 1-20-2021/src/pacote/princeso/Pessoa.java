package pacote.princeso;
		

public class Pessoa {

	String nome;
	double altura;
	int diaNascimento;
	int mesNascimento;
	int anoNascimento;
	
	Pessoa(String nome, double altura,int diaNascimento, int mesNascimento, int anoNascimento) {
		
		this.nome = nome;
		this.altura = altura;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
		
	}
	
	void imprimeDados() {
		System.out.println("Nome: " + this.nome + "\nAltura: " + this.altura +
				"\nData de nascimento: " + this.diaNascimento + "/" + this.mesNascimento + "/" 
				+ this.anoNascimento + "\nIdade: " + this.calculaIdade());
	}
	
	int calculaIdade() {
		int anoAtual = 2021;
		
		return anoAtual - this.anoNascimento;
	}
	
}
