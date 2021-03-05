package autenticavel.tmj;

public class Visitante extends Pessoa implements Autorizavel{

	@Override
	public boolean autoriza(int senha) {
		
		return false;
	}

	
	
}
