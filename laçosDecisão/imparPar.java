package laçosDecisão;

import java.util.*;

public class imparPar {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		double num; 
		
		System.out.println("Entre com um número: ");
		num = leia.nextInt();
		
		if(num%2 == 0) {
			num = Math.sqrt(num);
			System.out.printf("O número é par e sua raiz quadrada é = %f", num);
		}else if(num%2 != 0) {
			num = Math.pow(num,2);
			System.out.printf("O número é ímpar e seu quadrado é = %f", num);
		}
	}

}
