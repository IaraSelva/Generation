package la�osDecis�o;

import java.util.Scanner;

public class maiorNum {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Entre com o 1� n�mero: ");
		num1 = leia.nextInt();
		System.out.println("Entre com o 2� n�mero: ");
		num2 = leia.nextInt();
		System.out.println("Entre com o 3� n�mero: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("Maior n�mero = " + num1);
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("Maior n�mero = " + num2);
		}else if(num3 > num1 && num3 > num2) {
			System.out.println("Maior n�mero = " + num3);
		}
		
	}

}
