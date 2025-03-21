import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		// Algoritmo para verificar un numero capicúa
		
		//Solicitar valores al usuario
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe el primer número: ");
		int a = leer.nextInt();
		System.out.println("Escribe el segundo número: ");
		int b = leer.nextInt();
		System.out.println("Escribe el tercero número: ");
		int c = leer.nextInt();
		System.out.println("Escribe el ultimo número: ");
		int d = leer.nextInt();
		
		//llamado al método
		boolean numero = verificarCapicua(a,b,c,d);
		
		//mostrar el resultado según verificación
		if(numero==true)
		System.out.print("El número "+a+b+c+d+" es Capicua");
		else {System.out.print("El número "+a+b+c+d+" no es Capicua");}
		
		leer.close();

	}//verificar validez del número para hacer el cálculo
	public static boolean verificarCapicua(int a, int b, int c, int d) {
		return (a==d) && (b==c);
		}
	}


