package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

/*
 * Valor introducido es = 500 y 15 | Resultado esperado: El precio es de: 1250 € | Resultado obtenido: El precio es de: 1250 €
 * Valor introducido es = 952 y 2  | Resultado esperado: El precio es de: 2380 € | Resultado obtenido: El precio es de: 2380 € 
 * Valor introducido es = 1500 y 8 | Resultado esperado: El precio original de su billete es de: 3750 € y | Resultado obtenido: El precio original de su billete es de: 3750 € y
 *                                 | Por tener una estancia igual o superior a 7 dias y una estancia igual| Por tener una estancia igual o superior a 7 dias y una estancia igual
 *                                 | o superior a 800 kilometros, se le aplicara un descuento del 30%.    | o superior a 800 kilometros, se le aplicara un descuento del 30%.
 *                                 | El cual es de: 1125 €                                                | El cual es de: 1125 €
 *                                 | Por lo que el precio con el descuento es de: 2625 €                  | Por lo que el precio con el descuento es de: 2625 € 
 * */

/*
 * Valor introducido | Resultado esperado | Resultado Obtenido
 * 500 y 15			 | 1250				  | 1250
 * 952 y 2			 | 2380				  | 2380
 * 1500 y 8			 | 2625				  | 2625
 * */

public class Ejercicio8 {
	public static void main(String[] args) {
		
		// Declaración de variables para la distancia, el tiempo, el precio y el descuento.
		int distancia, tiempo;
		double precio, descuento;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle do-while para garantizar que la distancia introducida sea válida (mayor o igual a 0).
		do {
		    System.out.println("Introduzca la distancia que va a recorrer el tren en kilómetros: ");
		    distancia = sc.nextInt();
		    if (distancia < 0) 
		        System.out.println("El valor introducido es erróneo, vuelva a introducirlo");
		} while (distancia < 0);

		// Bucle do-while para garantizar que el tiempo introducido sea válido (mayor o igual a 0).
		do {
		    System.out.println("Introduzca el tiempo de estancia: ");
		    tiempo = sc.nextInt();
		    if (tiempo < 0) 
		        System.out.println("El valor introducido es erróneo, vuelva a introducirlo");
		} while (tiempo < 0);

		// Cálculo del precio del billete (distancia multiplicada por 2.5).
		precio = distancia * 2.5;

		// Comprobación de condiciones para aplicar el descuento.
		if (distancia >= 800 && tiempo >= 7) {
		    // Cálculo del descuento (30% del precio original).
		    descuento = (precio * 30) / 100;

		    // Impresión del precio original y el descuento aplicado.
		    System.out.println("El precio original de su billete es de: " + (int)precio + " €");
		    System.out.println("Por tener una estancia igual o superior a 7 días y una distancia igual o superior a 800 kilómetros, "
		            + "\nse le aplicará un descuento del 30%, el cual es de: " + (int)descuento + " €");

		    // Impresión del precio con el descuento aplicado.
		    System.out.println("Por lo que el precio con el descuento es de: " + (int)(precio - descuento) + " €");
		} else {
		    // Si no se cumplen las condiciones para el descuento, imprimir el precio original.
		    System.out.println("El precio es de: " + (int)precio + " €");
		}

		// Cierre del objeto Scanner.
		sc.close();
		
	}

}
