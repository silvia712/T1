package Ejer2_Tema0;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		/* Calcular el factorial de un número.
		 */

		int num, factorial;
		Scanner leer = new Scanner(System.in);
		factorial = 1;

		System.out.println("Escribe un numero");
		num = leer.nextInt();
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}

		System.out.println("El factorial de " + num + " es " + factorial);

	}

}
