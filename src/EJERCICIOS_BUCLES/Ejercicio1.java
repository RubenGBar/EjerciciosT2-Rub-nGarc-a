package EJERCICIOS_BUCLES;

import java.util.Scanner;

/*
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido:
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * Valor introducido es =  | Resultado esperado:  | Resultado obtenido: 
 * */

public class Ejercicio1 {
	public static void main(String[] args) {
		
		int horas, minutos, segundos, incremento, sumaSegundos;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			
			System.out.println("Introduzca una cantidad de horas: ");
			
			horas = sc.nextInt();
			
			if (horas < 0 || horas >= 24) System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
			
		}while (horas < 0 || horas >= 24);
		
		
		
		do {
			
			System.out.println("Introduzca una cantidad de minutos: ");
			
			minutos = sc.nextInt();
			
			if (minutos < 0 || minutos >= 60) System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
			
		}while (minutos < 0 || minutos >= 60);
		
		
		
		do {
			
			System.out.println("Introduzca una cantidad de segundos: ");
			
			segundos = sc.nextInt();
			
			if (segundos < 0 || segundos >= 60) System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
			
		}while (segundos < 0 || segundos >= 60);
		
		
		System.out.println("Introduzca una cantidad de segundos a incrementar: ");
		
		incremento = sc.nextInt();
		
		
		
		sumaSegundos = segundos + incremento;
		
		if (sumaSegundos > 60) {
			
			segundos = sumaSegundos - 60;
			
			
			
			/*if () {
				
			}*/
			
		}
		
		System.out.println("El tiempo introducido tras 1 segundo es de: " + horas + " : " + minutos + " : " + segundos);
		
		
		sc.close();
		
	}

}
