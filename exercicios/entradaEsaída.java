package exercicios;

import java.util.Scanner;

public class entradaEsaída {
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		int a,b,soma;
		
		System.out.println("Entre com o valor de A: ");
		a = ler.nextInt();
		
		System.out.println("Entre com o vaor de B: ");
		b = ler.nextInt();
		
		soma = a+b;
		
		System.out.print("Soma dos valores = ");
		System.out.println(soma);
		
	}
	

}
