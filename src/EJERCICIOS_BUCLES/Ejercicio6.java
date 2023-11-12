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

	    // Bucle do-while para asegurarse de que se ingrese un número válido (entre 0 y 20)
	    do {
	        System.out.println("Introduzca un numero entre 0 y 20: ");

	        try {
	            // Leo el valor de numero del teclado
	            numero = sc.nextInt();
	        } catch (InputMismatchException e) {
	            // Si se produce una excepción, se establece el número en 1 y se muestra un mensaje de error
	            numero = 1;
	            System.out.println("Ha introducido un valor erroneo, se introducira 1 como valor predeterminado");
	        }

	        // Si el número ingresado está fuera del rango especificado, muestra un mensaje de error
	        if (numero > 20 || numero < 0)
	            System.out.println("Ha introducido un valor erroneo ");

	    } while (numero > 20 || numero < 0);

	    // Verifica si el número ingresado es 0 y muestra un mensaje especial
	    if (numero == 0) {
	        System.out.println("Una pirámide de base 0 es así: ");
	        System.out.println();
	        System.out.println("¿Qué esperabas?");
	    } else {
	        // Salto de línea antes de imprimir la pirámide numérica ascendente
	        System.out.println();

	        // Bucle for para construir la pirámide numérica ascendente
	        for (int i = 1; i <= numero; i++) {
	            // Bucle para imprimir números en cada fila
	            for (int k = 1; k <= i; k++) {
	                System.out.print(i + " ");
	            }

	            // Salto de línea al final de cada fila
	            System.out.println();
	        }
	    }

	    // Cierro el Scanner
	    sc.close();
		
	}

}
