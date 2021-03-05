import java.util.Scanner;

public class ExerciseArray01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[5];
		
		
		for (int numerosAdd = 0; numerosAdd < numeros.length; numerosAdd++) {
			System.out.print("Digite um número: ");
			numeros[numerosAdd] = scanner.nextInt();
		}
		
		for (int numeroAdd = 0; numeroAdd < numeros.length; numeroAdd++) {
			System.out.println("Números escolhido: " + numeros[numeroAdd]);
		}
		
		scanner.close();

	}

}
