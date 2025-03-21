
package Actividad8;

import java.util.Scanner;

public class AplicacionTeatro {
	private static Teatro teatro = new Teatro();
	static Scanner leer = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion;
		
		do {
			opcion = mostrarMenu();
			procesarOpcion(opcion);
		} while (opcion!=4 );

	}
	
	private static int mostrarMenu() {
		 System.out.println("//// MENÚ PRINCIPAL ////");
	        System.out.println("1. Vender entrada");
	        System.out.println("2. Consultar zona");
	        System.out.println("3. Informe de zonas");
	        System.out.println("4. Salir");
	        return leer.nextInt();
	}

	private static void procesarOpcion(int opcion) {
		leer.nextLine();
		
		switch (opcion) {
		case 1:
            venderEntrada();
            break;
        case 2:
            consultarZona();
            break;
        case 3:
            informeZonas();
            break;
        case 4:
            System.out.println("Saliendo...");
            break;
        default:
            System.out.println("Opción no válida.");
		}
	}
	
	private static void venderEntrada() {
		System.out.print("Ingresa el nombre de la zona: ");
		String nombreZona = leer.nextLine();
		System.out.print("Tipo de entrada (normal/reducida/abonado): ");
        String tipoEntrada = leer.nextLine();
		if (teatro.venderEntrada(nombreZona, tipoEntrada)) {
			 System.out.println("Entrada vendida con éxito.");
        } else {
        	System.out.println("No se puede vender la entrada.");
		}
	}
	
	private static void consultarZona() {
		 System.out.print("Nombre de la zona: ");
		 String nombreZona = leer.nextLine();
		 teatro.consultarZona(nombreZona);
	}
	
	private static void informeZonas() {
		teatro.informeZonas();
	}
}
