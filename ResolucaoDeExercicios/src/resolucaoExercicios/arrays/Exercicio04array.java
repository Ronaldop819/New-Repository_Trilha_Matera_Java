package resolucaoExercicios.arrays;

import java.util.Scanner;

public class Exercicio04array {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha a quantidade de números a armazenar: ");
		
		int quantidadeDeNumeros = scanner.nextInt();
		int maiorValor = 0;
		int[] numeros = new int[quantidadeDeNumeros];
		
		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.println("Digite o numero " + (indiceNumeros + 1) + ": ");
			numeros[indiceNumeros] = scanner.nextInt();
			
		}
		
		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			if(numeros[indiceNumeros] > maiorValor) {
				maiorValor = numeros[indiceNumeros];
			}
		}
		
		System.out.println("Dos números armazenados o maior valor é: " + maiorValor);
		
		scanner.close();

	}

}
