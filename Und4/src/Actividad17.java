import java.util.Scanner;

public class Actividad17 {

	public static void main(String[] args) {
		//algoritmo para cambio de caracteres
		String cambiadas ="";
		Scanner leer = new Scanner(System.in);
		
		//solicitud de datos
		System.out.print("Ingresa una frase: ");
		String frase = leer.nextLine();
		
		//llamado al método
		cambiadas = reemplazoVocales(frase);
		System.out.print("Su frase con las vocales cambiadas es: "+cambiadas);
	}
	//método que realiza el reemplazo de las vocales
	public static String reemplazoVocales(String frase) {
	        // Reemplazar cada vocal con .replace
	        String cambiadas = frase.replace('e', 'a')
	       .replace('i', 'a') .replace('o', 'a') .replace('u', 'a');
		return cambiadas;
	}
}
