import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Actividad6 {
	private static boolean terminar = false; 
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int opcion;
	
	do {
		mostrarMenu(leer);
	} while (!terminar);
	
	leer.close();

}

	public static void mostrarMenu(Scanner leer) {
		int opcion;
		
		System.out.println("Bienvenido a RELOJ EUROPEO");
		System.out.println("\nSeleccione una capital para ver la fecha y hora:");
        System.out.println("1. Budapest (Hungría)");
        System.out.println("2. Dublín (Irlanda)");
        System.out.println("3. Reikiavik (Islandia)");
        System.out.println("4. Luxemburgo");
        System.out.println("5. La Valeta (Malta)");
        System.out.println("6. Ámsterdam (Países Bajos)");
        System.out.println("7. Estocolmo (Suecia)");
        System.out.println("8. Salir");

        opcion = leer.nextInt();
        leer.nextLine(); 
		
        switch (opcion) {
        case 1:
            mostrarHoraCapital("Budapest", "Europe/Budapest");
            break;
        case 2:
            mostrarHoraCapital("Dublín", "Europe/Dublin");
            break;
        case 3:
            mostrarHoraCapital("Reikiavik", "Atlantic/Reykjavik");
            break;
        case 4:
            mostrarHoraCapital("Luxemburgo", "Europe/Luxembourg");
            break;
        case 5:
            mostrarHoraCapital("La Valeta", "Europe/Malta");
            break;
        case 6:
            mostrarHoraCapital("Ámsterdam", "Europe/Amsterdam");
            break;
        case 7:
            mostrarHoraCapital("Estocolmo", "Europe/Stockholm");
            break;
        case 8:
            System.out.println("¡Gracias por usar Reloj Europeo! Saliendo...");
            terminar = true;
            break;
        default:
            System.out.println("Opción no válida. Intente de nuevo.");
    }while (opcion != 8);

} 
	
	public static void mostrarHoraCapital(String ciudad, String zonaHoraria) {
        LocalDateTime ahora = LocalDateTime.now(); 
        ZonedDateTime fechaHoraZona = ahora.atZone(ZoneId.of(zonaHoraria));
        System.out.println("Fecha y hora en " + ciudad + " (" + zonaHoraria + "): " + fechaHoraZona);
    }
}
