package Vectores;

import java.util.Scanner;

public class Ejer2 {

	public static float calcularMedia(float vNumeros[]) {
		
		float media,suma;
		media=0;
		suma=0;

		Scanner leer=new Scanner(System.in);
		
		for (int i=0; i<vNumeros.length; i++) {
			vNumeros[i]=leer.nextFloat();
			suma=suma+vNumeros[i];
			media=suma/vNumeros.length;
		}
	return media;	
	}
	
	
	public static void main(String[] args) {
	/*Realiza el problema anterior creando una función (subproceso)
“calcular_media” la cual reciba como parámetros un vector, el tamaño del
mismo y devuelve la media de los valores del vector.
	 */
		float media,vNumeros[];
		vNumeros=new float[10];
				
		
		System.out.println("Escribe diez numeros");
		media=calcularMedia(vNumeros);
		System.out.println("la media de todos los numeros es " + media);
	
	}

}
