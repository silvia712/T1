package Ejer1_0;

import java.util.Scanner;

public class Ejer7 {

public static void main(String[] args) {
/*Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el curso actual.
Dise�ar un algoritmo para este prop�sito (recuerda que para calcular el porcentaje puedes hacer una
regla de 3).
*/
		float ni�os, ni�as; 
		Scanner leer= new Scanner(System.in);
				
		System.out.println("numero de ni�os en el centro");
		ni�os=leer.nextInt();		
		System.out.println("numero de ni�as");
		ni�as=leer.nextInt();
				
		System.out.println("el porcentaje de ni�os es " + (ni�os*100/(ni�os+ni�as)) + " y el de ni�as " + (ni�as*100/(ni�os+ni�as))); 
				

	}

}
