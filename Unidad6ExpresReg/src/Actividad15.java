import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);

		// Solicitar al usuario el NIF
		System.out.println("Introduce el NIF con el formato 00000000X:");
		String nif = leer.nextLine();

		// Validar el NIF
		if (validarNIF(nif)) {
			System.out.println("\nEl NIF es válido, puede continuar.");
		} else {
			System.out.println("\nEl NIF introducido no es válido.");
			}
		leer.close();
}
	//validar nif
	private static boolean validarNIF(String nif) {
		String regex = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$";
		return nif.matches(regex);
		}
}
