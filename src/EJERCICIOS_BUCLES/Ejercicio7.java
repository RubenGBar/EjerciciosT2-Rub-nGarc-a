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

	    // Bucle do-while para asegurarse de que se ingrese un número válido (entre 0 y 20)
	    do {
	        System.out.println("Introduzca un numero entre 0 y 20: ");

	        try {
	            // Intenta leer un número entero desde la entrada del usuario
	            numero = sc.nextInt();
	        } catch (InputMismatchException e) {
	            // Si se produce una excepción, se establece el número en 1 y se muestra un mensaje de error
	            numero = 1;
	            System.out.println("Ha introducido un valor erroneo, se introducira 1 como valor predeterminado");
	        }

	        // Si el número ingresado es negativo, se muestra un mensaje de error
	        if (numero < 0)
	            System.out.println("Ha introducido un valor erroneo ");

	    } while (numero < 0);

	    // Verifica si el número es 0 y muestra un mensaje especial
	    if (numero == 0) {
	        System.out.println("Una pirámide de base 0 es así: ");
	        System.out.println();
	        System.out.println("¿Qué esperabas?");
	    } else {
	        // Bucle for para construir la pirámide numérica
	        for (i = 1; i <= numero; i++) {
	            // Bucle for para imprimir espacios en blanco antes de los números en cada fila
	            for (k = 1; k <= numero - i; k++) {
	                System.out.print(" ");
	            }

	            // Bucle for para imprimir números ascendentes en cada fila
	            for (j = 1; j <= i; j++) {
	                System.out.print(j);
	            }

	            // Bucle for para imprimir números descendentes en cada fila (excepto el último)
	            for (j = i - 1; j >= 1; j--) {
	                System.out.print(j);
	            }

	            // Salto de línea al final de cada fila
	            System.out.println();
	        }
	    }

	    // Cierro el Scanner
	    sc.close();
		
	}

}
