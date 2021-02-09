package Ejer1_0;
import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		/*Realizar un algoritmo que dado un número entero, visualice en pantalla si es par o impar. En el
		caso de ser 0, debe visualizar “el número no es par ni impar” (para que un numero sea par, se debe
		dividir entre dos y que su resto sea 0)
			 */

			int num; 
			Scanner leer= new Scanner(System.in);
				
			System.out.println("escribe un numero");
			num=leer.nextInt();
			
			if (num==0) {
				System.out.println("el numero no es par ni impar ");
				} else if (num % 2==0){
				System.out.println("es un numero par ");
			}
				else {
				System.out.println("es un numero es impar ");
		}		
				
	}

}
