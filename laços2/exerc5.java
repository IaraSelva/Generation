package la�os2;

import java.util.Scanner;

public class exerc5 {
	public static void main(String args[]) {
		
		double num;
		Scanner get = new Scanner(System.in);
		
		do {
			System.out.println("Chute um n�mero: ");
			num = get.nextDouble();
			
			if(num != 0) {
				System.out.println("N�o foi dessa vez...");	
			}
			
		}while(num!=0);
		
		System.out.println("Acertou miser�vi!");
		
	}
	
}