package EJERCICIOS_BUCLES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido 
 *  		4		 |  	     *        |        *
 *					 |			* *       |		  * *
 *					 |		   * * *      |      * * *
 *					 |		  * * * * 	  |     * * * *  		
 * 			-1	     | Valor erroneo 	  | Valor erroneo 		
 *   		a		 | 			1		  | 		*		
 * */

public class Ejercicio3 {
	public static void main(String[] args) {
	    // Declaro las variables
	    int numero;

	    // Creo el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Bucle do-while para asegurarse de que se ingrese un número positivo
	    do {
	        System.out.println("Introduzca un numero positivo, para crear una piramide de esta altura y base: ");

	        try {
	            // Leo el valor de numero del teclado
	            numero = sc.nextInt();
	        } catch (InputMismatchException e) {
	            // Si se produce una excepción, se establece el número en 1 y se muestra un mensaje de error
	            numero = 1;
	            System.out.println("Ha introducido un valor erroneo. Se introducira 1 como valor predeterminado");
	        }

	        // Si el número ingresado es menor que 1, muestra un mensaje de error
	        if (numero < 1)
	            System.out.println("Valor erroneo");

	    } while (numero < 1);

	    // Salto de línea antes de imprimir la pirámide
	    System.out.println();

	    // Bucle for para construir la pirámide
	    for (int i = 1; i <= numero; i++) {
	        // Imprimo los espacios en blanco antes de los asteriscos en cada fila
	        for (int j = 1; j <= numero - i; j++) {
	            System.out.print(" ");
	        }

	        // Imprimo los asteriscos en cada fila
	        for (int k = 1; k <= i; k++) {
	            System.out.print("* ");
	        }

	        // Salto de línea al final de cada fila
	        System.out.println();
	    }

	    // Cierro el Scanner
	    sc.close();
		
	}

}
