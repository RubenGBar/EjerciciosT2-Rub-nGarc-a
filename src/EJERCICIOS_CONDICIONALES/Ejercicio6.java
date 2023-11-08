package EJERCICIOS_CONDICIONALES;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
 * Valor introducido es = 30 | Resultado esperado: Bien!! Acertaste. | Resultado obtenido: Bien!! Acertaste.
 * Valor introducido es = 59 | Resultado esperado: Vaya, te equivocaste :( | Resultado obtenido: Vaya, te equivocaste :( 
 * Valor introducido es = g | Resultado esperado: Vaya has introducido un valor erroneo y | Resultado obtenido: Vaya has introducido un valor erroneo y  
 * 							|	Se introducira 0 como el valor de tu respuesta            |Se introducira 0 como el valor de tu respuesta
 * */

public class Ejercicio6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		
		
		
		int suma1 = rand.nextInt(1, 100);
		
		int suma2 = rand.nextInt(1, 100);
		
		int respuestaSuma, sumaRandoms;
		
		
		
		
		System.out.println("La suma de " + suma1 + " y " + suma2 + " es: ");
		
		try {
			
			respuestaSuma = sc.nextInt();
			
		}catch (InputMismatchException e){
			
			respuestaSuma = 0;
			
			System.out.println("Has introducido un valor erroneo ");
			
			System.out.println("Se introducira " + respuestaSuma + " como el valor de tu respuesta");
		}
		
		
		
		
		sumaRandoms = suma1 + suma2;
		
		if (respuestaSuma == sumaRandoms) {
			
			System.out.println("Bien!! Acertaste.");
			
		}else {
			
			System.out.println("Vaya, te equivocaste :( ");
			
		}
		
		sc.close();
		
	}

}
