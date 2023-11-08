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

public class Ejercicio8 {
	public static void main(String[] args) {
		
		int distancia, tiempo;
		
		double precio, descuento;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			
		System.out.println("Introduzca la distancia que va a recorrer el tren en kilometros: ");
		
		distancia = sc.nextInt();
		
		if (distancia < 0) System.out.println("El valor introducido es erroeno, vuelva a introducirlo");
		
		} while (distancia < 0);
		
		
		do {
			
		System.out.println("Introduzca el tiempo de la estancia: ");
		
		tiempo = sc.nextInt();
		
		if (tiempo < 0) System.out.println("El valor introducido es erroeno, vuelva a introducirlo");
		
		} while (tiempo < 0);
		
		
		
		precio = distancia * 2.5;
		
		if (distancia >= 800 && tiempo >= 7) {
			
			descuento = ( (precio * 30) / 100);
			
			System.out.println("El precio original de su billete es de: " + (int)precio + " €");
			System.out.println("Por tener una estancia igual o superior a 7 dias y una estancia igual o superior a 800 kilometros, se le aplicara un descuento del 30%."
					+ " El cual es de: " + (int)descuento);
			
			System.out.println("Por lo que el precio con el descuento es de: " + (int)(precio - descuento) + " €");
			
		}else {
			
			System.out.println("El precio es de: " + (int)precio + " €");
			
		}
		
		sc.close();
		
	}

}
