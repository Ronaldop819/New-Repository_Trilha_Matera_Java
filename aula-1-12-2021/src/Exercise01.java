
public class Exercise01 {

	public static void main(String[] args) {
		
		int y = 99;
		int z = 11;
		
		System.out.println("O valor inicial da minha var?vel Y ?: " + y);
		System.out.println("O valor da minha vari?vel Z ?: " + z);
		
		int aux = 0;
		
		aux = y;
		y = z;
		z = aux;
		
		System.out.println("O valor depois da troca da minha vari?vel Y ?: " + y);
		System.out.println("O valor depois da troca da minha vari?vel Y ?: " + z);

	}

}
