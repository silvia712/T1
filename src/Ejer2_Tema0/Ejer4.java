package Ejer2_Tema0;

public class Ejer4 {

	public static void main(String[] args) {
		/*Hacer un programa que imprima la suma de los 100 primeros números.
		 */

		int suma;
		suma=0;
		
		for (int i=1;i<=100;i++) {
			suma=suma+i;	
		}
		System.out.println("la suma de todos los numeros hasta 100 es " + suma);
	}

}
