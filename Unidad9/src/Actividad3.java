import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		pedirNumeros();
	}
	
	public static void pedirNumeros() {
		Scanner leer = new Scanner(System.in);
		double numeroMayor=0;
		boolean inicializado = false;
		
		System.out.println("Ingresa una secuencia de números decimales. Para terminar inserta una letra.");
		
		while(true) {
			try {
				double numero = leer.nextDouble();
				
				if (!inicializado) {
					numeroMayor = numero;
					inicializado = true;
				}
				
				if(numero> numeroMayor) {
					numeroMayor = numero;
				}
			}catch (InputMismatchException e) {
				leer.nextLine();
				//Para finalizar cuandonel ususario ingrese letras
				if (inicializado) {
					 System.out.println("El numero mayor introducido es: "+numeroMayor);
				}else { System.out.println("No se han introducido numeros");}
				
			}
		}
	}

}
