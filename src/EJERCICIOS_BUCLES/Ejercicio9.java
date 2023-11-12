package EJERCICIOS_BUCLES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado			   | Resultado obtenido 
 *     123456789	 |  		9		  			   | 		9
 * 			0	     | Ha introducido un valor erroneo | Ha introducido un valor erroneo  		
 *   	   -1		 | Ha introducido un valor erroneo | Ha introducido un valor erroneo 		
 *  	   46		 | 			2		 		  	   | 		2 
 * */

public class Ejercicio9 {
	public static void main(String[] args) {
	    // Declaro las variables
	    int numero, contador = 0;

	    // Creo el Scanner 
	    Scanner sc = new Scanner(System.in);

	    // Bucle do-while para asegurarse de que se ingrese un número válido (mayor o igual a 1)
	    do {
	        System.out.println("Introduzca un numero: ");

	        try {
	            // Se lee el valor de numero del teclado
	            numero = sc.nextInt();
	        } catch (InputMismatchException e) {
	            /* Si se produce una excepción (por ejemplo, al ingresar una cadena en lugar de un número),
	            * se establece el número en 1 y se muestra un mensaje de error*/
	            numero = 1;
	            System.out.println("Ha introducido un valor erroneo, se introducira 1 como valor predeterminado");
	        }

	        // Si el número ingresado es menor que 1, se muestra un mensaje de error
	        if (numero < 1) 
	            System.out.println("Ha introducido un valor erroneo ");

	    } while (numero < 1);

	    
	    // Bucle while para contar las cifras del número
	    while (numero > 0) {
	        numero /= 10; // Se divide el número por 10 en cada iteración para eliminar la última cifra
	        contador++;   // Se incrementa el contador en cada iteración
	    }

	    
	    // Muestro la cantidad de cifras del número
	    System.out.println("El número tiene " + contador + " cifras");

	    // Cierro el Scanner 
	    sc.close();
	}

}
