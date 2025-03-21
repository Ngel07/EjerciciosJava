import java.util.Arrays;
import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		//
		int numeros[], i;
		numeros = new int[10];
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce los números");
		for (i=0;i<10;i++) {
			System.out.println("Introduce el valor "+i+" para el array");
		numeros[i]  = leer.nextInt();
		}
		System.out.println(Arrays.toString(numeros));
		
		leer.close();
	}
	
}
