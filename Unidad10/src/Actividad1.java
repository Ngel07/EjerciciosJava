import java.time.LocalDate;
import java.util.Scanner;

public class Actividad1 {
	
	private static boolean terminar = false;
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		do {
			mostrarMenu(leer);
		}while(!terminar);
		
		leer.close();
	}
	 public static void mostrarMenu(Scanner leer) {
		 LocalDate hoy = LocalDate.now();
		 int opcion;
		 
		 System.out.println("\n<<!Bienvenido a ver fecha¡>>");
		 System.out.println("----------------------------");
		 System.out.println(" 1. Fecha actual");
		 System.out.println(" 2. Ver Año");
		 System.out.println(" 3. Ver Mes");
		 System.out.println(" 4. Ver Día");
		 System.out.println(" 5. Salir");
		 opcion = leer.nextInt();
		 
		 switch (opcion) {
		case 1:
			System.out.println("La fecha actual es: "+hoy);
			break;
		case 2:
			System.out.println("El año actual es: "+hoy.getYear());
			break;
		case 3:
			System.out.println("El mes actual es: "+hoy.getMonth());
			break;
		case 4:
			System.out.println("El dia de hoy es: "+hoy.getDayOfMonth());
			break;
		case 5:
			System.out.println("¡Ha salido!");
			terminar = true;
			break;
					
		default:
			 System.out.println("Opción no válida.");
			 leer.nextLine();
		}
		 
	 }
	
}
