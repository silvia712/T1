package Vectores;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
	
		/*Crea un vector con un tama�o de 10, el algoritmo te solicitar� por teclado 10
n�meros y terminar� mostrando por pantalla la media de valores del vector.
	 */
		
		float suma=0;
		float vNumeros[]=new float[10];
				
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribe diez numeros");
		for (int i=0; i<vNumeros.length; i++) {
			vNumeros[i]=leer.nextFloat();
			suma=suma+vNumeros[i];
			}
			System.out.println("la media de todos los numeros es " + (suma/vNumeros.length));
		}
	}

