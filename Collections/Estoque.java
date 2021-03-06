package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
	public static void main (String [] args) {
		
		ArrayList <String> Estoque = new ArrayList <String>();
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Entre com o produto que deseja adcionar ao estoque: (\nOu 0 para sair.)");
			String produto = leia.nextLine();
			Estoque.add(produto);
			System.out.println(Estoque);
		}while(!=0);
		
		

			
	}

}
