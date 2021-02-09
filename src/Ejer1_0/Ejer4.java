package Ejer1_0;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
/*Algoritmo que lea tres números distintos y nos diga cual de ellos es el mayor (recuerda usar la
estructura condicional Si y los operadores lógicos).
		 */
		int num1,num2,num3;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("escribe tres numeros");
		num1=leer.nextInt();
		num2=leer.nextInt();
		num3=leer.nextInt();

		if (num1>=num2 && num1>=num3) {
			System.out.println("el mayor es " + num1);
		} else 
			if (num2>=num1 && num2>=num3){
			System.out.println("el mayor es " + num2);
			}else {
				System.out.println("el mayor es " + num3);
			}

	}

}
