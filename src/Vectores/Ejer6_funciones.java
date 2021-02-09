package Vectores;

import java.util.Random;
import java.util.Scanner;

public class Ejer6_funciones {

	public static void aleatorio (int mTabla[][]) {
		
		Random azar = new Random();

		for (int i = 0; i < mTabla.length; i++) {
			for (int j = 0; j < mTabla[i].length; j++) {
				mTabla[i][j] = azar.nextInt(9);
			}
		}
	}
	
	public static void  pintarMatriz (int mTabla[][]) {
		
		for (int i = 0; i < mTabla.length; i++) {
			for (int j = 0; j < mTabla[i].length; j++) {
				System.out.print(mTabla[i][j] + " ");
			}
			System.out.println(" ");
		}	
	}
	
	
	public static void main(String[] args) {

		int columnas, filas;
		Scanner leer = new Scanner(System.in);

		System.out.println("Escribe numeros de filas y de columnas");
		filas = leer.nextInt();
		columnas = leer.nextInt();

		int mTabla[][] = new int[filas][columnas];

		aleatorio(mTabla);
		pintarMatriz(mTabla);
	}
}
