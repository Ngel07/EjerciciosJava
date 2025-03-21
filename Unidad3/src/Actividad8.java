import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		// Programa que cuente los numeros pares entre A y B
		
		//Declaración de variables
		int a = 0, b = 0,B =0, c = 0, cont=0;
		
		//Solicitar al usuario que ingrese los números
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingresa el valor de A: ");
		a = leer.nextInt();
		
		System.out.println("Ingresa el valor de B: ");
		b = leer.nextInt();
		B = b;
		
		while (b<a) {
			c = b % 2;
			if (c == 0) {
				cont++;
				b++;}
			else {b++;
			} 
			
		} System.out.print("Hay "+cont+ " de números pares entre "+B+ " y "+a);
		leer.close();
	}
}


