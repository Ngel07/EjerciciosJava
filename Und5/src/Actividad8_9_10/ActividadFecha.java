package Actividad8_9_10;
import java.util.Scanner;

public class ActividadFecha {

	public static void main(String[] args) {
		// 
		Fecha fechaXD = new Fecha();
		System.out.println("Fecha por defecto: " + fechaXD);
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Por favor, ingrese la fecha:");
		System.out.print("Ingrese el día (1-31): ");
		int dia = leer.nextInt();
		System.out.print("Ingrese el mes (1-12): ");
		int mes = leer.nextInt();
		System.out.print("Ingrese el año (AAAA): ");
		int anio = leer.nextInt();
		Fecha fecha2 = new Fecha(dia,mes,anio); 
	    
		int opcion;
		
		do {
	    System.out.println();
	    System.out.println("MENÚ DE OPCIONES");
	    System.out.println("1. Modificar fecha");
	    System.out.println("2. Ver fecha");
	    System.out.println("3. ver siguiente día ");
	    System.out.println("4. SALIR ");
	    opcion = leer.nextInt();
	
	    switch (opcion) {
	    case 1: 
	    	System.out.print("Ingrese el día (1-31): ");
            dia = leer.nextInt();
            System.out.print("Ingrese el mes (1-12): ");
            mes = leer.nextInt();
            System.out.print("Ingrese el año (AAAA): ");
            anio = leer.nextInt();
            fecha2.modificarFecha(dia, mes, anio);
	    	break;
	    case 2:
	    	System.out.println("Fecha actual: " + fecha2);
            break;
	    case 3:
	    	fecha2.diaSiguiente();
            System.out.println("Día siguiente: " + fecha2);
			break;
	    case 4:
	    	System.out.println("...haz salido");
	    	break;
	    default:
			System.out.print("Opcion no valida ");
	    	
	    	}
		}while (opcion != 4);
	    
	}
}		
		
	

	
	

