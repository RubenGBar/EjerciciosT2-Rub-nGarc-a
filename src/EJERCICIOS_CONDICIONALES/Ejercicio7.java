package EJERCICIOS_CONDICIONALES;

import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado Obtenido
 * 3, 24 y 20 		 | 3 : 24 : 21 		  | 3 : 24 : 21
 * 2, 59 y 59		 | 3 : 0 : 0		  | 3 : 0 : 0
 * 25				 | Mensaje de error	  | Mensaje de error
 * 5 y 95			 | Mensaje de error	  | Mensaje de error
 * */

public class Ejercicio7 {
	public static void main(String[] args) {
	    // Declaro las variables para almacenar horas, minutos y segundos
	    int horas, minutos, segundos;

	    // Creo el Scanner
	    Scanner sc = new Scanner(System.in);

	    // Pido al usuario que introduzca la cantidad de horas válidas
	    do {
	        System.out.println("Introduzca una cantidad de horas: ");
	        horas = sc.nextInt();
	        if (horas < 0 || horas > 24) System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
	    } while (horas < 0 || horas > 24);

	    // Pido al usuario que introduzca la cantidad de minutos válidos
	    do {
	        System.out.println("Introduzca una cantidad de minutos: ");
	        minutos = sc.nextInt();
	        if (minutos < 0 || minutos > 60) System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
	    } while (minutos < 0 || minutos > 60);

	    // Pido al usuario que introduzca la cantidad de segundos válidos
	    do {
	        System.out.println("Introduzca una cantidad de segundos: ");
	        segundos = sc.nextInt();
	        if (segundos < 0 || segundos > 60) System.out.println("Has introducido un valor erroneo. Vuelva a introducirlo");
	    } while (segundos < 0 || segundos > 60);

      // Lógica para incrementar el tiempo en 1 segundo
	 // Verifico si segundos llega a 60
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
		
		
		// Ajuste final para el caso de que las horas lleguen a 24
	    if (horas == 24) horas = 0;

	    // Imprimo el tiempo resultante después de incrementar 1 segundo
	    System.out.println("El tiempo introducido tras 1 segundo es de: " + horas + " : " + minutos + " : " + segundos);

	    // Cierro el Scanner
	    sc.close();
		
	}

}
