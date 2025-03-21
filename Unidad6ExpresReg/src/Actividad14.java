import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {

	Scanner leer = new Scanner(System.in);
				
				
	System.out.println("Introduce la cuenta bancaria con el siguiente formato 0000-0000-00-0000000000");
	String cuenta = leer.nextLine();
	
	boolean cuentaValida = validarCuenta(cuenta);
	
	if(cuentaValida == true)
	System.out.println("\nLa cuenta es válida, puede continuar: ");
	else
	System.out.println("\nEl número introducido no es  una cuenta válida: ");
	
	leer.close();

	}
	
	private static boolean validarCuenta(String cuenta) {
		String regex = "^([0-9]{4}-[0-9]{4}-[0-9]{2}-[0-9]{10})$";
		return cuenta.matches(regex);	
	}
}
