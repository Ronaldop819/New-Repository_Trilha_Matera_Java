package resolucaoExercicios.arrays;

import java.util.Scanner;

public class Exercicio01array {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha a quantidade de numeros a armazenar: ");
		int quantidadeDeNumeros = scanner.nextInt();
		int[] numeros = new int[quantidadeDeNumeros];
		
		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.println("Digire o numero " + (indiceNumeros + 1) + ": ");
			numeros[indiceNumeros] = scanner.nextInt();
		}
		
		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.println("Numero " + numeros[indiceNumeros] + " armazenado");
		}
		
		scanner.close();

	}

}
