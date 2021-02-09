package Vectores;

import java.util.Scanner;

public class Ejer3 {
	
	public static void calculoMultiplos(int vMultiplos[],int num) {
				
		System.out.println("Son multiplos de " + num);
		for (int i=0;i<vMultiplos.length;i++) {
			vMultiplos[i]=num*i;	
			System.out.print(vMultiplos[i] + " ");
		} 	
	}	
		

	public static void main(String[] args) {
	/*Crea un vector en el que le indiques el tamaño por teclado y crear una función
que rellene el vector con los múltiplos de un número pedido por teclado.
	 */
		int num,multiplos,vMultiplos[];
		Scanner leer= new Scanner(System.in);
			
		System.out.println("Escribe un numero y los multiplos que quieres de el");
		num=leer.nextInt();
		multiplos=leer.nextInt();
		
		vMultiplos=new int[multiplos];
		
		calculoMultiplos(vMultiplos, num);
	}

}
