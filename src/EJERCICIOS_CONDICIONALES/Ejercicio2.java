package EJERCICIOS_CONDICIONALES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido es = 29506922 | Resultado esperado: S | Resultado obtenido: S
 * Valor introducido es = 49094396 | Resultado esperado: E | Resultado obtenido: E 
 * Valor introducido es = 999999999 | Resultado esperado: L | Resultado obtenido: L 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * */

public class Ejercicio2 {
	public static void main(String[] args) {
		
		int numeroDNI = 0, letra;
		
		boolean repetir = false;
		
		char NIF = 'a';
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
		System.out.println("Introduzca el numero de 8 cifras de su DNI sin la letra por favor: ");
		
		try {
			
			numeroDNI = sc.nextInt();
		
		} catch (InputMismatchException e) {
			
			System.out.println("Eror, ha introducido la letra de su DNI");
			
		}
		
		if (numeroDNI < 100000000 || numeroDNI > 0) {
			
			repetir = true;
			
		}
		
		} while(repetir);
		
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
