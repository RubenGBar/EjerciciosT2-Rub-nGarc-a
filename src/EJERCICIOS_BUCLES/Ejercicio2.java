package EJERCICIOS_BUCLES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido 
 *  		25		 |  		9		  | 		9
 * 			1	     |  		0		  |  		0
 *   		0		 | Valor erroneo	  | Valor erroeno		
 *  		a		 |   		0 		  |  		0 		
 * */

public class Ejercicio2 {
	public static void main(String[] args) {
	    // Declo las variables
	    int numero = 0, i, j, contador = 0;

	    boolean primo;

	    // Creo el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Bucle do-while para asegurarse de que se ingrese un número positivo
	    do {
	        System.out.println("Introduzca un numero positivo: ");

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

	    // Bucle for para encontrar los números primos en el rango de 1 a numero
	    for (i = 2; i <= numero; i++) {
	        primo = true;

	        // Bucle for para verificar si i es primo
	        for (j = 2; j < i; j++) {
	            if (i % j == 0) {
	                primo = false;
	                break;
	            }
	        }

	        // Si i es primo, incrementa el contador
	        if (primo)
	            contador++;
	    }

	    // Muestra la cantidad de números primos en el rango de 1 a numero
	    System.out.println("Entre 1 y " + numero + " hay " + contador + " numero/s primo/s");

	    // Cierro el Scanner
	    sc.close();

	}

}
