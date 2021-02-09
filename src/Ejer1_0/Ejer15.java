package Ejer1_0;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
	/* Dada una secuencia de números leídos por teclado, que acabe con un –1, por ejemplo:
	5,3,0,2,4,4,0,0,2,3,6,0,……,-1; Realizar el algoritmo que calcule la media aritmética. Suponemos
	que el usuario no insertara numero negativos.
	 */	
		float suma, i, num, media;
		Scanner leer=new Scanner(System.in);
		num=0;
		suma=1;
		i=-1;
				
		System.out.println("Inserta varios numeros. Cuando quieras parar pon -1");
		
		while (num!=-1) {
			num=leer.nextFloat();
			suma=suma+num;
			i=i+1;
		}
		System.out.println("La media de los numeros es " + (suma/i));		
	}
}
