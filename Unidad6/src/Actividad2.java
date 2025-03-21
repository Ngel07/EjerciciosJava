import java.util.Arrays;
import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		
		String elementos[];
		int i;
		elementos= new String[10];
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce los caracteres para el Array");
		for (i=0;i < elementos.length; i++) {
			System.out.println("Introduce el valor "+i);
			elementos[i]  = leer.nextLine();
		}
		
		System.out.print("Las posiciones pares del array son: ");
		
		for (i=0;i < elementos.length; i+=2) {
		System.out.print(elementos[i]+"-");
		}
		leer.close();
	}  

}
