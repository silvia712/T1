package Ejer2_Tema0;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		/*Imprimir y contar los múltiplos de 3 desde la unidad hasta un número que
introducimos por teclado.
		 */
		
		int num,suma;
		Scanner leer=new Scanner(System.in);
		suma=0;
		
		System.out.println("Escribe un numero");
		num=leer.nextInt();
		
		System.out.print("Los multiplos de 3 desde 1 hasta " + num + " son: ");
		for (int i=1;i<num;i++) {
			if (i % 3 ==0) {
				suma++;
				System.out.print(i + " ");	
				}
			}	System.out.println("\nUn total de " + suma);		
		}
	}


