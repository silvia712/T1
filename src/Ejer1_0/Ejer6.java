package Ejer1_0;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
/*Realizar un algoritmo que lea un n�mero por teclado. En caso de que ese n�mero sea 0 o menor
que 0, se saldr� del programa imprimiendo antes un mensaje de error. Si es mayor que 0, se deber�
calcular su cuadrado y la raiz cuadrada del mismo, visualizando el numero que ha tecleado el
usuario y su resultado (�Del numero X, su potencia es X y su raiz X� ). Para calcular la raiz
cuadrada se puede usar la funci�n interna RAIZ(X) o con una potencia de 0,5.
		 */

		int num1; 
		Scanner leer=new Scanner(System.in);
		
		System.out.println("escribe un numero");
		num1=leer.nextInt(); 
		
	
		if (num1>0) {
			System.out.println("Su cuadrado es " + Math.pow(num1,2) + " y su raiz cuadrada " + Math.sqrt(num1));
		}
		else {
			System.out.println("error de numero ");
			
		}
	}

}
