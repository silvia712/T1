package Ejer1_0;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		/*Diseñar un algoritmo que pida por teclado tres números; si el primero es negativo, debe imprimir
el producto de los tres y si no lo es, imprimirá la suma.
*/
		int num1,num2,num3; 
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("escribe tres numeros");
		num1=leer.nextInt();
		num2=leer.nextInt();
		num3=leer.nextInt();
		
		if (num1<0) {
			System.out.println("el producto de los tres numeros es " + (num1*num2*num3));
		}
			else {
				System.out.println("la suma de los tres numeros es " + (num1+num2+num3));
			
		}	
	}

}
