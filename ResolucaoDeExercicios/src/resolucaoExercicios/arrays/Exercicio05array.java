package resolucaoExercicios.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio05array {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char[] palavraSecreta = {'m', 'a', 'n', 'o', 'e', 'l'};
		boolean acertou = false;
		boolean enforcou = false;
		ArrayList<Character> chutes = new ArrayList<Character>();
		int tentativas = 0;
		System.out.println("Bem vindo ao jogo da Forca");
		
		do {
			for (int indicePalavra = 0; indicePalavra < palavraSecreta.length; indicePalavra++) {
				boolean achouLetra = false;
				for (int contadorTentativa = 0; contadorTentativa < tentativas; contadorTentativa++) {
					if (chutes.contains(palavraSecreta[indicePalavra])) {
						achouLetra = true;
						break;
						
					}
				}
				
				if (achouLetra) {
					System.out.printf("%c ", palavraSecreta[indicePalavra]);
				} else {
					System.out.println("_ ");
					
				}
			}
			
			System.out.println();
			System.out.println();
			char chute;
			System.out.println("Qual a letra? ");
			chute = scanner.next().charAt(0);
			chutes.add(chute);
			tentativas++;
			System.out.println();
			for (int indice = 0; indice < palavraSecreta.length; indice++) {
				if (palavraSecreta[indice] == chute) {
					System.out.println("A posição de %d tem essa letra \n " + indice + 1);
					
				}
			}
		} while (!acertou && !enforcou);
		
		scanner.close();

	}

}
