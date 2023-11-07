package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

/*
 * Valor introducido es = -1500 | Resultado esperado: 1500 | Resultado obtenido: 1500
 * Valor introducido es = -9 | Resultado esperado: 9 | Resultado obtenido: 9 
 * Valor introducido es = 8 | Resultado esperado: 8 | Resultado obtenido: 8 
 * Valor introducido es = 5 | Resultado esperado: 5 | Resultado obtenido: 5
 * */

public class Ejercicio5 {
	public static void main(String[] args) {
		
		int numero, absoluto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero para calcular su valor absoulto: ");
		
		numero = sc.nextInt();
		
		absoluto = numero > 0 ? numero : numero * -1;
		
		System.out.println("El valor absoluto de " + numero + " es: " + absoluto);
		
		sc.close();
		
	}

}
