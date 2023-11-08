package EJERCICIOS_CONDICIONALES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido es = 29506922 | Resultado esperado: S | Resultado obtenido: S
 * Valor introducido es = 49094396 | Resultado esperado: E | Resultado obtenido: E 
 * Valor introducido es = 999999999 | Resultado esperado: L | Resultado obtenido: L 
 * Valor introducido es = 77816487 | Resultado esperado: N | Resultado obtenido: N
 * Valor introducido es = 123456789 | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es = -4 | Resultado esperado: Introduzca un numero de 8 cifras | Resultado obtenido: Introduzca un numero de 8 cifras
 * Valor introducido es = d | Resultado esperado: Eror, ha introducido la letra de su DNI y | Resultado obtenido: Eror, ha introducido la letra de su DNI
 *                          | Se introducirá el número 10000000 por defecto                 | Se introducirá el número 10000000 por defecto  
 *                          | La letra de su DNI es: Z                                      | La letra de su DNI es: Z 
 * */

public class Ejercicio2 {
	public static void main(String[] args) {
		
		int numeroDNI = 0, letra;
		
		char NIF = 'a';
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			
			System.out.println("Introduzca el numero de 8 cifras de su DNI sin la letra por favor: ");
			
			try {
				
				numeroDNI = sc.nextInt();
				
			} catch (InputMismatchException e) {
				
				numeroDNI = 10000000;
				System.out.println("Eror, ha introducido la letra de su DNI");
				System.out.println("Se introducirá el número " + numeroDNI + " por defecto");
				
			}
			
			if (numeroDNI > 99999999 || numeroDNI < 9999999) {
				
				System.out.println("Introduzca un numero de 8 cifras");
				
			}
			
		} while (numeroDNI > 99999999 || numeroDNI < 9999999);
		
	
		
		
		letra = numeroDNI % 23;
		
		
		
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
		
		
		System.out.print("La letra de su DNI es: " + NIF);
		
		
		sc.close();
	}

}
