package Cadenas;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		/* Crea un programa que pida al usuario
		su nombre y apellidos y los muestre con las mayúsculas y minúsculas
		correctas (aparecerán en mayúsculas la primera letra y la que haya tras
		cada espacio; las demás aparecerán en minúsculas. Por ejemplo, si
		introduce "nAcho cabaNes", es escribirá "Nacho Cabanes").
				 */
		
		String nombre, mayus;
		mayus="";
		Scanner leer=new Scanner (System.in);
		
		System.out.println("Escribe tu nombre y apellidos");
		nombre=leer.nextLine();
		nombre=nombre.toLowerCase();
		mayus = nombre.substring(0, 1).toUpperCase();
		
		for (int i=1;i<nombre.length();i++) {
			if(nombre.substring(i,i+1).equals(" ")) {
				mayus = mayus + nombre.substring(i, i+2).toUpperCase();
				i++;// y todas las demas que haya en mayusculas
			}else {
				mayus=mayus+nombre.substring(i,i+1);// el resto en minusculas.
			}
		}System.out.println(mayus);

	}

}
