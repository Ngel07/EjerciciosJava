package Actividad11;
import java.util.Scanner;

public class ActividadLinterna {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Linterna linterna1 = new Linterna();
		linterna1.estadoLinterna();
		int usar=0;
		
		do {
		System.out.print("\nElige como usarás tu linterna");
		System.out.print("\n 1. Luz Fija");
		System.out.print("\n 2. Parpadeo lento");
		System.out.print("\n 3. Parpadeo rápido");
		System.out.print("\n 4. Ver estado de la batería");
		System.out.println("\n 5. Salir");
		
		usar = leer.nextInt();
				
		switch (usar) {
		case 1:
			linterna1.cambiarModoLinterna(ModoLinterna.LUZ_FIJA);
			linterna1.encenderLinterna();
			break;
		case 2:
			linterna1.cambiarModoLinterna(ModoLinterna.PARPADEO_LENTO);
			linterna1.encenderLinterna();
			break;
		case 3:
			linterna1.cambiarModoLinterna(ModoLinterna.PARPADEO_RAIPO);
			linterna1.encenderLinterna();
			break;
		case 4:
			linterna1.estadoLinterna();
			break;
		
		default:
				System.out.print("Linterna apagada..");
			}
		}while (usar!=5);

	}

}
