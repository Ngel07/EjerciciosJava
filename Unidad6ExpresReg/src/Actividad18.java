import java.util.Scanner;

public class Actividad18 {

	public static void main(String[] args) {
		//
		Scanner leer = new Scanner(System.in);
		Validator formulario = new Validator();
		int opcion;
		
		
		do {
		opcion=mostrarMenu(leer);
		procesarOpcion(opcion, formulario, leer);		
		} while (opcion!=3);
		
		leer.close();
	}
	
	public static int mostrarMenu(Scanner leer) {		
		System.out.println("\n Selecciona una opción: ");
		System.out.println("1. Rellenar formulario");
		System.out.println("2. Ver formulario");
		System.out.println("3. Salir");
		return leer.nextInt();		
	}
	public static void procesarOpcion(int opcion, Validator formulario, Scanner leer) {
		leer.nextLine();
		
		switch (opcion) {
		case 1:
			System.out.println("Ingrese los datos para el registro del formulario");
			
			System.out.print("Introduce el código postal: ");
			String codigoP = leer.nextLine();
			if (validarCodigoPostal(codigoP)) formulario.setCodigoP(codigoP);
			
			 System.out.print("Introduce el DNI: ");
			 String dni = leer.nextLine();
			 if(validarDni(dni)) formulario.setDni(dni);
			 
			 System.out.print("Introduce el Email: ");
			 String email = leer.nextLine();
			 if (validarEmail(email)) formulario.setEmail(email);
			 
			 System.out.print("Introduce la dirección MAC: ");
			 String dirMAC = leer.nextLine();
			 if(validarMAC(dirMAC)) formulario.setDirMAC(dirMAC);
			 
			 System.out.print("Introduce la direccion de red: ");
			 String dirRed = leer.nextLine();
			 if(validarRed(dirRed)) formulario.setDirRed(dirRed);
			 
			 break;
		case 2:
			 System.out.print("Los datos ingresados son: ");
			 System.out.print(formulario.mostrarInfo());
			break;
		case 3:
			System.out.println("Saliendo de la aplicacion...");
			break;
		default:
			System.out.println("Opción no válida");
		}
	}
	
	public static boolean validarCodigoPostal(String codigoP) {
		return (codigoP.matches("^([0][1-9]|[1-4][0-9]|[5][0-2])[0-9]{3}$")); 
	}
	
	public static boolean validarDni(String dni) {
		return (dni.matches("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$"));
	}
	
	public static boolean validarEmail(String email) {
		return (email.matches("^[A-Za-z0-9]+[A-Za-z0-9._-]*@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"));
	}
	public static boolean validarMAC(String dirMAC) {
		return dirMAC.matches("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
	}
	public static boolean validarRed(String dirRed) {
		 return dirRed.matches("^([0-9]{1,3}\\.){3}[0-9]{1,3}$");
	}
}

