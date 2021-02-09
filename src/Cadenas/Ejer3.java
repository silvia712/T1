package Cadenas;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
	/*Crea un programa que pida su
nombre al usuario y diga cuántas vocales contiene (por ejemplo, "Aurora"
tiene 4 vocales).
	 */

		String nombre, vocales;
		int suma;
		Scanner leer= new Scanner(System.in);
		vocales="aeiou";
		suma=0;
		
	System.out.println("Escribe tu nombre");
	nombre=leer.nextLine();
		
	for (int i=0; i<nombre.length(); i++) {
		for (int j=0; j<vocales.length();j++) {
			if (nombre.substring(i,i+1).equalsIgnoreCase(vocales.substring(j,j+1))) {
				suma++;	// suma=suma+1
			} 	
		}
		}System.out.println("En tu nombre hay " + suma + " vocales ");
	}
	}


