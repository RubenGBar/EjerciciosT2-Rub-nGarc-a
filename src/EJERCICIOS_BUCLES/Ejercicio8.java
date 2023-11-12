package EJERCICIOS_BUCLES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido 
 * 50, 55, 30, 32 y 0|  	4 y 1		  | 		4 y 1
 * 			s	     |  	0 y 0		  |  		0 y 0
 *   	-1 y 0 		 | 	    1 y 0		  | 		1 y 0
 * */

public class Ejercicio8 {
	public static void main(String[] args) {
	    // Declaro las variables
	    int numero = 0, mayor = -2147483648, contador = 0, contadorMenor = 0;

	    // Creo el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Bucle do-while para recibir n�meros hasta que se ingrese 0
	    do {
	        System.out.println("Introduzca un numero, si introduce 0 el programa acabar�: ");

	        try {
	            // Intenta leer un n�mero entero desde la entrada del usuario
	            numero = sc.nextInt();
	        } catch (InputMismatchException e) {
	            // Si se produce una excepci�n, muestra un mensaje de error y se establece el valor de numero como 0 
	            System.out.println("Ha introducido un valor erroneo, se introducir� 0 como valor predeterminado");
	            numero = 0;
	        }

	        // Compara el n�mero actual con el mayor registrado
	        if (numero > mayor) {
	            mayor = numero; // Actualiza el valor del n�mero mayor
	        } else if (numero != 0) {
	            // Si el n�mero no es 0 y es menor que el anterior, muestra un mensaje de error
	            System.out.println("El numero introducido es menor que el anterior. ");
	            mayor = numero; // Actualiza el valor del n�mero mayor
	            contadorMenor++; // Incrementa el contador de n�meros menores
	        }

	        contador++; // Incrementa el contador total de n�meros ingresados

	    } while (numero != 0);

	    // Muestra el n�mero total de n�meros ingresados (excluyendo el 0)
	    System.out.println("Ha introducido: " + (contador - 1) + " numero/s");
	    
	    // Muestra la cantidad de veces que se ingres� un n�mero menor que el anterior
	    System.out.println("Ha tenido: " + contadorMenor + " fallos");

	    // Cierro el Scanner
	    sc.close();
		
	}

}
