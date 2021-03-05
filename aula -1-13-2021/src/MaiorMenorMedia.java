import java.util.Scanner;

public class MaiorMenorMedia {

	public static void main(String[] args) {
		
		
		 // 4. Construa um algoritmo que leia 10 valores inteiros e positivos e:

	      // Encontre o maior valor
	      // Encontre o menor valor
	      // Calcule a média dos números lidos

	      Scanner in = new Scanner(System.in);

	      int somaDosValores = 0;
	      
	      System.out.println("Informe o 1 num");
	      int valor = in.nextInt();
	      
	      int menorValor = valor;
	      int maiorValor = valor;

	      // somaDosValores = somaDosValores + valor1;
	      somaDosValores += valor; // Explicar esse novo operador de atribuição


	      // Start Num 2
	      System.out.println("Informe o 2 num");
	      valor = in.nextInt();


	      if (valor > maiorValor) {
	        maiorValor = valor;
	      }

	      if (valor < menorValor) {
	        menorValor = valor;
	      }

	      somaDosValores += valor;

	      // End Num 2

	      // Start Num 3
	      System.out.println("Informe o 3 num");
	      valor = in.nextInt();


	      if (valor > maiorValor) {
	        maiorValor = valor;
	      }

	      if (valor < menorValor) {
	        menorValor = valor;
	      }

	      somaDosValores += valor;

	      // End Num 3

	      // Start Num 4
	      System.out.println("Informe o 4 num");
	      valor = in.nextInt();


	      if (valor > maiorValor) {
	        maiorValor = valor;
	      }

	      if (valor < menorValor) {
	        menorValor = valor;
	      }

	      somaDosValores += valor;

	      // End Num 4

	      // Start Num 5
	      System.out.println("Informe o 5 num");
	      valor = in.nextInt();


	      if (valor > maiorValor) {
	        maiorValor = valor;
	      }

	      if (valor < menorValor) {
	        menorValor = valor;
	      }

	      somaDosValores += valor;

	      // End Num 5

	      // Start Num 6
	      System.out.println("Informe o 6 num");
	      valor = in.nextInt();


	      if (valor > maiorValor) {
	        maiorValor = valor;
	      }

	      if (valor < menorValor) {
	        menorValor = valor;
	      }

	      somaDosValores += valor;

	      // End Num 6

	      // Start Num 7
	      System.out.println("Informe o 7 num");
	      valor = in.nextInt();


	      if (valor > maiorValor) {
	        maiorValor = valor;
	      }

	      if (valor < menorValor) {
	        menorValor = valor;
	      }

	      somaDosValores += valor;

	      // End Num 7

	      // Start Num 8
	      System.out.println("Informe o 8 num");
	      valor = in.nextInt();


	      if (valor > maiorValor) {
	        maiorValor = valor;
	      }

	      if (valor < menorValor) {
	        menorValor = valor;
	      }

	      somaDosValores += valor;

	      // End Num 8

	      // Start Num 9
	      System.out.println("Informe o 9 num");
	      valor = in.nextInt();


	      if (valor > maiorValor) {
	        maiorValor = valor;
	      }

	      if (valor < menorValor) {
	        menorValor = valor;
	      }

	      somaDosValores += valor;

	      // End Num 9

	      // Start Num 10
	      System.out.println("Informe o 10 num");
	      valor = in.nextInt();


	      if (valor > maiorValor) {
	        maiorValor = valor;
	      }

	      if (valor < menorValor) {
	        menorValor = valor;
	      }

	      somaDosValores += valor;

	      // End Num 10

	      // Start Resultado

	      System.out.println("O maior valor digitado foi: " + maiorValor);
	      System.out.println("O menor valor digitado foi: " + menorValor);

	      System.out.print("A média dos valores é: " + somaDosValores / 10.0);

	      // End Resultado
	      
	      in.close();
	}

}
