package Ejer1_0;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {
	/*Leer tres n�meros que denoten una fecha (d�a, mes, a�o). Comprobar que es una fecha v�lida.
Si no es v�lida escribir un mensaje de error. Si es v�lida escribir la fecha cambiando el n�mero del
mes por su nombre. Ej. si se introduce 1 2 2006, se deber� imprimir �1 de febrero de 2006�. El a�o
debe ser mayor que 0. (Recuerda la estructura segun sea).
	 */

		int dia,mes,year;
		Scanner leer =new Scanner(System.in);
		
		System.out.println("Escribe una fecha (dd mm aaaa)");
		dia=leer.nextInt();
		mes=leer.nextInt();
		year=leer.nextInt();
		
		if ((dia>=1 && dia<=31) && (mes>=1 && mes<=12) && (year>0)) {
			System.out.print(dia);
			
				switch (mes) {
		case 1:
			System.out.print(" de Enero de ");
			break;
		case 2:
			System.out.print(" de Febrero de ");
			break;
		case 3: 
			System.out.print(" de Marzo de ");
			break;
		case 4:
			System.out.print(" de Abril de ");
			break;
		case 5:
			System.out.print(" de Mayo de ");
			break;
		case 6:
			System.out.print(" de Junio de ");
			break;
		case 7:
			System.out.print(" de Julio de ");
			break;
		case 8:
			System.out.print(" de Agosto de ");
			break;
		case 9:
			System.out.print(" de Septiembre de ");
			break;
		case 10:
			System.out.print(" de Octubre de ");
			break;
		case 11:
			System.out.print(" de Noviembre de ");
			break;
		case 12:
			System.out.print(" de Diciembre de ");
			break;
				}
			System.out.print(year);

		}else {
			System.out.print("error de fecha");
		}
	}
}
