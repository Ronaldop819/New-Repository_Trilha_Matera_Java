package exercicio05.Ava;

public class TestaAgenda {

	public static void main(String[] args) {
	
		Agenda agenda = new Agenda();
		
		Pessoa manoel = new Pessoa("Manoel", 1.75, 02, 05, 1994);
		Pessoa carlos = new Pessoa("Carlos", 1.75, 02, 02, 1984);
		Pessoa judite = new Pessoa("Judite", 1.55, 04, 01, 1989);
		Pessoa julia = new Pessoa("Julia", 1.65, 12, 023, 2000);
		Pessoa marcos = new Pessoa("Carlos", 1.73, 20, 01, 1990);

		agenda.armazenaPessoa(marcos);
		agenda.armazenaPessoa(julia);
		agenda.armazenaPessoa(judite);
		agenda.armazenaPessoa(carlos);
		agenda.armazenaPessoa(manoel);
		
		agenda.imprimeAgenda();
		
		agenda.imprimePessoa(0);
		agenda.imprimePessoa(1);
		agenda.imprimePessoa(2);
		agenda.imprimePessoa(3);
		agenda.imprimePessoa(4);
		
		agenda.removePessoa("Marcos");
		
		agenda.imprimeAgenda();
		
		System.out.println("A posição do Manoel na agenda é: " + agenda.buscaPessoa("Manoel"));
	}

}
