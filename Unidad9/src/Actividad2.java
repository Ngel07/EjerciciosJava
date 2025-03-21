import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		pedirNumeros();
	}
	
	public static void pedirNumeros() {
		Scanner leer = new Scanner (System.in);
		double numeroMayor = 0;
		int contadorExcepciones = 0;
		int numerosValidos = 0;
		boolean inicializado = false;
		
		while(numerosValidos < 10) {
			try {
				System.out.println("Ingresa los números decimales: ");
				double numero = leer.nextDouble();
				//inicializa con el primer número como mayor
				if(!inicializado) {
					numeroMayor = numero;
					inicializado = true;
				}
				//actualiza el numero mayor con la siguiente entrada
				if(numero>numeroMayor) {
					numeroMayor=numero;
				}
				numerosValidos++;
				
			}catch (InputMismatchException e) {
				System.out.println("Error: El valor introducido no es válido. Ingresa un número decimal.");
				contadorExcepciones++;
				leer.nextLine();
				}
			}
		System.out.println("Ha completado 10  entradas válidas. Sus resultados son: ");
		System.out.println("El número más alto de los introducidos es: " + numeroMayor);
        System.out.println("El número de excepciones producidas es: " + contadorExcepciones);
        leer.close();
	}
}
