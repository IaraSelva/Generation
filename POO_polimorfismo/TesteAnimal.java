package POO_polimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Pregui�a pregui�a = new Pregui�a();
		
		pregui�a.inserirDados();
		
		pregui�a.mostraDados();
	}

}
