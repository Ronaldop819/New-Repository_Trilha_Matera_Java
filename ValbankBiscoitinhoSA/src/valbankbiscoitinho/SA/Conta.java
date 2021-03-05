package valbankbiscoitinho.SA;

import java.util.Scanner;

public class Conta {

	private Cliente titular;
	private double saldo;
	private double limite;

	public Conta(Cliente titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		this.limite = 0;
//		chamar gera conta
		
	}

// TODO	metodo gera conta
	
	
	public void deposita(double valor) {
		this.saldo += valor;
		if (this.limite < 0) {
			this.limite += valor;
		}
	}

//	public void saca(double valor) {
//		if (valor <= (this.saldo + this.limite)) {
//			if (valor <= this.saldo) {
//				this.saldo -= valor;
//				System.out.println("Saque efetuado com sucesso!");
//			} else {
//				double saldoUtilizado = this.saldo;
//				this.saldo = 0;
//				this.limite  = this.limite - ( valor - saldoUtilizado);
//				System.out.println("Saque efetuado com sucesso, usando o limite");
//				System.out.println("Saldo da conta: " + this.saldo);
//				System.out.println("Limite restante: " + this.limite);
//			}
//		} else {System.err.println("Você não pode sacar. Saldo insuficiente!!");
//			}
//	}
	
	public void saca(double valor) {
		if (this.saldo >= valor) {
				this.saldo -= valor;
				System.out.println("Saque efetuado com sucesso!");
			} else if (valor <= (this.saldo + this.limite)){
					this.saldo -= valor;
				System.out.println("Saque efetuado com sucesso, usando o limite!");
				} else {
				System.err.println("\n Você não pode sacar. Saldo insuficiente!!");
			}
	}

	public void encerrarConta() {
		if (this.saldo == 0 ) {
			System.out.println("Conta encerrada com Sucesso!");
		
		} else {
			System.out.println("Sua conta está com saldo positivo/devedor, você não pode encerrar"); 
			
		}
	}

	public void adicionaLimite(AutorizaLimite autorizaLimite, double limite) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo ao ValBank! ");
		System.out.print("Digite a senha: ");
		int senha = scanner.nextInt();

		boolean autorizado = autorizaLimite.autoriza(senha);

		if (autorizado) {
			System.out.println("Limite de " + limite + " adicionado.");
			this.limite += limite;
		} else {
			System.err.println("Senha incorreta. Limite não adicionado.");
		}
		
		scanner.close();
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

}
