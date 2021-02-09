package Cadenas;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
	/*Crea un programa que pida su
nombre al usuario y lo escriba alternando letras mayúsculas y minúsculas
(por ejemplo, "nAcho" se mostraría como "NaChO".
	 */
		
		String nombre;
		Scanner leer=new Scanner(System.in);
			
		System.out.println("Escribe un nombre");
		nombre=leer.nextLine();
		
		for (int i=0; i<nombre.length();i++) {
			if (i % 2 == 0) {
				System.out.print(nombre.substring(i,i+1).toUpperCase());
			}else {
				System.out.print(nombre.substring(i,i+1).toLowerCase());
			}
	}
	}
}
