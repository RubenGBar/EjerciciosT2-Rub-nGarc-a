package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado Obtenido
 * 		-646		 | Mensaje de error	  | Mensaje de error		
 * 		  8 		 | Capicua 			  | Capicua		
 *        15         | No capicua		  | No capicua		
 * 		  22		 | Capicua			  | Capicua		
 * 		  345		 | No capicua		  | No capicua		
 * 		  969		 | Capicua			  | Capicua		
 * 		  1854		 | No capicua		  | No capicua		
 * 		  5775		 | Capicua			  | Capicua
 * 	    52156544	 | Mensaje de error	  | Mensaje de error		
 * */

public class Ejercicio1 {
	public static void main(String[] args) {
		
		// Declaro las variables
		int numero;
		boolean capicua = false;

		// Creo el Scanner
		Scanner sc = new Scanner(System.in);

		// Solicito al usuario que introduzca un número entre 9999 y 0
		System.out.println("Introduzca un numero entre 9999 y 0: ");

		// Leo el valor de numero del teclado
		numero = sc.nextInt();

		// Verifico si el número es de un solo dígito
		if (numero < 10 && numero >= 0) {
		    capicua = true;
		} 
		// Verifico si el número es de dos dígitos y es divisible por 11
		else if (numero < 100 && numero > 9) {
		    capicua = numero % 11 == 0;
		} 
		// Verifico si el número es de tres dígitos y su primer y último dígito son iguales
		else if (numero < 1000 && numero > 99) {
		    capicua = numero / 100 == numero % 10;
		} 
		// Verifico si el número es de cuatro dígitos y sus dígitos extremos son iguales
		else if (numero < 10000 && numero > 999) {
		    capicua = numero % 10 == numero / 1000 && numero / 10 % 10 == numero / 100 % 10;
		}
		
		
		// Muestro el resultado según la evaluación de capicua que cambia a true si se cumple alguna de las condiciones anteriores
		if (capicua) {
		    System.out.println("El numero es capicua.");
		} else if (!capicua && numero < 10000 && numero >= 0) {
		    System.out.println("El numero no es capicua.");
		} else {
		    System.out.println("El valor introducido es erroneo.");
		}

		// Cierro el Scanner
		sc.close();
	}

}
