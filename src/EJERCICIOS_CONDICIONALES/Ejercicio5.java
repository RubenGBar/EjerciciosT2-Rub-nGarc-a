package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado Obtenido
 * -1500			 | 1500				  | 1500		
 * -9				 | 9				  | 9		
 * 8				 | 8				  | 8		
 * 5				 | 5				  | 5
 * */

public class Ejercicio5 {
	public static void main(String[] args) {
	    // Declaro las variables
	    int numero, absoluto;

	    // Creo el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Solicito al usuario que introduzca un número
	    System.out.println("Introduzca un numero para calcular su valor absoluto: ");
	    numero = sc.nextInt();

	    // Calculo el valor absoluto usando el operador condicional ternario
	    absoluto = numero > 0 ? numero : numero * -1;

	    // Imprimo el resultado
	    System.out.println("El valor absoluto de " + numero + " es: " + absoluto);

	    // Cierro el Scanner
	    sc.close();
		
	}

}
