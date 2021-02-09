package Ejer2_Tema0;

public class Ejer7 {
	public static void main(String[] args) {
		/*Hacer un pseudocódigo que imprima los números del 1 al 100. Que calcule la
suma de todos los números pares por un lado, y por otro, la de todos los
impares.
		 */

		int sumapares,sumaimpares;
		sumapares=0;
		sumaimpares=0;
		
		for (int i=1;i<=100;i++) {
			System.out.print(i + " ");
		}
		
		for (int i=0;i<=100;i=i+2) {
			sumapares=sumapares+i;
		}
		for (int j=1;j<=100;j=j+2) {
			sumaimpares=sumaimpares+j;
		}
			System.out.println(" ");
			System.out.println("La suma de los numeros pares es " + sumapares);
			System.out.println("La suma de los numeros impares es " + sumaimpares);
	}

}
