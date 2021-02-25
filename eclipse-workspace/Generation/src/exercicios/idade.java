package exercicios;

import java.util.Scanner;

public class idade {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int idade, dias, meses, anos;
		
		System.out.println("Escreva sua idade em anos: ");
		anos = leia.nextInt();
		
		System.out.println("Escreva sua idade em meses: ");
		meses = leia.nextInt();
		
		System.out.println("Escreva sua idade em dias: ");
		dias = leia.nextInt();
		
		idade = anos*365 + meses*30 + dias;
		
		System.out.print("Idade em dias = ");
		System.out.println(idade);
		
	}
}
