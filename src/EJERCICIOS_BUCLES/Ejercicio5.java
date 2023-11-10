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
		
		int a = 0, b = 0, i, multiploA, multiploB, mcm = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.println("Introduzca un primer numero para calcular el m.c.m.: ");
		
		try { 
			
			a = sc.nextInt();
			
		}catch (InputMismatchException e) {
			
			a = 1;

			System.out.println("Ha introducido un valor erroneo. Se introducira 1 como valor predeterminado");
			
		}
		
		System.out.println("Introduzca un segundo numero para calcular el m.c.m.: ");
		
		try { 
			
			b = sc.nextInt();
			
		}catch (InputMismatchException e) {
			
			b = 2;

			System.out.println("Ha introducido un valor erroneo. Se introducira 2 como valor predeterminado");
			
		}
		
		if (a > b) System.out.println("El primer numero debe de ser menor que el segundo. ");;
		
		} while (a > b);
		
		
		
		
		for (i = b; i > b - 1; i++) {
			
			multiploA = i % a;
			
			multiploB = i % b;
			
			
			if (multiploA == multiploB) {
				
				mcm = i;
				
				break;
				
			}
			
		}
		
		System.out.println("El m.c.m. de " + a + " y " + b + " es: " + mcm);
		
		sc.close();
		
	}

}
