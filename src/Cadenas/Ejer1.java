package Cadenas;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		/*: Crea un programa que pida su
nombre al usuario y lo escriba al revés (de la última letra a la primera: a
partir de "Nacho" escribiría "ohcaN").
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
