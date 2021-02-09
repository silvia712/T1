package Ejer_Tema1;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		/* Realiza un algoritmo para saber si el número introducido es par o impar.
		 */

		int num; 
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		num=leer.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Es un numero par");
		}else {
			System.out.println("Es un numero impar");
		}
	}
}
