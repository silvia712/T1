package Cadenas;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		/*Crea un programa que pida una frase
al usuario y diga cu�ntas palabras contiene (pista: puedes contar los
espacios, prestando atenci�n en que no est�n repetidos).
		 */
		String frase;
		int huecos;
		Scanner leer=new Scanner(System.in);
		huecos=0;
		
		System.out.println("Escribe una frase");
		frase=leer.nextLine();
		
		for (int i=0;i<frase.length();i++) {
			if (frase.substring(i,i+1).equals(" ")) {
				huecos++;
			}
		}System.out.println("En la frase hay " + (huecos+1) + " palabras ");
		
		
	}

}
