package EJERCICIOS_CONDICIONALES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado Obtenido
 * 29506922			 | S 				  | S		
 * 49094396			 | E				  | E		
 * 99999999			 | R				  | R		
 * 123456789		 | Mensaje de error	  | Mensaje de error		
 * -4				 | Mensaje de error	  | Mensaje de error
 * d				 | Mensaje de error	  | Mensaje de error 		
 * */

public class Ejercicio2 {
	public static void main(String[] args) {
	    // Declaro las variables
	    int numeroDNI = 0, letra;
	    char NIF = 'a';

	    // Creo el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Solicito al usuario que introduzca el número de 8 cifras de su DNI sin la letra
	    do {
	        System.out.println("Introduzca el numero de 8 cifras de su DNI sin la letra por favor: ");

	        try {
	            // Leo el valor de numeroDNI del teclado
	            numeroDNI = sc.nextInt();
	        } catch (InputMismatchException e) {
	            // Si el usuario ingresa la letra del DNI muestro un mensaje de error e introduzco un valor a numeroDNI
	            numeroDNI = 10000000;
	            System.out.println("Error, ha introducido la letra de su DNI");
	            System.out.println("Se introducira el numero " + numeroDNI + " por defecto");
	        }

	        // Verifico si el númeroDNI no tiene 8 cifras
	        if (numeroDNI > 99999999 || numeroDNI < 9999999) {
	            System.out.println("Introduzca un numero de 8 cifras");
	        }

	    } while (numeroDNI > 99999999 || numeroDNI < 9999999);

	    // Calculo la letra correspondiente al DNI
	    letra = numeroDNI % 23;

	    // Uso un switch para asignar la letra según el resultado del cálculo
		switch (letra) {
		
		case 0 -> NIF = 'T';
		
		case 1 -> NIF = 'R';
		
		case 2 -> NIF = 'W';
		
		case 3 -> NIF = 'A';
		
		case 4 -> NIF = 'G';
		
		case 5 -> NIF = 'M';
		
		case 6 -> NIF = 'Y';
		
		case 7 -> NIF = 'F';
		
		case 8 -> NIF = 'P';
		
		case 9 -> NIF = 'D';
		
		case 10 -> NIF = 'X';
		
		case 11 -> NIF = 'B';
		
		case 12 -> NIF = 'N';
		
		case 13 -> NIF = 'J';
		
		case 14 -> NIF = 'Z';
		
		case 15 -> NIF = 'S';
		
		case 16 -> NIF = 'Q';
		
		case 17 -> NIF = 'V';
		
		case 18 -> NIF = 'H';
		
		case 19 -> NIF = 'L';
		
		case 20 -> NIF = 'C';
		
		case 21 -> NIF = 'K';
		
		case 22 -> NIF = 'E';
		
		}
		
		// Muestro la letra correspondiente al DNI
	    System.out.print("La letra de su DNI es: " + NIF);

	    // Cierro el Scanner
	    sc.close();
	}

}
