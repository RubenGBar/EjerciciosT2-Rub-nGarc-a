package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

/*
 * Valor introducido es = 3, 24 y 20 | Resultado esperado: El tiempo introducido tras 1 segundo es de: 3 : 24 : 21 | Resultado obtenido: El tiempo introducido tras 1 segundo es de: 3 : 24 : 21
 * Valor introducido es = 2, 59 y 59 | Resultado esperado: El tiempo introducido tras 1 segundo es de: 3 : 0 : 0 | Resultado obtenido: El tiempo introducido tras 1 segundo es de: 3 : 0 : 0 
 * Valor introducido es = 25 | Resultado esperado: Has introducido un valor erroneo. Vuelva a introducirlo | Resultado obtenido: Has introducido un valor erroneo. Vuelva a introducirlo 
 * Valor introducido es = 5 y 95 | Resultado esperado: Has introducido un valor erroneo. Vuelva a introducirlo | Resultado obtenido: Has introducido un valor erroneo. Vuelva a introducirlo
 * */

public class Ejercicio7 {
	public static void main(String[] args) {
		
		int horas, minutos, segundos;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		do {
			
			System.out.println("Introduzca una cantidad de horas: ");
			
			horas = sc.nextInt();
			
			if (horas < 0 || horas > 24) System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
			
		}while (horas < 0 || horas > 24);
		
		
		
		do {
			
			System.out.println("Introduzca una cantidad de minutos: ");
			
			minutos = sc.nextInt();
			
			if (minutos < 0 || minutos > 60) System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
			
		}while (minutos < 0 || minutos > 60);
		
		
		
		do {
			
			System.out.println("Introduzca una cantidad de segundos: ");
			
			segundos = sc.nextInt();
			
			if (segundos < 0 || segundos > 60) System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
			
		}while (segundos < 0 || segundos > 60);
		
		
		
		
		if (segundos == 60) {
			
			segundos = 0;
			
			minutos += 1;
			
			if (minutos == 60) {
				
				horas += 1;
				
				minutos = 0;
				
				if (horas == 24) {
					
					horas = 0;
					
				}else if (horas == 25) {
					
					horas = 1;
					
				}
			} else if (minutos == 61) {
				
				horas += 1;
				
				minutos = 1;
				
				if (horas == 24) {
					
				horas = 0;
					
				}else if (horas == 25) {
					
				horas = 1;
					
				}
				
			}
			
		}else if (segundos == 59) {
			
			segundos = 0;
			
			minutos += 1;
			
			if (minutos == 60 ) {
				
				horas += 1;
				
				minutos = 0;
				
				if (horas == 24) {
					
					horas = 0;
					
				}else if (horas == 25) {
					
					horas = 1;
					
				}
			} else if (minutos == 61) {
				
				horas += 1;
				
				minutos = 1;
				
				if (horas == 24) {
					
				horas = 0;
					
				}else if (horas == 25) {
					
				horas = 1;
					
				}
				
			}
			
		}else if (segundos < 59){
			
			segundos += 1;
			
		}
		
		
		
		if (minutos == 60){
			
			horas += 1;
			
			minutos = 0;
			
			if (horas == 24) {
				
				horas = 0;
					
			}else if (horas == 25) {
					
				horas = 1;
					
			}
			
		}
		
		
		
		if (horas == 24) horas = 24;
		
		System.out.println("El tiempo introducido tras 1 segundo es de: " + horas + " : " + minutos + " : " + segundos);
		
		
		sc.close();
		
	}

}
