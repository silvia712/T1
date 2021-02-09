package Ejer2_Tema0;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		/*Hacer un pseudocódigo que cuente las veces que aparece una determinada
letra en una frase que introduciremos por teclado.
		 */
		
		String frase,letra;
		int suma;
		suma=0;
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Escribe una frase");
		frase=leer.nextLine();
		System.out.println("Que letra quieres buscar?");
		letra=leer.nextLine();
		
		for (int i=0;i<frase.length();i++) {
			if (frase.substring(i,i+1).equalsIgnoreCase(letra)){
				suma=suma+1;
			}
			
		}System.out.println("La letra "+ letra + " aparece " + suma + " veces");
		
	}

}
