package Ejer1_0;
import java.util.Scanner;

public class Ejer13 {

public static void main(String[] args) {
	/*Se pide representar el algoritmo que nos calcule la suma de los N primeros números naturales.
N se leerá por teclado (no tenemos porque llamar a la variable N, podemos llamarla como
queramos).
	 */

	int suma,num;
	Scanner leer= new Scanner(System.in);
	suma=0;
	
	System.out.println("Escribe un numero"); 
	num=leer.nextInt();

	for (int i=1;i<num;i++) {
		suma=suma+i;
	}System.out.println("La suma de todos los numeros hasta " + num + " es " + suma); 
	

	}

}
