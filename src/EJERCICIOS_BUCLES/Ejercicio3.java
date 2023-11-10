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
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Introduzca un numero positivo, para crear una pramide de esta altura y base: ");
			
			try {

				numero = sc.nextInt();

			} catch (InputMismatchException e) {

				numero = 1;

				System.out.println("Ha introducido un valor erroneo. Se introducira 1 como valor predeterminado");

			}
			
			if (numero < 1) System.out.println("Valor erroneo");;
			
		} while (numero < 1);
		
		
		
		System.out.println();
		
		for (int i = 1; i <= numero; i++) {
            
			//Imprimo los espacios en blanco
            for (int j = 1; j <= numero - i; j++) {
                System.out.print(" ");
            }

            //Imprimo los asteristicos asteriscos
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            //Voy a la siguiente linea despues de imprimir cada fila
            System.out.println();
        }
		
		sc.close();
		
	}

}
