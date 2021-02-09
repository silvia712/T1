package Ejer1_0;
import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		/*Se pide representar el algoritmo que nos calcule la suma de los N primeros números pares. Es
decir, si insertamos un 5, nos haga la suma de 6+8+10+12+14.
		 */
		int num,suma;
		suma=0;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("escribe un numero"); 
		num=leer.nextInt();
	
		for (int i=num;i<=100;i++) {
			if (i%2==0) {
				suma=suma+i;
			}
			
		}System.out.println("la suma de los pares es " + suma); 
		
	}

}
