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
		
		int numero, auxiliar, ultimaCifra, numeroReves = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Introduzca un numero positivo: ");
			
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
			numeroReves = numeroReves * 10 + ultimaCifra;
			auxiliar /= 10;
			
		}
		
		if (numeroReves == numero) {
			
			System.out.println("El numero es capicua");
			
		}else {
			
			System.out.println("El numero no es capicua");
			
		}
		
		sc.close();
		
	}

}
