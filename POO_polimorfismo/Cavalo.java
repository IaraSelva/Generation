package POO_polimorfismo;

import java.util.Scanner;

public class Cavalo extends Animal {
	
	public boolean corre;
	
	public Cavalo() {
		this.corre = true;
	}
	
	public void inserirDados() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do animal: ");
		setNome(leia.next());
		
		System.out.println("Digite a idade do animal: ");
		setIdade(leia.nextInt());
		
		System.out.println("Digite o som do animal: ");
		setSom(leia.next());
		
		System.out.println("O animal corre? 's' ou 'n' ");
		this.setCorre(leia.hasNext());
		leia.next();
		if(leia.next()=="s") {
			this.setCorre(true);
		}else
			if(leia.next()=="n") {
				this.setCorre(false);
			}		
	}
	
	public boolean getCorre(String sn) {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}
}
