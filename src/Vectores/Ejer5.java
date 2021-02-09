package Vectores;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		/* Haz lo mismo que el ejercicio anterior pero con una Matriz. Ten en cuenta que
		 * no podemos tener una columna con cadena y otra con números, así que usa la
		 * función convertiratexto(numero) para las celdas de las edades. Piensa cuantas
		 * columnas y filas deberá tener la matriz, también de qué forma deberemos
		 * recorrerla según lo que nos pide.
		 */

		int cantidad;
		String mGente[][];
		Scanner leer = new Scanner(System.in);

		System.out.println("Cuantos nombres y sus edades quieres guardar?");
		cantidad = leer.nextInt();
		
		mGente = new String[cantidad][2];

		System.out.println("Escribe los nombres y sus edades");
		for (int i=0; i<mGente.length; i++) {
			for (int j=0; j<mGente[i].length; j++) {
				leer = new Scanner(System.in);//nuevo scanner por fallo al leer
				mGente[i][j] = leer.nextLine();
			}
		}
			for (int i=0; i<mGente.length; i++) {
				for (int j=0; j<mGente[i].length; j++) {
				System.out.print(mGente[i][j] + " ");
				}	
				System.out.println(" ");
			}
		}
	}

