package Cadenas;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		/*: Crea un programa que pida su
nombre al usuario y lo escriba al rev�s (de la �ltima letra a la primera: a
partir de "Nacho" escribir�a "ohcaN").
		 */
		
		String nombre;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribe tu nombre");
		nombre=leer.nextLine();
		
		for (int i=nombre.length()-1; i>=0; i--){
			System.out.print(nombre.substring(i,i+1));	
		}
	}

}
