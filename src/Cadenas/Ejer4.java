package Cadenas;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		/*Crea un programa que pida su
nombre al usuario y diga qué vocales contiene (en orden y sin repetir: por
ejemplo, para "Aurora" deberá responder "aou").
		 */
		String nombre, vocales;
		Scanner leer=new Scanner (System.in);
		vocales="aeiou";

		System.out.println("Escribe tu nombre");
		nombre=leer.nextLine();
		
		for (int i=0; i<nombre.length(); i++){
			for(int j=0; j<vocales.length(); j++) {
				if (nombre.substring(i,i+1).equalsIgnoreCase(vocales.substring(j,j+1))) {
					System.out.print(vocales.substring(j,j+1));					
				}
			}
		}
	}
}
