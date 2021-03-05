package POO_polimorfismo;

import java.util.Scanner;

public class Preguiça extends Animal {
	
	public boolean sobe;
	
	
	public Preguiça() {
		this.sobe = true;
		
	}
	
	public void inserirDados() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do animal: ");
		setNome(leia.next());
		
		System.out.println("Digite a idade do animal: ");
		setIdade(leia.nextInt());
		
		System.out.println("Digite o som do animal: ");
		setSom(leia.next());
		
		System.out.println("O animal sobe em árvores? 's' ou 'n' ");
		this.setSobe(leia.hasNext());
		leia.next();
		if(leia.next()=="s") {
			this.setSobe(true);
		}else
			if(leia.next()=="n") {
				this.setSobe(false);
			}		
		}

	public boolean getSobe(String sn) {
		return sobe;
	}

	public void setSobe(boolean sobe) {
		this.sobe = sobe;
	}
	
}
	