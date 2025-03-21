package Actividad6;

import java.util.Scanner;

public class AvtividadReloj {

	public static void main(String[] args) {
		 Scanner leer = new Scanner(System.in);
		
		Reloj reloj1 = new Reloj();
		
		
		 System.out.println("Por favor, ingrese los datos del reloj:");
	     System.out.print("Ingrese la hora (0-23): ");
	     int hora = leer.nextInt();
	     System.out.print("Ingrese los minutos (0-59): ");
	     int minuto = leer.nextInt();
	     System.out.print("Ingrese los segundos (0-59): ");
	     int segundo = leer.nextInt();
	     
	     Reloj reloj = new Reloj(hora, minuto, segundo);
	     System.out.println("Reloj creado con éxito.\n");
	     
	     int opcion;

	     
	     do {	System.out.println();
	            System.out.println("\nElija cómo desea ver el reloj:");
	            System.out.println("1. Mostrar reloj en formato 24h.");
	            System.out.println("2. Mostrar reloj en formato 12h.");
	            System.out.println("3. Reiniciar el reloj.");
	            System.out.println("4. Reloj por defecto.");
	            System.out.println("5. Reloj en hora.");
	            System.out.println("6. Salir.");
	            System.out.print("\nIngrese su opción: ");
	            opcion = leer.nextInt();
	            
	            switch (opcion) {
                case 1:
                    System.out.println("Reloj en formato 24h:");
                    reloj.formatoHora24();
                    break;

                case 2:
                    System.out.println("Reloj en formato 12h:");
                    reloj.formatoHora12();
                    break;
                case 3:
                    System.out.println("Reloj reiniciado:");
                    reloj.reiniciarReloj();
                    break;
                    
                case 4:
                    System.out.println("Reloj por defecto:");
                    System.out.println(reloj1);
                    break;
                case 5 :
                    System.out.print("Ingrese la hora (0-23): ");
                    int nuevaHora = leer.nextInt();
                    System.out.print("Ingrese los minutos (0-59): ");
                    int nuevosMinutos = leer.nextInt();

                    System.out.print("¿Desea ingresar también los segundos? (s/n): ");
                    char incluirSegundos = leer.next().toLowerCase().charAt(0);

                    if (incluirSegundos == 's') {
                        System.out.print("Ingrese los segundos (0-59): ");
                        int nuevosSegundos = leer.nextInt();
                        reloj.ponerRelojEnHora(nuevaHora, nuevosMinutos, nuevosSegundos);
                    } else {
                        reloj.ponerRelojEnHora(nuevaHora, nuevosMinutos);
                    }

                    System.out.println("Reloj actualizado:");
                    reloj.formatoHora24();
                    break;
                case 6:
                    System.out.println("Haz salido...");
                    break;   
                
                default:
                    System.out.println("Opción no válida:");
                    reloj.reiniciarReloj();
                    break;
	            }
	         }while (opcion !=6);
	     	
	     leer.close();
	}
}

         


