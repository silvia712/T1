package Ejer1_0;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		/*Teniendo en cuenta que la clave es �eureka�, escribir un algoritmo que nos pida una clave.
Solo tenemos 3 intentos para acertar, si fallamos los 3 intentos nos mostrara un
mensaje indic�ndonos que hemos agotado esos 3 intentos. (Recomiendo utilizar un interruptor). Si
acertamos la clave, saldremos directamente del programa.
		 */

		String contrase�a;
		Scanner leer=new Scanner(System.in);
		contrase�a="eureka";
		
	for (int i=1;i<=3;i++) {
		System.out.println("Escribe una contrase�a");
		contrase�a=leer.nextLine();
		
		if (contrase�a.equalsIgnoreCase("eureka")) {
			System.out.println("acertaste");
			break;
		}else {
			if (i==3) {
				System.out.println("Se han agotado los intentos");	
				}
			}		
		}
	}
}
