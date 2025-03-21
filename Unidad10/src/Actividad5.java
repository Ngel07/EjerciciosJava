import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Actividad5 {
	private static boolean terminar = false;
	
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		
		do {
			mostrarMenu(leer);
		} while (!terminar);
		
		leer.close();

	}
	
	public static void mostrarMenu(Scanner leer) {
		int opcion;
		
		System.out.println("\nElija la zona horaria que desea ver");
		System.out.println("1. Europe/Madrid");
		System.out.println("2. Africa/El Cairo");
		System.out.println("3. Europe/London");
		System.out.println("4. Salir");
		
		try {
		
		opcion = leer.nextInt();
		leer.nextLine();
		
		switch (opcion) {
			case 1:
				System.out.println("La fecha y hora elegida es Europe/Madrid ");
				mostrarFechaHora("Europe/Madrid");
				break;
			case 2:
				mostrarFechaHora("Africa/Cairo");
				break;
			case 3:
				mostrarFechaHora("Europe/London");
				break;
			case 4:
				System.out.println("Ha salido del programa.");
				terminar = true; // Cambiar la variable para terminar el bucle
				break;
			default:
				System.out.println("¡Opción no válida!");
			break;
			}
		}catch(Exception e) {
			System.out.println("Error: Ingrese un número válido.");
            leer.nextLine(); 
		}
	}
	public static void mostrarFechaHora(String zonaHoraria) {
		LocalDateTime ahora = LocalDateTime.now();
		ZonedDateTime fechaHoraZona = ahora.atZone(ZoneId.of(zonaHoraria));
		System.out.println("La fecha y hora en: "+zonaHoraria+" es: "+fechaHoraZona);

	}
}
