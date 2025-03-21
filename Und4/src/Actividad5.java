import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		//método para imprimir arbol de caracteres
		
		//definir variables
		char caracter;
		int lineas;

		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe el caracter que desear repetir: ");
		caracter = leer.next().charAt(0);
		
		System.out.println("Escribe el numero de lineas para el alto del arbol: ");
		lineas = leer.nextInt();
		
		
		
		imprimirarbol(caracter, lineas);
		
		leer.close();

		}
	public static void imprimirarbol(char a,int lineas) {
		//definir variable de este método
		int i;
		
		//formar el arbol
		for (i=0;i<=lineas;i++) { 
			for (int x = lineas; x >i; x--) {
				System.out.print(" ");
			} 
			for (int y =0;y<= i; y++) {
				System.out.print(a+" ");
			}
			System.out.println();
		} 
	}

}


