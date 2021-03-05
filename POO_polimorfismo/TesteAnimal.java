package POO_polimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguiça preguiça = new Preguiça();
		
		preguiça.inserirDados();
		
		preguiça.mostraDados();
	}

}
