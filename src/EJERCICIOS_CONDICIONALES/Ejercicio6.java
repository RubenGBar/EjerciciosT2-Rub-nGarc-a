package EJERCICIOS_CONDICIONALES;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado Obtenido
 * 30				 | Mensaje por acertar| Mensaje por acertar
 * 59				 | Mensaje por fallar | Mensaje por fallar
 * g				 | Mensaje de error	  | Mensaje de error
 * */

public class Ejercicio6 {
	public static void main(String[] args) {
	    // Creo el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Creo un objeto para poder generar números aleatorios
	    Random rand = new Random();

	    // Genero dos números aleatorios entre 1 y 100 para sumar
	    int suma1 = rand.nextInt(1, 100);
	    int suma2 = rand.nextInt(1, 100);

	    // Declaro variables para la respuesta del usuario y la suma de los números aleatorios
	    int respuestaSuma, sumaRandoms;

	    // Imprimo la suma que el usuario debe resolver
	    System.out.println("La suma de " + suma1 + " y " + suma2 + " es: ");

	    // Le el valor de respuestaSuma del teclado y manejo los errores que puedan aparecer con un try catch
	    try {
	        respuestaSuma = sc.nextInt();
	    } catch (InputMismatchException e) {
	        // En caso de que se introduzca un valor no válido, se asigna 0 como respuesta
	        respuestaSuma = 0;
	        System.out.println("Has introducido un valor erroneo ");
	        System.out.println("Se introducira " + respuestaSuma + " como el valor de tu respuesta");
	    }

	    // Calculo la suma real de los números aleatorios
	    sumaRandoms = suma1 + suma2;

	    // Comparo la respuesta del usuario con la suma real y doy un mensaje según el valor de la condición
	    if (respuestaSuma == sumaRandoms) {
	        System.out.println("¡Bien! Acertaste.");
	    } else {
	        System.out.println("Vaya, te equivocaste :(");
	    }

	    // Cierro el Scanner
	    sc.close();
		
	}

}
