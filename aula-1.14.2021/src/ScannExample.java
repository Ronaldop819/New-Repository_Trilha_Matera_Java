import java.util.Scanner;

public class ScannExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Test next Line");
		String line = scanner.nextLine();
		System.out.println(line);
		
		System.out.println("Digite o seu nome");
		String nome = scanner.nextLine();
		
		System.out.println("Digite sua idade");
		int idade = scanner.nextInt();
		
		System.out.println("Digite sua altura");
		double altura = scanner.nextDouble();
		
		System.out.println(nome + "tem " + idade + " anos e " + altura + "m de altura");
		
		scanner.close();
	}

}
