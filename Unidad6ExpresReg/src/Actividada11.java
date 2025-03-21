import java.util.Scanner;


public class Actividada11 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce la cadena de caracteres que deseas revisar");
		String cadena = leer.nextLine();
		
		System.out.println("\nLa cadena ingresada es: ");
		System.out.println(cadena);
		System.out.println();
		
		System.out.println("La cadena transformada es: ");
		System.out.println(transformarCadena(cadena));
		
		 leer.close();
	}


	public static String transformarCadena(String cadena) {
		 String nuevaCadena = cadena.replaceAll("\\d+","*");
		 return nuevaCadena;
	}
	
}	