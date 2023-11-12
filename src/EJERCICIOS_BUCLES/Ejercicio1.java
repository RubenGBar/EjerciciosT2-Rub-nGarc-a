package EJERCICIOS_BUCLES;

import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado Obtenido
 * 23, 59, 50 y 12	 | 	    0 : 0 : 2	  | 	0 : 0 : 2
 * 		0 y -8		 | Mensaje de error	  | Mensaje de error		
 * 		  25		 | Mensaje de error	  | Mensaje de error		
 * 		20 y 82		 | Mensaje de error	  | Mensaje de error		
 * 	  20, 20 y -9	 | Mensaje de error	  | Mensaje de error		
 * 	20, 20, 20 y -9	 | Mensaje de error	  | Mensaje de error				
 * */

public class Ejercicio1 {
	public static void main(String[] args) {
	    // Declaro las variables
	    int horas, minutos, segundos, incremento;

	    // Creación el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Bucle do-while para asegurarse de que se ingrese una cantidad de horas válida (entre 0 y 24)
	    do {
	        System.out.println("Introduzca una cantidad de horas: ");
	        horas = sc.nextInt();
	        if (horas < 0 || horas > 24)
	            System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
	    } while (horas < 0 || horas > 24);

	    // Bucle do-while para asegurarse de que se ingrese una cantidad de minutos válida (entre 0 y 60)
	    do {
	        System.out.println("Introduzca una cantidad de minutos: ");
	        minutos = sc.nextInt();
	        if (minutos < 0 || minutos > 60)
	            System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
	    } while (minutos < 0 || minutos > 60);

	    // Bucle do-while para asegurarse de que se ingrese una cantidad de segundos válida (entre 0 y 60)
	    do {
	        System.out.println("Introduzca una cantidad de segundos: ");
	        segundos = sc.nextInt();
	        if (segundos < 0 || segundos > 60)
	            System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
	    } while (segundos < 0 || segundos > 60);

	    // Bucle do-while para asegurarse de que se ingrese una cantidad de incremento válida (mayor o igual a 0)
	    do {
	        System.out.println("Introduzca una cantidad de segundos a incrementar: ");
	        incremento = sc.nextInt();
	        if (incremento < 0)
	            System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
	    } while (incremento < 0);

	    // Bucle for para realizar el incremento en segundos
	    for (int i = 0; i < incremento; i++) {
	        // Verifica si segundos llega a 60
	        if (segundos == 60) {
	            segundos = 0; // Reinicia los segundos a 0
	            minutos += 1; // Incrementa los minutos en 1

	            // Verifica si minutos llega a 60
	            if (minutos == 60) {
	                horas += 1;   // Incrementa las horas en 1
	                minutos = 0;  // Reinicia los minutos a 0

	                // Verifica si horas llega a 24
	                if (horas == 24) {
	                    horas = 0; // Reinicia las horas a 0
	                } else if (horas == 25) {
	                    horas = 1; // Reinicia las horas a 1 si llega a 25
	                }
	                
	            } else if (minutos == 61) { // Verifica si minutos llega a 61
	                horas += 1;   // Incrementa las horas en 1
	                minutos = 1;  // Reinicia los minutos a 1

	                // Verifica si horas llega a 24
	                if (horas == 24) {
	                    horas = 0; // Reinicia las horas a 0
	                } else if (horas == 25) {
	                    horas = 1; // Reinicia las horas a 1 si llega a 25
	                }
	            }
	            
	        // Verifica si segundos llega a 59    
	        } else if (segundos == 59) { 
	            segundos = 0; // Reinicia los segundos a 0
	            minutos += 1; // Incrementa los minutos en 1

	            // Verifica si minutos llega a 60
	            if (minutos == 60) {
	                horas += 1;   // Incrementa las horas en 1
	                minutos = 0;  // Reinicia los minutos a 0

	                // Verifica si horas llega a 24
	                if (horas == 24) {
	                    horas = 0; // Reinicia las horas a 0
	                } else if (horas == 25) { 
	                    horas = 1; // Reinicia las horas a 1 si llega a 25
	                }
	                
	            // Verifica si minutos llega a 61    
	            } else if (minutos == 61) { 
	                horas += 1;   // Incrementa las horas en 1
	                minutos = 1;  // Reinicia los minutos a 1

	                // Verifica si horas llega a 24
	                if (horas == 24) {
	                    horas = 0; // Reinicia las horas a 0
	                } else if (horas == 25) {
	                    horas = 1; // Reinicia las horas a 1 si llega a 25
	                }
	            }
	        
	        // Verifica si segundosos es menor a 59
	        } else if (segundos < 59) {
	            segundos += 1; // Incrementa los segundos en 1
	        }

	        // Verifica si minutos llega a 60
	        if (minutos == 60) {
	            horas += 1;   // Incrementa las horas en 1
	            minutos = 0;  // Reinicia los minutos a 0

	            // Verifica si horas llega a 24
	            if (horas == 24) {
	                horas = 0; // Reinicia las horas a 0
	            } else if (horas == 25) {
	                horas = 1; // Reinicia las horas a 1 si llega a 25
	            }
	        }

	        // Verifica si horas llega a 24 y las reinicia a 0
	        if (horas == 24) {
	            horas = 0; 
	        }
	    }

	    // Muestra el tiempo resultante después del incremento en segundos
	    System.out.println("El tiempo introducido tras " + incremento + " segundo es de: " + horas + " : " + minutos + " : "
	            + segundos);

	    // Cierro el Scanner
	    sc.close();
		
	}

}
