import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		// Algoritmo para calcular el NIF
		
		String dni = obtenerDNI();
		
		String nif = calcularNIF(dni);
		
		
		System.out.print("Su NIF es: "+nif);
		
		
		
	}	//método para leer y guardar el dni
		public static String obtenerDNI() {
	
	 	Scanner leer = new Scanner(System.in);
	 	System.out.print("Por favor ingresa tu DNI sin letras");
		String dni = leer.nextLine();
		return dni;
		
		}
		
		//método para calcular el nif 
		public static String calcularNIF(String dni) {
			String letrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
			
			int numeroDNI = Integer.parseInt(dni);
			
			int modulo23 = numeroDNI % 23;
			
			char letra = letrasNIF.charAt(modulo23);
			
			return dni + "-" + letra;
		}
		
}
