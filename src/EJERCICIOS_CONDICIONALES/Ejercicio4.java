package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado Obtenido
 * 89				 | Ochenta y nueve	  | Ochenta y nueve		
 * 100				 | Mensaje de error	  | Mensaje de error		
 * -1				 | Mensaje de error	  | Mensaje de error
 * 5				 | Cinco			  | Cinco		
 * 26				 | Veintiseis		  | Veintiseis
 * */

public class Ejercicio4 {
	public static void main(String[] args) {
	    // Declaro las variables
	    int numero, unidad = 0, decena;
	    String decenaLetra = "", concreto = "", unidadLetra = "";

	    // Creo el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Solicito al usuario que introduzca un n�mero entre 0 y 99
	    do {
	        System.out.println("Introduzca un numero: ");
	        numero = sc.nextInt();

	        // Verifico si el n�mero est� fuera del rango permitido
	        if (numero < 0 || numero > 99) {
	            System.out.println("El valor introducido es incorrecto");
	        }

	    } while (numero < 0 || numero > 99);

	    // Descompongo el n�mero en unidades y decenas
	    if (numero > 29) {
	        unidad = numero % 10;
	    } else {
	        unidad = numero;
	    }
	    decena = numero / 10;

	    
	    // Asigno las letras correspondientes a las unidades
		switch (unidad) {
		
		case 0 -> unidadLetra = "Cero";
		
		case 1 -> unidadLetra = "Uno";
		
		case 2 -> unidadLetra = "Dos";
		
		case 3 -> unidadLetra = "Tres";
		
		case 4 -> unidadLetra = "Cuatro";
		
		case 5 -> unidadLetra = "Cinco";
		
		case 6 -> unidadLetra = "Seis";
		
		case 7 -> unidadLetra = "Siete";
		
		case 8 -> unidadLetra = "Ocho";
		
		case 9 -> unidadLetra = "Nueve";
		
		}
		
		
		// Asigno las letras correspondientes a unos n�meros en concretos (del 10 al 29 y los multiplos de 10)
		switch (numero) {
		
		case 10 -> concreto = "Diez";
		
		case 11 -> concreto = "Once";
		
		case 12 -> concreto = "Doce";
		
		case 13 -> concreto = "Trece";
		
		case 14 -> concreto = "Catorce";
		
		case 15 -> concreto = "Quince";
		
		case 16 -> concreto = "Dicesiséis";
		
		case 17 -> concreto = "Dicisiete";
		
		case 18 -> concreto = "Dieciocho";
		
		case 19 -> concreto = "Diecinueve";
		
		case 20 -> concreto = "Veinte";
		
		case 21 -> concreto = "Veintiuno";
		
		case 22 -> concreto = "Veintidos";
		
		case 23 -> concreto = "Veintitres";
		
		case 24 -> concreto = "Veinticuatro";
		
		case 25 -> concreto = "Veinticinco";
		
		case 26 -> concreto = "Veintiseis";
		
		case 27 -> concreto = "Veintisiete";
		
		case 28 -> concreto = "Veintiocho";
		
		case 29 -> concreto = "Veintnueve";
		
		case 30 -> concreto = "Treinta";
		
		case 40 -> concreto = "Cuarenta";
		
		case 50 -> concreto = "Cincuenta";
		
		case 60 -> concreto = "Sesenta";
		
		case 70 -> concreto = "Setenta";
		
		case 80 -> concreto = "Ochenta";
		
		case 90 -> concreto = "Noventa";
		
		}
		
		
		// Asigno las letras correspondientes a las decenas
		switch (decena) {
		
		case 3 -> decenaLetra = "Treinta y ";
		
		case 4 -> decenaLetra = "Cuarenta y ";
		
		case 5 -> decenaLetra = "Cincuenta y ";
		
		case 6 -> decenaLetra = "Sesenta y ";
		
		case 7 -> decenaLetra = "Setenta y ";
		
		case 8 -> decenaLetra = "Ochenta y ";
		
		case 9 -> decenaLetra = "Noventa y ";
		
		}
		
		
		// Imprimo el n�mero en letras seg�n su rango
	    if (numero >= 0 && numero <= 9) {
	        System.out.println("El numero en letras es: " + unidadLetra);
	    } else if (numero >= 10 && numero <= 29 || numero == 20 || numero == 30 || numero == 40
	            || numero == 50 || numero == 60 || numero == 70 || numero == 80 || numero == 90) {
	        System.out.println("El numero en letras es: " + concreto);
	    } else if (numero >= 30 && numero <= 99) {
	        System.out.println("El numero en letra es: " + decenaLetra + unidadLetra);
	    }

	    // Cierro el Scanner
	    sc.close();
		
	}

}
