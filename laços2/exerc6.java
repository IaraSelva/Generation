package laços2;

import java.util.Scanner;

public class exerc6 {
	public static void main(String args[]) {
		
		Scanner get = new Scanner(System.in);
		
		int num, soma=0,media=0,cont=0;
		
		do {
		System.out.println("Digite um valor: ");
		num = get.nextInt();
		
				if(num%3 == 0) {
				soma = soma + num;
				cont++;
			}
		}
		while(num != 0);
		
		media = soma/(cont-1);
		System.out.printf("Média dos valores digitados = %d",media);
	}

}
