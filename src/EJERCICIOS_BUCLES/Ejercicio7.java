package EJERCICIOS_BUCLES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido 
 *  		4		 |  		1		  |			1
 *  				 |		   121		  |		   121	
 *  				 |		  12321		  |		  12321
 *  				 |	     1234321	  |		 1234321
 * 			0	     | Mensaje especial   | Mensaje especial	
 *   		-1		 | Mensaje de error   | Mensaje de error
 * */

public class Ejercicio7 {
	public static void main(String[] args) {
		
		int i, j, k, numero = 1;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Introduzca un numero entre 0 y 20: ");
			
			try {
				
				numero = sc.nextInt();
				
			}catch (InputMismatchException e) {
				
				numero = 1;
				
				System.out.println("Ha introducido un valor erroneo, se introducira 1 como valor predeterminado");
				
			}
			
			if (numero < 0) System.out.println("Ha introducido un valor erroneo ");
			
		}while(numero < 0);
		
		
		if (numero == 0) {
			
			System.out.println("Una pirámide de base es así: ");
			System.out.println();
			System.out.println("¿Qué esperabas?");
			
		}else {
		
		for (i = 1; i <= numero; i++) {
			
			for (k = 1; k <= numero - i; k++) {
            	System.out.print(" ");
            }
			
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			
			for (j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		}
		
		sc.close();
		
	}

}
