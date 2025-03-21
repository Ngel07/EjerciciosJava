import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Suma suma = new Suma(50);
		
		suma.leerNumeros();
		suma.calcularSumaPares();
		suma.imprimirSumaPares();

	}
}

class Suma{
		private int[] numeros;
		private int sumaPares;
	
	
	//Constructor
	public Suma(int size) {
		numeros = new int[size];
		sumaPares = 0;
	}
	
	public void leerNumeros() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce 50 numeros:");
		for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el numero " +i+ ": ");
            numeros[i] = leer.nextInt();
		}leer.close();
	}
	
	public void calcularSumaPares() {
		
		System.out.println("Los datos ingresados son: ");
	    for (int i = 0; i < numeros.length; i++) {
	        System.out.print(numeros[i] + " ");
	    }
		for (int i=0; i<numeros.length; i++) {
			if(numeros[i]%2==0) {
				sumaPares += numeros[i];
			}
		}
	}
	public void imprimirSumaPares() {
		System.out.println("\nLa suma de los numeros pares es: " + sumaPares);
		}
	
}
	


