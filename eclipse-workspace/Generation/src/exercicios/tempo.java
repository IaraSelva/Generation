package exercicios;

import java.util.Scanner;

public class tempo {
	public static void main(String args[]) {
		Scanner get = new Scanner(System.in);
		
		int tempo, horas, minutos, segundos;
		
		System.out.println("Qual a duração do evento em segundos? ");
		tempo = get.nextInt();
		
		horas = tempo/3600;
		minutos = (tempo%3600)/60;
		segundos = tempo%3600%60;
		
		System.out.print("O evento durou ");
		System.out.print(horas);
		System.out.print(" horas, ");
		System.out.print(minutos);
		System.out.print(" minutos e ");
		System.out.print(segundos);
		System.out.println(" segundos.");
		System.out.print("E finalmente acabou!");
	}

}
