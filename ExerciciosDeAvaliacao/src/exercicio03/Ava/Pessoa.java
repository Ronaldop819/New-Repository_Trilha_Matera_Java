package exercicio03.Ava;

import java.time.LocalDate;

public class Pessoa extends Universidade {
	
	private String nome;
	private String localTrabalho;
	private int inicioDia;
	private int inicioMes;
	private int inicioAno;


	public Pessoa(String nome, String localTrabalho, int inicioDia, int inicioMes, int inicioAno) {
		this.nome = nome;
		this.localTrabalho = localTrabalho;
		this.inicioDia = inicioDia;
		this.inicioMes = inicioMes;
		this.inicioAno = inicioAno;
	}



public void imprimeDados() {
		
		System.out.println(
				"Nome: " + this.nome + "\nLocal de trabalho: " + this.localTrabalho + "\nData de início: " + this.inicioDia + "/"
				+ this.inicioMes + "/" + this.inicioAno + "\nTempo: " + this.calculaInicio() + " anos");
}
	
	private int calculaInicio() {
		
		int anoAtual = LocalDate.now().getYear();
		int mesAtual = LocalDate.now().getMonthValue();
		int diaAtual = LocalDate.now().getDayOfMonth();
		
		if (this.inicioDia < diaAtual && this.inicioMes <= mesAtual) {
			return anoAtual - this.inicioAno;
			
		} else {
			return anoAtual - this.inicioAno - 1;
			
		}
		
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLocalTrabalho() {
		return localTrabalho;
	}


	public void setLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}

	public int getInicioDia() {
		return inicioDia;
	}

	public void setInicioDia(int inicioDia) {
		this.inicioDia = inicioDia;
	}

	public int getInicioMes() {
		return inicioMes;
	}

	public void setInicioMes(int inicioMes) {
		this.inicioMes = inicioMes;
	}

	public int getInicioAno() {
		return inicioAno;
	}

	public void setInicioAno(int inicioAno) {
		this.inicioAno = inicioAno;
	}

	
	

}
