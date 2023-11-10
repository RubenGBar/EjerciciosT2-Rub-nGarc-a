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

public class Ejercicio9 {
	public static void main(String[] args) {
		
		int numero, auxiliar, contador, ultimaCifra, numReves;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Introduzca un numero: ");
			
			try {
				
				numero = sc.nextInt();
				
			}catch (InputMismatchException e) {
				
				numero = 1;
				
				System.out.println("Ha introducido un valor erroneo, se introducira 0 como valor predeterminado");
				
			}
			
			if (numero < 0) System.out.println("Ha introducido un valor erroneo ");
			
		}while(numero < 0);
		
		
		
		auxiliar = numero;
		
		while(auxiliar > 0) {
			
			ultimaCifra = auxiliar % 10;
			
		}
		
		sc.close();
	}

}
