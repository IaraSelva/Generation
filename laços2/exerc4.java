package laços2;

import java.util.*;

public class exerc4 {
	public static void main(String args[]) {
		
		Scanner get = new Scanner(System.in);
		int old, gender, mood, cont=1, cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0;
		String name;
		
		while(cont<=3) {
			
			System.out.printf("Qual o nome da pessoa %d%s%n",cont," ? ");
			name = get.next();
			
			System.out.printf("Qual a idade de %s%s%n",name," ? ");
			old = get.nextInt();
			
			System.out.printf("Qual o gênero de %s%s%n",name," ? \n 1 - fem \n 2 - masc ");
			gender = get.nextInt();
			
			System.out.printf("Qual o temperamento de %s%s%n",name," ? \n 1 - calma \n 2 - nervosa \n 3 - agressiva ");
			mood = get.nextInt();
			
			cont++;
			
				if(mood == 1) {
					cont1++;
				}
				if(gender == 1 && mood == 2) {
					cont2++;
				}
				if(gender == 2 && mood == 3) {
					cont3++;
				}
				if(gender == 2 && mood == 1) {
					cont4++;
				}
				if(old > 40 && mood == 2) {
					cont5++;
				}
				if(old < 18 && mood == 1) {
					cont6++;
				}

		}
		System.out.printf("número de pessoas calmas = %d%n",cont1);
		System.out.printf("número de mulheres nervosas = %d%n",cont2);
		System.out.printf("número de homens agressivos = %d%n",cont3);
		System.out.printf("número de homens calmos = %d%n",cont4);
		System.out.printf("número de pessoas nervosas com mais de 40 anos = %d%n",cont5);
		System.out.printf("número de pessoas calmas com menos de 18 anos = %d%n",cont6);
		
	}

}