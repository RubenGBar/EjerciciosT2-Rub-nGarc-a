package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

/*
 * Valor introducido es = -646 | Resultado esperado: El valor introducido es erróneo. | Resultado obtenido: El valor introducido es erróneo. 
 * Valor introducido es = 8 | Resultado esperado: El numero es capicua. | Resultado obtenido: El numero es capicua. 
 * Valor introducido es = 15 | Resultado esperado: El numero no es capicua. | Resultado obtenido: El numero es capicua.  
 * Valor introducido es = 22 | Resultado esperado: El numero es capicua. | Resultado obtenido: El numero es capicua. 
 * Valor introducido es = 345 | Resultado esperado: El numero no es capicua. | Resultado obtenido: El numero es capicua. 
 * Valor introducido es = 969 | Resultado esperado: El numero es capicua. | Resultado obtenido: El numero es capicua. 
 * Valor introducido es = 1854 | Resultado esperado: El numero no es capicua. | Resultado obtenido: El numero es capicua. 
 * Valor introducido es = 5775 | Resultado esperado: El numero es capicua. | Resultado obtenido: El numero es capicua. 
 * Valor introducido es = 52156544 | Resultado esperado: El valor introducido es erróneo. | Resultado obtenido: El valor introducido es erróneo.
 * */

/*
 * Valor introducido | Resultado esperado | Resultado Obtenido
 * 					 | 					  | 		
 * 					 | 					  | 		
 * 					 | 					  | 		
 * 					 | 					  | 		
 * 					 | 					  | 		
 * 					 | 					  | 		
 * 					 | 					  | 		
 * 					 | 					  | 		
 * */

public class Ejercicio1 {
	public static void main(String[] args) {
		
		//Declaro la variable para guardar el numero introducido por el usuario
		int numero;
		
		//Declaro una variable booleana para cambiarla a true si el numero es capicua 
		boolean capicua = false;
		
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);
		
		//Muestro por pantalla un mensaje con las instrucciones de la funcion
		System.out.println("Introduzca un numero entre 9999 y 0: ");
		
		//Leo el valor de numero del teclado
		numero = sc.nextInt();
		
		if (numero < 10 && numero >= 0) {/*Si el numero esta entre 0 y 9 cambia el valor de la variable 
										capicua a true*/
			capicua = true;
		} else if (numero < 100 && numero > 9) {/*Creo un condicional con el que solo tengo en cuenta los 
												numeros entre 10 y 99*/
			
			capicua = numero % 11 == 0;/*Si el resto del numero al dividirlo entre 11 es 0 la variable 
										capicua sera true*/
			
		} else if (numero < 1000 && numero > 99) {/*Creo un condicional con el que solo tengo en cuenta los 
												numeros entre 100 y 999*/
			
			capicua = numero / 100 == numero % 10;/*Si al dividir el numero entre 100, su tercera cifra, y 
													hacerle el modulo de 10, su priera cifra, son iguales 
													el valor de capicua cambia a true*/
			
		} else if (numero < 10000 && numero > 999) {/*Creo un condicional con el que solo tengo en cuenta los 
													numeros entre 1000 y 9999*/
			
			capicua = numero % 10 == numero / 1000 && numero / 10 % 10 == numero / 100 % 10;
			/*Si al hacer el modelo de 10 del numero, su primera cifra, y dividirlo entre 1000, su cuarta 
			 *cifra, son iguales y ademas al dividir ese numero entre 10 y hacerle el modulo de 10, su segunda
			 *cifra, y al dividirlo entre 100 y hacerle el modulo de 10, su tercera cifra, son tambien iguales 
			 *el valor de capicua cambia a true*/
		}
		
		if (capicua == true) {/*Si capicua es true muestro por pantalla que es true*/
			System.out.println("El numero es capicua. ");
		} else if (capicua == false && numero < 10000 && numero >= 0) {/*Si capicua es false y esta dentro 
																		de los rangos muestro por pantalla 
																		que el numero no es capicua solo 
																		cuando se introduce un valor 
																		correcto*/
			System.out.println("El numero no es capicua. ");
		} else {/*Si el valor esta fuera de los rangos permitidos muestro por pantalla un mensaje de error*/
			System.out.println("El valor introducido es erroneo. ");
		}
		
		//Cierro el Scanner
		sc.close();
	}

}
