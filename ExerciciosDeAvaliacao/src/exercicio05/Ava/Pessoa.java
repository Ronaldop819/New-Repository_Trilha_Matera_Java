package exercicio05.Ava;

import java.time.LocalDate;


public class Pessoa {

	private String nome;
	private double altura;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	
	
	public Pessoa(String nome, double altura, int diaNascimento, int mesNascimento, int anoNascimento) {
		this.nome = nome;
		this.altura = altura;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
	}
	
	public void imprimeDados() {
		
		System.out.println(
				"Nome: " + this.nome + "\nAltura: " + this.altura + "\nData de nascimento: " + this.diaNascimento + "/"
				+ this.mesNascimento + "/" + this.anoNascimento + "\nIdade: " + this.calculaIdade());
	}

	private int calculaIdade() {
		
		int anoAtual = LocalDate.now().getYear();
		int mesAtual = LocalDate.now().getMonthValue();
		int diaAtual = LocalDate.now().getDayOfMonth();
		
		if (this.diaNascimento < diaAtual && this.mesNascimento <= mesAtual) {
			return anoAtual - this.anoNascimento;
			
		} else {
			return anoAtual - this.anoNascimento - 1;
			
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getDiaNascimento() {
		return diaNascimento;
	}

	public void setDiaNascimento(int diaNascimento) {
		this.diaNascimento = diaNascimento;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	
	
	
	
	
}
