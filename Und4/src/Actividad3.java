import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		// método para imprimir caracteres
		
		//definir variables
		char caracter;
		int veces;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe el caracter que desear repetir: ");
		caracter = leer.next().charAt(0);
		
		System.out.println("Escribe el número de veces que deseas imrimir: ");
		veces = leer.nextInt();
		
		imprimirCaracter(caracter, veces);
		
		leer.close();
	}
	
	public static void imprimirCaracter(char a, int num) {
		//definir variable de este método
		int i;
		
		// bucle para las repeticines
		for (i=0;i<num;i++) System.out.print(a);
	}

}
