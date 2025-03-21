import java.util.Random;
import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		//Algoritmo para simular el juego de la moneda cara o cruz
		// Inicializar contadores para "cara" y "cruz"
        int contCara = 0;
        int contCruz = 0;
        int x;
		
        Random lanzamiento = new Random();
		Scanner leer = new Scanner(System.in);
		System.out.print("Bienvenid@ al juego de la moneda cara o cruz "
		+"\n¿Cuantas veces quieres lanzar la moneda? ");
		x = leer.nextInt();
		
		
		for (int i = 0; i < x; i++) {
        	int resultado = lanzamiento.nextInt(2); 
        if (resultado == 0) {
               contCara++;
            } else {
                contCruz++;
            }
        }
        
        System.out.println("Después de "+x+" lanzamientos:");
        System.out.println("Cara ha caído: " + contCara + " veces.");
        System.out.println("Cruz ha caído: " + contCruz + " veces.");
        leer.close();
	} 
}


