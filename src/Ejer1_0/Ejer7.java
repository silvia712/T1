package Ejer1_0;

import java.util.Scanner;

public class Ejer7 {

public static void main(String[] args) {
/*Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso actual.
Diseñar un algoritmo para este propósito (recuerda que para calcular el porcentaje puedes hacer una
regla de 3).
*/
		float niños, niñas; 
		Scanner leer= new Scanner(System.in);
				
		System.out.println("numero de niños en el centro");
		niños=leer.nextInt();		
		System.out.println("numero de niñas");
		niñas=leer.nextInt();
				
		System.out.println("el porcentaje de niños es " + (niños*100/(niños+niñas)) + " y el de niñas " + (niñas*100/(niños+niñas))); 
				

	}

}
