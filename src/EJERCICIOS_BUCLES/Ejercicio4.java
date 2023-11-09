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

public class Ejercicio4 {
	public static void main(String[] args) {
		
		int a = 0, b = 0, i, divisor = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.println("Introduzca un primer numero para calcular el M.C.D.: ");
		
		try { 
			
			a = sc.nextInt();
			
		}catch (InputMismatchException e) {
			
			a = 1;

			System.out.println("Ha introducido un valor erroneo. Se introducira 1 como valor predeterminado");
			
		}
		
		System.out.println("Introduzca un segundo numero para calcular el M.C.D.: ");
		
		try { 
			
			b = sc.nextInt();
			
		}catch (InputMismatchException e) {
			
			b = 2;

			System.out.println("Ha introducido un valor erroneo. Se introducira 2 como valor predeterminado");
			
		}
		
		if (a > b) System.out.println("El primer numero debe de ser menor que el segundo. ");;
		
		} while (a > b);
		
		
		
		
		for (i = a - 1; i < a; i--) {
			
			if (a % i == 0 && b % i == 0) {
				
				divisor = i;
				
				break;
				
			}
			
		}
		
		System.out.println("El M.C.D. de " + a + " y " + b + " es: " + divisor);
		
		sc.close();
		
	}

}
