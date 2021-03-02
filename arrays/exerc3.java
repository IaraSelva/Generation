package vetoresMatriz;

import java.util.*;

public class exerc3 {

	public static void main(String[] args) {
		
		Scanner get = new Scanner(System.in);
		
		float Matriz[][] = new float [3][3];
		int cont = 0;
		
		for (int x =0; x<3; x++) {
			for(int y=0; y<3; y++) {
				
				System.out.println("Digite o número ["+x+"]" +"["+y+"]: ");
				Matriz[x][y] = get.nextFloat(); 
				
				if(Matriz[x][y]>10) {
					cont++;
				}
			}	
		}System.out.println("Qauntidade de números maiores que 10 = " + cont);

	}

}
