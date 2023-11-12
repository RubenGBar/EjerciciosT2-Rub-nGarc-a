package EJERCICIOS_BUCLES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado      		   | Resultado obtenido 
 *  	11211		 | El numero es capicua    		   | El numero es capicua 		
 * 		  30	     | El numero no es capicua 		   | El numero no es capicua 		
 *   	  -9		 | Ha introducido un valor erroneo | Ha introducido un valor erroneo
 *   	  0          | El numero es capicua            | El numero es capicua
 * */

public class Ejercicio10 {
	public static void main(String[] args) {
	    // Declaro las variables
	    int numero, auxiliar, ultimaCifra, numeroReves = 0;

	    // Creo el  Scanner 
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
	            System.out.println("Ha introducido un valor erroneo, se introducira 1 como valor predeterminado");
	        }

	        // Si el número ingresado es negativo, se muestra un mensaje de error
	        if (numero < 0)
	            System.out.println("Ha introducido un valor erroneo ");

	    } while (numero < 0);

	    // Copia el número ingresado en una variable auxiliar para realizar las operaciones con esa variable
	    auxiliar = numero;

	    // Bucle while para invertir el número y verificar si es capicúa
	    while (auxiliar > 0) {
	        ultimaCifra = auxiliar % 10; // Obtiene la última cifra del número
	        numeroReves = numeroReves * 10 + ultimaCifra; // Construye el número invertido
	        auxiliar /= 10; // Elimina la última cifra del número original
	    }

	    // Verifica si el número original es igual a su versión invertida
	    if (numeroReves == numero) {
	        System.out.println("El numero es capicua");
	    } else {
	        System.out.println("El numero no es capicua");
	    }

	    // Cierro el Scanner
	    sc.close();
		
	}

}
