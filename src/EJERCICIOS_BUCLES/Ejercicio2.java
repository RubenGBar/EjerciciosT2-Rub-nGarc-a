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

		int numero = 0, i, j, contador = 0;

		boolean primo;

		Scanner sc = new Scanner(System.in);

		do {
			
			System.out.println("Introduzca un numero positivo: ");
			
			try {

				numero = sc.nextInt();

			} catch (InputMismatchException e) {

				numero = 1;

				System.out.println("Ha introducido un valor erroneo. Se introducira 1 como valor predeterminado");

			}
			
			if (numero < 1) System.out.println("Valor erroneo");;
			
		} while (numero < 1);

		for (i = 2; i <= numero; i++) {

			primo = true;

			for (j = 2; j < i; j++) {
				
				if (i % j == 0) {
					primo = false;
					break;
				}
				
			}

			if (primo)
				
				contador++;

		}

		System.out.println("Entre 1 y " + numero + " hay " + contador + " numero/s primo/s");

		sc.close();

	}

}
