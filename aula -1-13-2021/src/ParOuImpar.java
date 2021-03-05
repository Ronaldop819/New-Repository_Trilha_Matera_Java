import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		System.out.println("Por favor digite um número");
		Scanner in = new Scanner(System.in);
		int numero = in.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.println("É um número par");
			
		} else {
			
			System.out.println("É um número ímpar");
			
			in.close();
		}

	}

}
