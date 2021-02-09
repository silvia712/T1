package Ejer2_Tema0;

import java.util.Scanner;

public class Ejer10_funcion {
	
	
	public static int sumaletra(String frase,String letra) {
			int suma;
			suma=0;
		
			for (int i = 0; i < frase.length(); i++) {
				if (frase.substring(i, i + 1).equalsIgnoreCase(letra)) {
					suma++;
		}
	}
	return suma;
}


	public static void main(String[] args) {
		
		/* Hacer un pseudocódigo que cuente las veces que aparece una determinada letra
		 * en una frase que introduciremos por teclado.
		 */

		String frase, letra;
		Scanner leer = new Scanner(System.in);

		System.out.println("Escribe una frase");
		frase = leer.nextLine();
		System.out.println("Que letra quieres buscar?");
		letra = leer.nextLine();
		
		System.out.println("La letra " + letra + " aparece " + sumaletra(frase,letra)+ " veces");
	}

}
