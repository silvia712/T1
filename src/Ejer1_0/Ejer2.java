package Ejer1_0;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		/*Algoritmo que lea dos números, calculando y escribiendo el valor de su suma, resta, producto y
división.
		 */
		float num1,num2,suma,resta,producto;
		float division;
		num1=0;
		num2=0;
		Scanner leer = new Scanner(System.in);
	
		System.out.println("dime dos numeros");
			num1=leer.nextInt();
			num2=leer.nextInt();		
			
		System.out.println("Su suma es " + (num1+num2));
		System.out.println("Su resta es " + (num1-num2));
		System.out.println("Su producto " + (num1*num2) + " y su division " + (num1 / num2));
		
	}

}
