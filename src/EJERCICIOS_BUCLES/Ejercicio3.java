package EJERCICIOS_BUCLES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido 
 *  				 |  				  | 		
 * 				     |  				  |  		
 *   				 | 					  | 		
 *  				 |   		 		  |  		
 *   				 |   				  |  		
 *   				 |   				  |  		
 * */

public class Ejercicio3 {
	public static void main(String[] args) {
		
		int numero;
		
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
		
		for (int i = 0; i <= numero; i++) {
			
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print("*");
				System.out.print("");
			}
			System.out.println("");
		}
		
		sc.close();
		
	}

}
