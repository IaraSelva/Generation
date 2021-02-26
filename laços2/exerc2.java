package laços2;

import java.util.*;

public class exerc2 {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, x, contpar=0, contimpar=0;
		
		for(x=0;x<10;x++) {
			System.out.println("Entre com um número: ");
			num = leia.nextInt();
				if (num%2 == 0) {
					contpar++;
				}
				if (num%2 != 0) {
					contimpar++;
				}
		}
		System.out.printf("Quantidade de pares = %d%n",contpar);
		System.out.printf("Quantidade de ímpares = %d%n",contimpar);
	}	

}
