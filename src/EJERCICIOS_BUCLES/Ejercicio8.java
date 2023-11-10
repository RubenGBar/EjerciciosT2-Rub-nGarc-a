package EJERCICIOS_BUCLES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido 
 * 50, 55, 30, 32 y 0|  	4 y 1		  | 		4 y 1
 * 			s	     |  	0 y 0		  |  		0 y 0
 *   	-1 y 0 		 | 	    1 y 0		  | 		1 y 0
 * */

public class Ejercicio8 {
	public static void main(String[] args) {
		
		int numero = 0, mayor = -2147483648, contador = 0, contadorMenor = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Introduzca un numero, si introduce 0 el programa acabará: ");
			
			try {
				
				numero = sc.nextInt();
				
			}catch (InputMismatchException e) {
				
				System.out.println("Ha introducido un valor erroneo, el programa terminara su ejecucion");
				
				break;
				
			}
	
		
		
			
		
		if (numero > mayor) {
			
			mayor = numero;
			
		}else if (numero != 0){
			
			System.out.println("El numero introducido es menor que el anterior. ");
			
			mayor = numero;
			
			contadorMenor++;
			
		}
		
		contador++;
		
		
		
		}while(numero != 0);
		
		System.out.println("Ha introducido: " + (contador - 1) + " numero/s");
		
		System.out.println("Ha tenido: " + contadorMenor + " fallos");
		
		sc.close();
		
	}

}
