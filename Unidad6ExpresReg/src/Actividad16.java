import java.util.Scanner;

public class Actividad16 {
	
	public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
	
	
	System.out.println("Introduce el numero de teléfono a validar");
	String telefono = leer.nextLine();
	
	boolean telValido = validarTel(telefono);
	
	if(telValido == true)
	System.out.println("\nEl número de teléfono es válido: ");
	else
	System.out.println("\nEl número teléfono no es válido: ");
	
	leer.close();

}	//validar telefono
	private static boolean validarTel(String telefono) {
		String regex = "^(0034|\\+34|34)[67][0-9]{8}$";
		return telefono.matches(regex);	
		}

}
