package Ejer2_Tema0;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
	/*Hacer un pseudocódigo que imprima el mayor y el menor de una serie de cinco
números que vamos introduciendo por teclado.
	 */
		
		int menor;
		int mayor;
		int num;
		menor=0;
		mayor=0;
		num=-1;//no puede ser 0;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dime un numero");
		num = leer.nextInt();
		mayor = num;
		menor = num;
		
		while (num!=0) {
			System.out.println("Dime un numero");
			num = leer.nextInt();
			
			if (num!=0) {
				if (num>mayor) {
					mayor = num;
				}
				if (num<menor) {
					menor= num;
				}
			}
		}
		
		System.out.println("El mayor es " + mayor + " y el menor " + menor);
	}

}
