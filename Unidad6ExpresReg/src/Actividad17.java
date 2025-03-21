import java.util.Scanner;

public class Actividad17 {

	public static void main(String[] args) {
		//validacion de teléfono fijo
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce el numero de teléfono fijo a validar");
		String telefono = leer.nextLine();
		
		boolean telValido = validarTel(telefono);
		
		if(telValido == true)
		System.out.println("\nEl número de teléfono es válido: ");
		else
		System.out.println("\nEl número teléfono no es válido: ");
		
		leer.close();

	}//validar telefono fijo
		private static boolean validarTel(String telefono) {
			String regex = "^(0034|\\+34|34)9[0-9][0-9]{6,7}$";
			return telefono.matches(regex);	
		}

}