import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Probando {
	
	public static void main(String[] args) {
	        RutinaDeEjercicio rutinaDeEjercicio = new RutinaDeEjercicio();
	        Scanner scanner = new Scanner(System.in);
	        int opcion;

	        do {
	            System.out.println("\nSeleccione una opción:");
	            System.out.println("1. Agregar ejercicio");
	            System.out.println("2. Mostrar rutina");
	            System.out.println("3. Salir");
	            opcion = scanner.nextInt();
	            scanner.nextLine(); // Limpiar buffer

	            switch (opcion) {
	                case 1:
	                    System.out.print("Ingrese el nombre del ejercicio: ");
	                    String nombre = scanner.nextLine();
	                    System.out.print("Ingrese el grupo muscular (pierna, brazo, abdomen): ");
	                    String grupoMuscular = scanner.nextLine().toLowerCase();
	                    if (grupoMuscular.equals("pierna") || grupoMuscular.equals("brazo") || grupoMuscular.equals("abdomen")) {
	                        Ejercicio ejercicio = new Ejercicio(nombre, grupoMuscular);
	                        rutinaDeEjercicio.agregarEjercicio(ejercicio);
	                        System.out.println("Ejercicio agregado.");
	                    } else {
	                        System.out.println("Grupo muscular no válido. Intente de nuevo.");
	                    }
	                    break;
	                case 2:
	                    rutinaDeEjercicio.mostrarRutina();
	                    break;
	                case 3:
	                    System.out.println("Saliendo del programa.");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Intente nuevamente.");
	            }
	        } while (opcion != 3);

	        scanner.close();
	    }
	}

	


