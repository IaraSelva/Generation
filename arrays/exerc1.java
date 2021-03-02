package vetoresMatriz;

public class exerc1 {
	public static void main (String args[]) {
		
		int A[] = {1,0,5,-2,-5,7}, soma; 
		soma = A[0] + A[1] + A[5];
		A[3] = 100;
		
		for(int x=0; x<6; x++) {
			System.out.printf("%d\n",A[x]);
			}
		System.out.println("\n\nSoma A[0] + A[1] + A[5] = "+soma);
	}

}
