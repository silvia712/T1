package Ejer1_0;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		/*Una tienda ofrece un descuento del 15% sobre el total de la compra durante el mes de octubre.
Dado un mes y un importe, calcular cuál es la cantidad que se debe cobrar al cliente.
		 */
		
		float precio;
		String mes;
		Scanner leerFloat=new Scanner(System.in);
		Scanner leer=new Scanner(System.in);
		mes="";
		precio=0;
		
		System.out.println("Precio del producto");
		precio=leerFloat.nextFloat();
		System.out.println("Mes de la compra (letras)");
		mes=leer.nextLine();
		
		if (mes.equalsIgnoreCase("octubre")){
			System.out.println("Tienes un descuento de un 15%. Precio a pagar " + (precio*0.85) );
			}else {
			System.out.println("No tienes ningun descuento. Precio a pagar " + precio);
			}
	}
}
