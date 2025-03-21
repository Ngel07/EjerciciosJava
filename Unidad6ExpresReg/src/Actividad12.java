import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Actividad12 {

	public static void main(String[] args) {
		// 
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce el texto que deseas revisar");
		String texto = leer.nextLine();
		
		System.out.println("\nIngresa el texto que deseas buscar: ");
		String cadenaBuscada = leer.nextLine();
		System.out.println();
		
		System.out.println("El número de incidencias en el texto es de: ");
		System.out.println(contarIncidencias(texto, cadenaBuscada));
		
		 leer.close();
	}


	public static int contarIncidencias(String texto, String cadenaBuscada) {
		
		Pattern patron = Pattern.compile(cadenaBuscada);
		Matcher matcher = patron.matcher(texto);
		int cuenta = 0;
		
		while(matcher.find()) {
			cuenta++;
		}
		return cuenta;
	}
}


