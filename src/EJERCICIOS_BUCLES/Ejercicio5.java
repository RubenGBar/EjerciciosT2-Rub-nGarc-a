package EJERCICIOS_BUCLES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido 
 *  	50 y 80		 |  		400		  | 		400
 * 		80 y 50	     |  		2		  |  		2
 *   	80 y 80		 | 			80		  | 		80
 *  		a		 |   		2 		  |  		2  		
 * */

public class Ejercicio5 {
	public static void main(String[] args) {
	    // Declaro las variables
	    int a = 0, b = 0, i, multiploA, multiploB, mcm = 0;

	    // Creo el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Bucle do-while para asegurarse de que se ingresen dos números válidos y el primero menor que el segundo
	    do {
	        System.out.println("Introduzca un primer numero para calcular el m.c.m.: ");

	        try {
	            // Leo el valor de a del teclado
	            a = sc.nextInt();
	        } catch (InputMismatchException e) {
	            // Si se produce una excepción, se establece a en 1 y se muestra un mensaje de error
	            a = 1;
	            System.out.println("Ha introducido un valor erroneo. Se introducira 1 como valor predeterminado");
	        }

	        System.out.println("Introduzca un segundo numero para calcular el m.c.m.: ");

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

	    // Bucle for para encontrar el m.c.m. de a y b
	    for (i = b; i > b - 1; i++) {
	        multiploA = i % a;
	        multiploB = i % b;

	        // Si el número actual es múltiplo de ambos a y b, establece el m.c.m. y sale del bucle
	        if (multiploA == multiploB) {
	            mcm = i;
	            break;
	        }
	    }

	    // Muestra el m.c.m. de a y b
	    System.out.println("El m.c.m. de " + a + " y " + b + " es: " + mcm);

	    // Cierro el Scanner
	    sc.close();
		
	}

}
