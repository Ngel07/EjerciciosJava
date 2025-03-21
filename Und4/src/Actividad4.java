import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		// método para imprimir caracteres con salto de linea
		
				//definir variables
				char caracter;
				int veces,lineas;
		
				
				Scanner leer = new Scanner(System.in);
				
				//mostrar resultados
				System.out.println("Escribe el caracter que desear repetir: ");
				caracter = leer.next().charAt(0);
				
				System.out.println("Escribe el número de veces que deseas imrimir: ");
				veces = leer.nextInt();
				
				System.out.println("Escribe el número de lineas que deseas ver: ");
				lineas = leer.nextInt();
				
				
				//llamada al metodo
				imprimirCaracteres(caracter, veces, lineas);
				
				leer.close();

	}//metodo que imprime caracteres segun parametros recibidos
	public static void imprimirCaracteres(char a, int num, int lineas) {
		//definir variable de este método
		int i;
		
		// bucle para las repeticines
		for (i=0;i<lineas;i++) { 
			 for (int x = 0; x < num; x++) {
			System.out.print(a);
			 } System.out.println();
		} 
	}
}