package Vectores;

import java.util.Scanner;

public class Ejer5_funcion {

	public static void mostrarMatriz( String mGente[][]) {
		
		for (int i = 0; i < mGente.length; i++) {
			for (int j = 0; j < mGente[i].length; j++) {
				System.out.print(mGente[i][j] + " ");
			}
			System.out.println(" ");
		}	
	}
	
		
	public static void main(String[] args) {

		int cantidad;
		String mGente[][];
		Scanner leer = new Scanner(System.in);

		System.out.println("Cuantos nombres y sus edades quieres guardar?");
		cantidad = leer.nextInt();

		mGente = new String[cantidad][2];

		System.out.println("Escribe los nombres y sus edades");
		for (int i = 0; i < mGente.length; i++) {
			for (int j = 0; j < mGente[i].length; j++) {
				leer = new Scanner(System.in);// nuevo scanner por fallo al leer
				mGente[i][j] = leer.nextLine();
			}
		}
		mostrarMatriz(mGente);
	}
}
