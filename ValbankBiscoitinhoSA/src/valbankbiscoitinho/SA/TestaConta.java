package valbankbiscoitinho.SA;

public class TestaConta {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente(123);
		
		Cliente cliente = new Cliente("João Biscoito de Chocolate", "Conta Corrente");
		
		Conta conta = new Conta(cliente, 500);
		

		
		conta.adicionaLimite(gerente, 100);
		
		conta.saca(550);
		System.out.println(conta.getSaldo() + " saldo");
		System.out.println("--------------------------------------------------------");      
        conta.saca(100);
        
//        System.out.println(conta.getSaldo() + " saldo");

//		System.out.println(conta.getLimite() + " limite");
//		
//		conta.deposita(150);
//		System.out.println(conta.getSaldo() + " saldo");
//		
//		conta.saca(1000);
	    //conta.encerrarConta();
		
	}
}