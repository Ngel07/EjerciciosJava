import java.util.Random;
import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		// Algoritmo para jugar a adivinar el número
		
	     int contIntentos = 0;
	     int numero;
			
	    Random lanzamiento = new Random ();
	 	int numSecreto = lanzamiento.nextInt(100); 
	     
	     
	 	System.out.println("¡Bienvenid@ al juego de adivinar el número!");
        System.out.println("He elegido un número entre 1 y 100. ¡Vamos, intenta adivinarlo!");
	     
	     Scanner leer = new Scanner(System.in);  
	     
			
	     do  {	
	    	 System.out.print("Dime un número entre 1 y 100: ");
	    	 numero = leer.nextInt();
	    	 contIntentos++;
	    	 
	    	 if(numSecreto == numero) {
	    		 System.out.print("¡Adivinaste! ");
				 System.out.println("\nHas adivinado después de "+ contIntentos+" Intentos");
				
			}else if (numSecreto > numero) {
				System.out.print("Te falta un poco ");
			} else {
				System.out.print("Te has pasado ");
			} 
	     }while (numero!= numSecreto);
	     leer.close();
	}
}



