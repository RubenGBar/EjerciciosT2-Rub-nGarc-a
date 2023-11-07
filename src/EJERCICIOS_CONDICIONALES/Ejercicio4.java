package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

/*
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido:  
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido:  
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * */

public class Ejercicio4 {
	public static void main(String[] args) {
		
		int numero, unidad, decena;
		
		String decenaLetra = "", concreto = "", unidadLetra = "";
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
		
		System.out.println("Introduzca un número: ");
		
		numero = sc.nextInt();
		
		if (numero < 0 || numero > 99) System.out.println("El valor introducido es incorrecto");
		
		} while (numero < 0 || numero > 99);
		
		
		unidad = numero%10;
		
		decena = numero/10;
		
		
		
		switch (unidad) {
		
		case 0 -> unidadLetra = " cero";
		
		case 1 -> unidadLetra = " uno";
		
		case 2 -> unidadLetra = " dos";
		
		case 3 -> unidadLetra = " tres";
		
		case 4 -> unidadLetra = " cuatro";
		
		case 5 -> unidadLetra = " cinco";
		
		case 6 -> unidadLetra = " seis";
		
		case 7 -> unidadLetra = " siete";
		
		case 8 -> unidadLetra = " ocho";
		
		case 9 -> unidadLetra = " nueve";
		
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
			System.out.println("El número en letras es: " + unidadLetra);
		}else if (numero >= 10 && numero <= 99) {
			
		}
		
		sc.close();
		
	}

}
