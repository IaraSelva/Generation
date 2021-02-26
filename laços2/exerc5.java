package laços2;

import java.util.Scanner;

public class exerc5 {
	public static void main(String args[]) {
		
		double num;
		Scanner get = new Scanner(System.in);
		
		do {
			System.out.println("Chute um número: ");
			num = get.nextDouble();
			
			if(num != 0) {
				System.out.println("Não foi dessa vez...");	
			}
			
		}while(num!=0);
		
		System.out.println("Acertou miserávi!");
		
	}
	
}