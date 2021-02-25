package laçosDecisão;

import java.util.*;

public class idades {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Entre com a idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Categoria Infantil");
			
		if(idade>=15 && idade<=17) {
			System.out.println("Categoria Juvenil");
			
		if(idade>=18 && idade<=25) {
			System.out.println("Categoria Adulta");
		}else {
			System.out.println("Categoria Inexistente");
			}
		}
									}
	}
}