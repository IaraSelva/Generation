package la�osDecis�o;

import java.util.*;

public class imparPar {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		double num; 
		
		System.out.println("Entre com um n�mero: ");
		num = leia.nextInt();
		
		if(num%2 == 0) {
			num = Math.sqrt(num);
			System.out.printf("O n�mero � par e sua raiz quadrada � = %f", num);
		}else if(num%2 != 0) {
			num = Math.pow(num,2);
			System.out.printf("O n�mero � �mpar e seu quadrado � = %f", num);
		}
	}

}
