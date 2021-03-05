import java.util.Scanner;

public class ExerciseArray02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[5];
		int qtdNumeroNegativos = 0;
		
		
		for (int numerosAdd = 0; numerosAdd < numeros.length; numerosAdd++) {
			System.out.print("Digite um número: ");
			numeros[numerosAdd] = scanner.nextInt();
		}
		
		for (int numeroAdd = 0; numeroAdd < numeros.length; numeroAdd++) {
			if (numeros[numeroAdd] < 0) {
				qtdNumeroNegativos += 1;
			}
			
		}
		
		System.out.println("Temos " + qtdNumeroNegativos + " numeros negativos");
		scanner.close();
		
	}

}

