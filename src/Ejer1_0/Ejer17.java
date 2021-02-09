package Ejer1_0;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {
		/*Algoritmo que lea números enteros hasta teclear 0, y nos muestre el máximo, el mínimo y la
		media de todos ellos. Piensa como debemos inicializar las variables.
		*/
		
		float numeros,suma,i,maximo,minimo;
		suma=1;
		i=-1;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Escribe tantos numeros como quieras hasta teclear 0");
		do {
			numeros=leer.nextInt();
			suma=suma+numeros;
			i=i+1;
			maximo=Math.max(numeros);
			minimo=Math.min(numeros, numeros);
			
		} while (numeros!=0);
		
		
		System.out.println("El maximo es" + maximo);
		System.out.println("El maximo es"+ minimo);
		System.out.println("La media es " + (suma/i));
	}

}
