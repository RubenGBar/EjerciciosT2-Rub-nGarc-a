package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

/*
 * Valor introducido es = 89 | Resultado esperado: El numero en letra es: Ochenta y nueve | Resultado obtenido: El numero en letra es: Ochenta y nueve
 * Valor introducido es = 100 | Resultado esperado: El valor introducido es incorrecto | Resultado obtenido: El valor introducido es incorrecto 
 * Valor introducido es = -1 | Resultado esperado: El valor introducido es incorrecto | Resultado obtenido: El valor introducido es incorrecto 
 * Valor introducido es = 5 | Resultado esperado: El numero en letras es: cinco | Resultado obtenido: El numero en letras es: cinco
 * Valor introducido es = 26 | Resultado esperado: El numero en letras es: Veintiseis | Resultado obtenido: El numero en letras es: Veintiseis
 * */

public class Ejercicio4 {
	public static void main(String[] args) {
		
		int numero, unidad = 0, decena;
		
		String decenaLetra = "", concreto = "", unidadLetra = "";
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
		
		System.out.println("Introduzca un numero: ");
		
		numero = sc.nextInt();
		
		if (numero < 0 || numero > 99) System.out.println("El valor introducido es incorrecto");
		
		} while (numero < 0 || numero > 99);
		
		
		
		
		if (numero > 29) {
		
			unidad = numero%10;
			
		} else {
			
			unidad = numero;
			
		}
		
		decena = numero/10;
		
		
		
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
		
		switch (decena) {
		
		case 3 -> decenaLetra = "Treinta y ";
		
		case 4 -> decenaLetra = "Cuarenta y ";
		
		case 5 -> decenaLetra = "Cincuenta y ";
		
		case 6 -> decenaLetra = "Sesenta y ";
		
		case 7 -> decenaLetra = "Setenta y ";
		
		case 8 -> decenaLetra = "Ochenta y ";
		
		case 9 -> decenaLetra = "Noventa y ";
		
		}
		
		if (numero >= 0 && numero <= 9) {
			System.out.println("El numero en letras es: " + unidadLetra);
		}else if (numero >= 10 && numero <= 29 || numero == 20 || numero == 30 || numero == 40 
				|| numero == 50 || numero == 60 || numero == 70 || numero == 80 || numero == 90) {
			System.out.println("El numero en letras es: " + concreto);
		} else if (numero >= 30 && numero <= 99) {
			System.out.println("El numero en letra es: "  + decenaLetra + unidadLetra);
		}
		
		sc.close();
		
	}

}
