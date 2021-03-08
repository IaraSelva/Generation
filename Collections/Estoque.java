package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
	public static void main (String [] args) {
		
				
		ArrayList <String> Estoque = new ArrayList <String>();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quantos produtos gostaria de adcionar ao estoque?");
		int add = leia.nextInt();
		
		for(int i=0; i<add; i++)
		{	leia.nextLine();
			//produto = estoque[0]
			System.out.println("Entre com o produto "+(i+1)+" que deseja adcionar ao estoque: ");
			String produto = leia.nextLine();
			Estoque.add(produto);

		}
		
		for(String produtos:Estoque) {
			System.out.println(produtos);
		}
		
		Estoque.remove(0);
		
		System.out.println("Estoque atualizado: "+Estoque);
		
	}

}
