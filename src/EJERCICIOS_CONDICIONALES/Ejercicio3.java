package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

/*
 * Valor introducido es = 90000, 50 y 1000 | Resultado esperado: Bien!! Tus animales no se mueren de hambre | Resultado obtenido: Bien!! Tus animales no se mueren de hambre
 * Valor introducido es = 90000, 50 y 1900 | Resultado esperado: Deberías de comprar más comida  | Resultado obtenido: Deberías de comprar más comida  
 * Valor introducido es = 90000, 50 y 1800 | Resultado esperado: Vas justo de comida, compra algo más por si acaso | Resultado obtenido: Vas justo de comida, compra algo más por si acaso 
 * Valor introducido es = 0, 10 y 2000 | Resultado esperado: Se van a morir de hambre los pobres  | Resultado obtenido: Se van a morir de hambre los pobres  
 * Valor introducido es = 50000, 0 y 100| Resultado esperado: No creo que puedas tener una granja sin animales  | Resultado obtenido: No creo que puedas tener una granja sin animales 
 * Valor introducido es = 50000, 10 y 0 | Resultado esperado: No creo que niguno de tus animales no coma nada | Resultado obtenido: No creo que niguno de tus animales no coma nada
 * */

public class Ejercicio3 {
	public static void main(String[] args) {
		
		int comidaCompradaDiariamente, numeroDeAnimales, kilosComidosTotales;
		
		double kilosDiariosMedios;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		
			
		
		System.out.println("Introduzca la cantidad de comida comprada diariamente para cada animal: ");
		
		comidaCompradaDiariamente = sc.nextInt();
		
		if (comidaCompradaDiariamente == 0) {
			
			System.out.println("Se van a morir de hambre los pobres ");
		}
		
		
		
		System.out.println("Introduzca la cantidad total de animales: ");
		
		numeroDeAnimales = sc.nextInt();
		
		if (numeroDeAnimales == 0) {
			
			System.out.println("No creo que puedas tener una granja sin animales ");
		}
		
		
		
		System.out.println("Introduzca la cantidad de kilos que consumen en total todos los animales: ");
		
		kilosComidosTotales = sc.nextInt();
		
		if (kilosComidosTotales == 0) {
			
			System.out.println("No creo que niguno de tus animales no coma nada");
		}
		
		
		
		} while (comidaCompradaDiariamente == 0 || numeroDeAnimales == 0 || kilosComidosTotales == 0);
		
		
		
		
		kilosDiariosMedios = comidaCompradaDiariamente/numeroDeAnimales;
		
		
		
		
		
		if (kilosDiariosMedios > kilosComidosTotales) {
			
			System.out.println("Bien!! Tus animales no se mueren de hambre ");
			
		}else if (kilosDiariosMedios < kilosComidosTotales) {
			
			System.out.println("Deberías de comprar más comida ");
			
		}else if (kilosDiariosMedios == kilosComidosTotales) {
			
			System.out.println("Vas justo de comida, compra algo más por si acaso ");
			
		}
		
		sc.close();
		
	}

}
