package Ejer_Tema1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		/*Realiza un algoritmo que muestre la tabla de multiplicar del número que se introduzca.
		 */
		
		int num,tabla;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("De que numero quieres la tabla de multiplicar?");
		num=leer.nextInt();
		for (int i=0;i<=10;i++) {
			tabla=num*i;
			System.out.println(num + " x " + i + " = " + tabla);		
		}
	}
}
