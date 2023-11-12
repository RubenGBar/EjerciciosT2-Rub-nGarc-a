package EJERCICIOS_BUCLES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido 
 *  		4		 |  		1 		  |			1
					 |			2 2 	  |			2 2
					 |			3 3 3 	  |			3 3 3
					 |			4 4 4 4	  |   		4 4 4 4
 * 			0	     | Mensaje especial	  | Mensaje especial	
 *   	-1 y 21		 | Mensaje de error	  | Mensaje de error
 * */

public class Ejercicio6 {
	public static void main(String[] args) {
	    // Declaro las variables
	    int numero = 0;

	    // Creo el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Bucle do-while para asegurarse de que se ingrese un n�mero v�lido (entre 0 y 20)
	    do {
	        System.out.println("Introduzca un numero entre 0 y 20: ");

	        try {
	            // Leo el valor de numero del teclado
	            numero = sc.nextInt();
	        } catch (InputMismatchException e) {
	            // Si se produce una excepci�n, se establece el n�mero en 1 y se muestra un mensaje de error
	            numero = 1;
	            System.out.println("Ha introducido un valor erroneo, se introducira 1 como valor predeterminado");
	        }

	        // Si el n�mero ingresado est� fuera del rango especificado, muestra un mensaje de error
	        if (numero > 20 || numero < 0)
	            System.out.println("Ha introducido un valor erroneo ");

	    } while (numero > 20 || numero < 0);

	    // Verifica si el n�mero ingresado es 0 y muestra un mensaje especial
	    if (numero == 0) {
	        System.out.println("Una pir�mide de base 0 es as�: ");
	        System.out.println();
	        System.out.println("�Qu� esperabas?");
	    } else {
	        // Salto de l�nea antes de imprimir la pir�mide num�rica ascendente
	        System.out.println();

	        // Bucle for para construir la pir�mide num�rica ascendente
	        for (int i = 1; i <= numero; i++) {
	            // Bucle para imprimir n�meros en cada fila
	            for (int k = 1; k <= i; k++) {
	                System.out.print(i + " ");
	            }

	            // Salto de l�nea al final de cada fila
	            System.out.println();
	        }
	    }

	    // Cierro el Scanner
	    sc.close();
		
	}

}
