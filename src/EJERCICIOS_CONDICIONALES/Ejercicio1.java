package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

/*
 * Valor introducido es = -646 | Resultado esperado: El valor introducido es erróneo. | Resultado obtenido: El valor introducido es erróneo. 
 * Valor introducido es = 8 | Resultado esperado: El número es capicúa. | Resultado obtenido: El número es capicúa. 
 * Valor introducido es = 15 | Resultado esperado: El número no es capicúa. | Resultado obtenido: El número no es capicúa. 
 * Valor introducido es = 22 | Resultado esperado: El número es capicúa. | Resultado obtenido: El número es capicúa. 
 * Valor introducido es = 345 | Resultado esperado: El número no es capicúa. | Resultado obtenido: El número no es capicúa. 
 * Valor introducido es = 969 | Resultado esperado: El número es capicúa. | Resultado obtenido: El número es capicúa. 
 * Valor introducido es = 1854 | Resultado esperado: El número no es capicúa. | Resultado obtenido: El número no es capicúa. 
 * Valor introducido es = 5775 | Resultado esperado: El número es capicúa. | Resultado obtenido: El número es capicúa.
 * Valor introducido es = 52156544 | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado: El valor introducido es erróneo. | Resultado obtenido: El valor introducido es erróneo.
 * */

public class Ejercicio1 {
	public static void main(String[] args) {
		
		//Declaro la variable para guardar el numero introducido por el usuario
		int numero;
		
		//Declaro una variable booleana para cambiarla a true si el número es capicúa 
		boolean capicua = false;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Muestro por pantalla un mensaje con las instrucciones de la función
		System.out.println("Introduzca un número entre 9999 y 0: ");
		
		//Leo el valor de numero del teclado
		numero = sc.nextInt();
		
		if (numero < 10 && numero >= 0) {/*Si el número está entre 0 y 9 cambio la variable capicua a true*/
			capicua = true;
		} else if (numero < 100 && numero > 9) {/*Creo un condicional con el que solo tengo en cuenta los 
												números entre 10 y 99*/
			
			capicua = numero % 11 == 0;/*Si el resto del número al dividirlo entre 11 es 0 la variable 
										capicúa será true*/
			
		} else if (numero < 1000 && numero > 99) {/**/
			
			capicua = numero / 100 == numero % 10;
			
		} else if (numero < 10000 && numero > 999) {
			
			capicua = numero % 10 == numero / 1000 && numero / 10 % 10 == numero / 100 % 10;
		}
		
		if (capicua == true) {
			System.out.println("El número es capicúa. ");
		} else if (capicua == false && numero < 10000 && numero >= 0) {
			System.out.println("El número no es capicúa. ");
		} else {
			System.out.println("El valor introducido es erróneo. ");
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
