import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja saber o fatorial");
		int valor = in.nextInt();
		int resultado = 1;
		
		while (valor > 1) {
		resultado = resultado * valor;
		valor--;
		
		}
		
		System.out.println(resultado);
		
		in.close();
		
	}

}
