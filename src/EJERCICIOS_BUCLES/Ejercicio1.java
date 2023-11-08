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
			
			if (horas < 0 || horas > 23) System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
			
		}while (horas < 0 || horas > 23);
		
		
		
		do {
			
			System.out.println("Introduzca una cantidad de minutos: ");
			
			minutos = sc.nextInt();
			
			if (minutos < 0 || minutos > 59) System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
			
		}while (minutos < 0 || minutos > 59);
		
		
		
		do {
			
			System.out.println("Introduzca una cantidad de segundos: ");
			
			segundos = sc.nextInt();
			
			if (segundos < 0 || segundos > 59) System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
			
		}while (segundos < 0 || segundos > 59);
		
		
		
		do {
		
		System.out.println("Introduzca una cantidad de segundos a incrementar: ");
		
		incremento = sc.nextInt();
		
		if (incremento < 0 || incremento > 60) System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
		
		}while (incremento < 0 || incremento > 60);
		
		
		
		sumaSegundos = segundos + incremento;
		
		if (sumaSegundos < 119 && sumaSegundos > 60) {
			
			segundos = sumaSegundos - 60;
			
			minutos +=2;
			
			if (minutos == 62) {
				
				minutos = 2;
				
				horas += 1;
				
				if (horas == 24) {
					
					horas = 0;
					
				}
				
			} else if (minutos == 61) {
				
			minutos = 1;
			
			horas += 1;
			
			if (horas == 24) {
				
				horas = 0;
				
			}
				
			}else if (minutos == 60) {
				
				minutos = 0;
				
				horas += 1;
				
				if (horas == 24) {
					
					horas = 0;
					
				}
				
			}
			
		}else if (sumaSegundos == 60) {
			
			segundos = 0;
			
			minutos +=2;
			
			if (minutos == 62) {
				
				minutos = 2;
				
				horas += 1;
				
				if (horas == 24) {
					
					horas = 0;
					
				}
				
			} else if (minutos == 61) {
				
			minutos = 1;
			
			horas += 1;
			
			if (horas == 24) {
				
				horas = 0;
				
			}
				
			}else if (minutos == 60) {
				
				minutos = 0;
				
				horas += 1;
				
				if (horas == 24) {
					
					horas = 0;
					
				}
				
			}
			
		}else if (sumaSegundos < 60) {
		
			segundos = sumaSegundos - 60;
			
			minutos +=2;
			
			if (minutos == 62) {
				
				minutos = 2;
				
				horas += 1;
				
				if (horas == 24) {
					
					horas = 0;
					
				}
				
			} else if (minutos == 61) {
				
			minutos = 1;
			
			horas += 1;
			
			if (horas == 24) {
				
				horas = 0;
				
			}
				
			}else if (minutos == 60) {
				
				minutos = 0;
				
				horas += 1;
				
				if (horas == 24) {
					
					horas = 0;
					
				}
				
			}
			
		}
		
		
		System.out.println("El tiempo introducido tras " + incremento + " segundo es de: " + horas + " : " + minutos + " : " + segundos);
		
		
		sc.close();
		
	}

}
