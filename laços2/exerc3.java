package laços2;

import java.util.Scanner;

public class exerc3 {
	public static void main (String args[]) {
		
		Scanner get = new Scanner(System.in);
		int idade, cont1=0, cont2=0;
		
		System.out.println("Entre com uma idade: ");
		idade = get.nextInt();
		
		while(idade!=-99) {
			
				if(idade<21) {
					cont1++;
				}
				if(idade>50) {
					cont2++;
				}
			System.out.println("Entre com uma idade: ");
			idade = get.nextInt();
			}
		System.out.printf("Quantidade de pessoas com mais de 21 anos: %d%n", cont1);
		System.out.printf("Quantidade de pessoas com mais de 50 anos: %d%n", cont2);
	}

}
