package Ejer1_0;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
	/*Modificar el algoritmo anterior, de forma que si se teclea un cero, se vuelva a pedir el número
		por teclado (así hasta que se teclee un número mayor que cero) (recuerda la estructura mientras).
	*/

		int num;
		Scanner leer=new Scanner(System.in);
		num=0;
					
		while (num==0) {
			System.out.println("Escribe un numero");
			num=leer.nextInt();
		}
				
		if (num % 2==0){
			System.out.println("es un numero par ");
		}else {
			System.out.println("es un numero es impar ");
			}			
		}
	}

