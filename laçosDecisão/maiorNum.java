package laçosDecisão;

import java.util.Scanner;

public class maiorNum {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Entre com o 1º número: ");
		num1 = leia.nextInt();
		System.out.println("Entre com o 2º número: ");
		num2 = leia.nextInt();
		System.out.println("Entre com o 3º número: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("Maior número = " + num1);
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("Maior número = " + num2);
		}else if(num3 > num1 && num3 > num2) {
			System.out.println("Maior número = " + num3);
		}
		
	}

}
