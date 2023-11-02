package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		int numero, unidad, centena3cifras, centena4cifras, millar;
		
		boolean capicua;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número entre 9999 y 0: ");
			
		numero = sc.nextInt();
		
		if (numero > 9999 && numero < 0) {
			System.out.println("El valor introducido es erróneo");
		} else if (numero <= 9) {
			capicua = true;
		} else if (numero <= 99 && numero >= 10 && numero % 11 == 0) {
			capicua = true;
		} else if (numero <= 999 && numero >= 100) {
			centena3cifras = numero / 100;
			unidad = numero % 10;
		} else if (numero <= 9999 && numero >= 1000) {
			System.out.println();
		}
		
		sc.close();
	}

}
