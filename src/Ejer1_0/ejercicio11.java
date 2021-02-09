package Ejer1_0;
import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
	/* Algoritmo que nos diga si una persona puede acceder a cursar un ciclo formativo de grado
superior o no. Para acceder a un grado superior, si se tiene un titulo de bachiller, en caso de no
tenerlo, se puede acceder si hemos superado una prueba de acceso.
	 */
		String respuesta;

		Scanner leer=new Scanner(System.in);

		System.out.println("Para acceder a un grado superior tienes que tener el titulo de bachiller.Lo tienes?");
		respuesta=leer.nextLine();

		if (respuesta.equalsIgnoreCase("si")) {
				System.out.println("Perfecto. Puedes acceder");
		}else {
			System.out.println("Podrias acceder si tuvieras superada la prueba de acceso.La tienes?");
				respuesta=leer.nextLine();
				if(respuesta.equalsIgnoreCase("no")); {
					System.out.println("Lo sentimos pero no puedes acceder");
					}else {
						System.out.println("En ese caso, puedes acceder");
				}		
			}
		}
	}	
		
	
	


