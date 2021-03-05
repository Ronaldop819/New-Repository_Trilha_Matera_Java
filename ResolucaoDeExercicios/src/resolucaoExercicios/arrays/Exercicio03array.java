package resolucaoExercicios.arrays;

import java.util.Scanner;

public class Exercicio03array {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escolha a quantidade de numeros a armazenar: ");
		int quantidadeDeNumeros = scanner.nextInt();
		int quantidadeDeNumerosPares = 0;
		int[] numeros = new int[quantidadeDeNumeros];
		
		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			System.out.println("Digite o numero " + (indiceNumeros + 1) + ": ");
			numeros[indiceNumeros] = scanner.nextInt();
			
		}
		
		for (int indiceNumeros = 0; indiceNumeros < numeros.length; indiceNumeros++) {
			if(numeros[indiceNumeros] % 2 == 0) {
				quantidadeDeNumerosPares += 1;
			}
		}
		
		System.out.println(quantidadeDeNumerosPares + " numeros pares foram armazenados");
		
		scanner.close();

	}

}
