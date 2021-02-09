package Ejer1_0;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
/*Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo
		que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables
		(recuerda la asignación).
				 */
		int num1,num2, aux;
				
		Scanner leer= new Scanner(System.in);
				
		System.out.println("Escribe dos numeros");
		num1=leer.nextInt();
		num2=leer.nextInt();
				
		aux=num1;
		num1=num2;
		num2=aux;
				
		System.out.println("Ahora, el valor del primer numero es " + num1 + " y el valor del segundo numero es " + num2);

	}

}
