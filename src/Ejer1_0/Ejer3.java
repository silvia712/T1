package Ejer1_0;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		/*Algoritmo que lea dos números y nos diga cual de ellos es mayor o bien si son iguales (recuerda
usar la estructura condicional SI)
		 */
		
		int num1,num2;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe dos numeros");
		num1=leer.nextInt();
		num2=leer.nextInt();		
		
		if (num1>=num2) {
			System.out.println("el mayor es " + num1);
		} else {
			System.out.println("el mayor es " + num2);

		}	

	}

}
