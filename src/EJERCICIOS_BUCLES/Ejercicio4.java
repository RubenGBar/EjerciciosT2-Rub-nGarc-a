package EJERCICIOS_BUCLES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido 
 *  	50 y 80		 |  		10		  | 		10
 * 		80 y 50	     |  		1		  |  		1
 *   	80 y 80		 | 			80		  | 		80
 *  		a		 |   		1 		  |  		1
 * */

public class Ejercicio4 {
	public static void main(String[] args) {
	    // Declaración de variables
	    int a = 0, b = 0, i, divisor = 0;

	    // Creo el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Bucle do-while para asegurarse de que se ingresen dos números válidos y el primero menor que el segundo 
	    do {
	        System.out.println("Introduzca un primer numero para calcular el M.C.D.: ");

	        try {
	            // Leo el valor de ba del teclado
	            a = sc.nextInt();
	        } catch (InputMismatchException e) {
	            // Si se produce una excepción, se establece a en 1 y se muestra un mensaje de error
	            a = 1;
	            System.out.println("Ha introducido un valor erroneo. Se introducira 1 como valor predeterminado");
	        }

	        System.out.println("Introduzca un segundo numero para calcular el M.C.D.: ");

	        try {
	            // Leo el valor de b del teclado
	            b = sc.nextInt();
	        } catch (InputMismatchException e) {
	            // Si se produce una excepción, se establece b en 2 y se muestra un mensaje de error
	            b = 2;
	            System.out.println("Ha introducido un valor erroneo. Se introducira 2 como valor predeterminado");
	        }

	        // Si a es mayor que b, muestra un mensaje de error y vuelve a solicitar los números
	        if (a > b)
	            System.out.println("El primer numero debe de ser menor que el segundo. ");

	    } while (a > b);

	    // Bucle for para encontrar el M.C.D. de a y b
	    for (i = a; i >= 1; i--) {
	        // Si i es divisor de ambos a y b, establece el M.C.D. y sale del bucle
	        if (a % i == 0 && b % i == 0) {
	            divisor = i;
	            break;
	        }
	    }

	    // Muestra el M.C.D. de a y b
	    System.out.println("El M.C.D. de " + a + " y " + b + " es: " + divisor);

	    // Cierro el Scanner
	    sc.close();
		
	}

}
