package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado Obtenido
 * 90000, 50 y 1000	 | Mensaje felicitando| Mensaje felicitando 		
 * 90000, 50 y 1900	 | Mensaje regañando  | Mensaje regañando		
 * 0, 10 y 2000		 | Mensaje regañando  | Mensaje regañando		
 * 50000, 0 y 100    | Mensaje de error   | Mensaje de error		
 * 50000, 10 y 0	 | Mensaje de error	  | Mensaje de error
 * */

public class Ejercicio3 {
	public static void main(String[] args) {
	    // Declaro las variables
	    int comidaCompradaDiariamente, numeroDeAnimales, kilosComidosTotales;
	    double kilosDiariosMedios;

	    // Creo el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Solicito al usuario que introduzca la cantidad de comida comprada diariamente para cada animal
	    do {
	        System.out.println("Introduzca la cantidad de comida comprada diariamente para cada animal: ");
	        comidaCompradaDiariamente = sc.nextInt();

	        // Verifico si la cantidad de comida comprada diariamente es 0
	        if (comidaCompradaDiariamente == 0) {
	            System.out.println("Se van a morir de hambre los pobres ");
	        }

	        // Solicito al usuario que introduzca la cantidad total de animales
	        System.out.println("Introduzca la cantidad total de animales: ");
	        numeroDeAnimales = sc.nextInt();

	        // Verifico si la cantidad total de animales es 0
	        if (numeroDeAnimales == 0) {
	            System.out.println("No creo que puedas tener una granja sin animales ");
	        }

	        // Solicito al usuario que introduzca la cantidad de kilos que consumen en total todos los animales
	        System.out.println("Introduzca la cantidad de kilos que consumen en total todos los animales: ");
	        kilosComidosTotales = sc.nextInt();

	        // Verifico si la cantidad total de kilos consumidos es 0
	        if (kilosComidosTotales == 0) {
	            System.out.println("No creo que ninguno de tus animales no coma nada");
	        }

	    } while (comidaCompradaDiariamente == 0 || numeroDeAnimales == 0 || kilosComidosTotales == 0);

	    // Calculo los kilos diarios medios por animal
	    kilosDiariosMedios = (double) comidaCompradaDiariamente / numeroDeAnimales;

	    // Comparo los kilos diarios medios con la cantidad total de kilos consumidos y muestro un mensaje según el valor de la condición
	    if (kilosDiariosMedios > kilosComidosTotales) {
	        System.out.println("Bien!! Tus animales no se mueren de hambre ");
	    } else if (kilosDiariosMedios < kilosComidosTotales) {
	        System.out.println("Deberías comprar más comida ");
	    } else if (kilosDiariosMedios == kilosComidosTotales) {
	        System.out.println("Vas justo de comida, compra algo más por si acaso ");
	    }

	    // Cierro el Scanner
	    sc.close();
		
	}

}
