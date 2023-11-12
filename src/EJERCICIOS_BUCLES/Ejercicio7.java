package EJERCICIOS_BUCLES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido 
 *  		4		 |  		1		  |			1
 *  				 |		   121		  |		   121	
 *  				 |		  12321		  |		  12321
 *  				 |	     1234321	  |		 1234321
 * 			0	     | Mensaje especial   | Mensaje especial	
 *   		-1		 | Mensaje de error   | Mensaje de error
 * */

public class Ejercicio7 {
	public static void main(String[] args) {
	    // Declaro las variables
	    int i, j, k, numero = 1;

	    // Creo el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Bucle do-while para asegurarse de que se ingrese un n�mero v�lido (entre 0 y 20)
	    do {
	        System.out.println("Introduzca un numero entre 0 y 20: ");

	        try {
	            // Intenta leer un n�mero entero desde la entrada del usuario
	            numero = sc.nextInt();
	        } catch (InputMismatchException e) {
	            // Si se produce una excepci�n, se establece el n�mero en 1 y se muestra un mensaje de error
	            numero = 1;
	            System.out.println("Ha introducido un valor erroneo, se introducira 1 como valor predeterminado");
	        }

	        // Si el n�mero ingresado es negativo, se muestra un mensaje de error
	        if (numero < 0)
	            System.out.println("Ha introducido un valor erroneo ");

	    } while (numero < 0);

	    // Verifica si el n�mero es 0 y muestra un mensaje especial
	    if (numero == 0) {
	        System.out.println("Una pir�mide de base 0 es as�: ");
	        System.out.println();
	        System.out.println("�Qu� esperabas?");
	    } else {
	        // Bucle for para construir la pir�mide num�rica
	        for (i = 1; i <= numero; i++) {
	            // Bucle for para imprimir espacios en blanco antes de los n�meros en cada fila
	            for (k = 1; k <= numero - i; k++) {
	                System.out.print(" ");
	            }

	            // Bucle for para imprimir n�meros ascendentes en cada fila
	            for (j = 1; j <= i; j++) {
	                System.out.print(j);
	            }

	            // Bucle for para imprimir n�meros descendentes en cada fila (excepto el �ltimo)
	            for (j = i - 1; j >= 1; j--) {
	                System.out.print(j);
	            }

	            // Salto de l�nea al final de cada fila
	            System.out.println();
	        }
	    }

	    // Cierro el Scanner
	    sc.close();
		
	}

}
