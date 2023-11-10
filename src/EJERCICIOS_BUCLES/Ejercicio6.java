package EJERCICIOS_BUCLES;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido 
 *  		4		 |  		1 		  |			1
					 |			2 2 	  |			2 2
					 |			3 3 3 	  |			3 3 3
					 |			4 4 4 4	  |   		4 4 4 4
 * 			0	     | Mensaje especial	  | Mensaje especial	
 *   	-1 y 21		 | Mensaje de error	  | Mensaje de error
 * */

public class Ejercicio6 {
	public static void main(String[] args) {
		
		int numero = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Introduzca un numero entre 0 y 20: ");
			
			try {
				
				numero = sc.nextInt();
				
			}catch (InputMismatchException e) {
				
				numero = 1;
				
				System.out.println("Ha introducido un valor erroneo, se introducira 0 como valor predeterminado");
				
			}
			
			if (numero > 20 || numero < 0) System.out.println("Ha introducido un valor erroneo ");;
			
		}while(numero > 20 || numero < 0);
		
		
		if (numero == 0) {
			
			System.out.println("Una pirámide de base es así: ");
			System.out.println();
			System.out.println("¿Qué esperabas?");
			
		}else {
		
		System.out.println();
		
		for (int i = 1; i <= numero; i++) {

            //Imprimo los asteristicos asteriscos
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }

            //Voy a la siguiente linea despues de imprimir cada fila
            System.out.println();
        }
		}
		sc.close();
		
	}

}
