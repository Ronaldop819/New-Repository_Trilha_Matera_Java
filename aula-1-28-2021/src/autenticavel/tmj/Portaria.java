package autenticavel.tmj;

import java.util.Scanner;

public class Portaria {

	void autorizaEntrada(Autorizavel autorizavel) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua senha: ");
		int senha = scanner.nextInt();

		boolean ok = autorizavel.autoriza(senha);
		if (ok) {
			System.out.println("Você está autorizado!");

		} else {
			System.out.println("Você não está autorizado!");
			
		}
		
		scanner.close();

	}

}
