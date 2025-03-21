import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		//Algoritmo para saber si un numero es primo 
		
	     //Declaración de variables
		int numero;
		
		
		Scanner leer = new Scanner(System.in);
		System.out.println("¡Vamos a ver si tu número es primo!");
		System.out.println("Ingresa el número que quieres verificar: ");
		numero = leer.nextInt();
		
		
		boolean esPrimo = true;
        
		// Comprobar si tiene divisores distintos de 1 y de sí mismo
       
		for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;                 
            }
		}
		
		if (esPrimo) {
			System.out.println("El número que has ingresado es primo...");}
		else {
	        System.out.println("El número que has ingresado no es primo...");
	        leer.close();
		}
	}
}			



