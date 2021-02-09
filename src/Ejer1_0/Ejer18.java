package Ejer1_0;

public class Ejer18 {

	public static void main(String[] args) {
		/*Algoritmo que visualice la cuenta de los números que son múltiplos de 2 o de 3 que hay entre 1
		y 100.
			 */
		
			System.out.println("Son multiplos de 2: ");
			for (int i=1;i<=100;i++) {
				if (i%2==0) {
				System.out.print(i + " ");
				}	
			}System.out.println(" ");
			
			System.out.println("Son multiplos de 3: ");
			for (int j=1;j<=100;j++) {
				if (j%3==0) {
				System.out.print(j + " ");	
				}
	}
	}
}
