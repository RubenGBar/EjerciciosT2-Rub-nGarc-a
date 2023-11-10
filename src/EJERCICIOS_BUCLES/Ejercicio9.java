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
		
		int numero, contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Introduzca un numero: ");
			
			try {
				
				numero = sc.nextInt();
				
			}catch (InputMismatchException e) {
				
				numero = 1;
				
				System.out.println("Ha introducido un valor erroneo, se introducira 0 como valor predeterminado");
				
			}
			
			if (numero < 1) System.out.println("Ha introducido un valor erroneo ");
			
		} while(numero < 1);
		
		
		
		
		while(numero > 0) {
			
			numero /= 10;
			
			contador++;
			
		}
		
		System.out.println("El número tiene " + contador + " cifras");
		
		sc.close();
	}

}
