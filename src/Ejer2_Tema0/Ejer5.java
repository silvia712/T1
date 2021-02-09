package Ejer2_Tema0;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		/*. Hacer un pseudocódigo que solo nos permita introducir S o N.
		 */
		
		String letra;
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Escribe una letra");
		letra=leer.nextLine();
	
		do {
			if (letra.equalsIgnoreCase("s") || letra.equalsIgnoreCase("n")){
				System.out.println("Acertaste");
				break;
			}else {			
			System.out.println("error en letra. Escribe s o n");
			letra=leer.nextLine();
			}
		} while (letra !="s" || letra!="n");
	 }
	}


