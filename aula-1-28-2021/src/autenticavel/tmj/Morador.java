package autenticavel.tmj;

public class Morador extends Pessoa implements Autorizavel {

	
	boolean presente;
	int senha;
	
	
	
	@Override
	public boolean autoriza(int senha) {
		
		return false;
	}

}
