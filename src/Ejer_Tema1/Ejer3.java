package Ejer_Tema1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
	/*Realiza un algoritmo que nos indique si un triángulo es equilátero, isósceles o
escaleno.
*/

		int lado1, lado2, lado3;
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Escribe la longitud de los lados de un triangulo");
		lado1=leer.nextInt();
		lado2=leer.nextInt();
		lado3=leer.nextInt();
		
		if (lado1==lado2 && lado2==lado3) {
			System.out.println("Es un triangulo equilatero");
		}else
			if (lado1!=lado2 && lado2!=lado3 && lado3!=lado1) {
				System.out.println("Es un triangulo escaleno");
			}else {
				System.out.println("Es un triangulo isosceles");
			}			
	}
}
