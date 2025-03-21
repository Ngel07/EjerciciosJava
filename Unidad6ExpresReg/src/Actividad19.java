import java.util.Scanner;

public class Actividad19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		EmployeManager formulario = new EmployeManager();
		int opcion;
		
		
		do {
		opcion=mostrarMenu(leer);
		procesarOpcion(opcion, formulario, leer);		
		} while (opcion!=3);
		
		leer.close();
	}
	
	public static int mostrarMenu(Scanner leer) {
		System.out.println("Employe Manager v1.0\n");
		System.out.println("\n Selecciona una opción: ");
		System.out.println("1. Rellenar formulario");
		System.out.println("2. Editar formulario");
		System.out.println("3. Ver formulario");
		System.out.println("4. Salir");
		return leer.nextInt();		
	}
	
	public static int mostrarSubMenu(Scanner leer) {		
		
		System.out.println("\n Selecciona el campo a editar: ");
		System.out.println("1. Nombre");
		System.out.println("2. Apelllidos");
		System.out.println("3. Código Postal");
		System.out.println("4. Dni");
		System.out.println("5. Email");
		System.out.println("9. Dirección");
		System.out.println("7. Marca Ordenador");
		System.out.println("8. Modelo");
		System.out.println("9. Dirección de Red");
		System.out.println("10. Salir");
		return leer.nextInt();
		
	}
	
	
	public static void procesarOpcion(int opcion,EmployeManager formulario, Scanner leer) {
		leer.nextLine();

		
		switch (opcion) {
		case 1:
						
			System.out.print("Ingrese el nombre del empleado: ");
			String nombre = leer.nextLine();
			if(validarNombre(nombre)) formulario.setNombre(nombre);
			
			System.out.print("Ingrese los apellidos del empleado: ");
			String apellidos = leer.nextLine();
			if(validarNombre(apellidos)) formulario.setApellidos(apellidos);
			
			System.out.print("Introduce el código postal: ");
			String codigoP = leer.nextLine();
			if (validarCodigoPostal(codigoP)) formulario.setCodigoP(codigoP);
			
			System.out.print("Introduce el DNI: ");
			String dni = leer.nextLine();
			if(validarDni(dni)) formulario.setDni(dni);
			 
			System.out.print("Introduce el Email: ");
			String email = leer.nextLine();
			if (validarEmail(email)) formulario.setEmail(email);
			
			System.out.print("Introduce la direccion: ");
			String direccion = leer.nextLine();
			formulario.setDireccion(direccion);
			
			System.out.println("\nIngrese los Datos de la estación de trabajo\n");
			
			System.out.print("Introduce la marca del ordenador: ");
			String marcaOrdenador = leer.nextLine();
			formulario.setMarcaOrdenador(marcaOrdenador);
			
			System.out.print("Introduce el modelo: ");
			String modelo = leer.nextLine();
			formulario.setMarcaOrdenador(modelo);
			 
			System.out.print("Introduce la direccion de red: \n");
			String dirRed = leer.nextLine();
			if(validarRed(dirRed)) formulario.setDirRed(dirRed);
			break;
		case 2:
			do {
				opcion=mostrarSubMenu(leer);
				opcionEditar(opcion, formulario, leer);		
				} while (opcion!=10);
		case 3:
			 System.out.print("\nLos datos ingresados son: ");
			 System.out.print(formulario.mostrarInfo());
			break;
		case 4:
			System.out.println("Saliendo de la aplicacion...");
			break;
		default:
			System.out.println("Opción no válida");
		
		}
	}
	public static void opcionEditar(int opcion,EmployeManager formulario, Scanner leer) {
		leer.nextLine();
		
		switch (opcion) {
		case 1:
			System.out.print("Ingrese el nombre del empleado");
			String nombre = leer.nextLine();
			if(validarNombre(nombre)) formulario.setNombre(nombre);
			System.out.println("Nombre actualizado.");
			break;
		case 2:
			System.out.print("Ingrese los apellidos del empleado");
			String apellidos = leer.nextLine();
			if(validarNombre(apellidos)) formulario.setApellidos(apellidos);
			System.out.println("Apellidos actualizado.");
			break;
		case 3:	
			System.out.print("Introduce el código postal: ");
			String codigoP = leer.nextLine();
			if (validarCodigoPostal(codigoP)) formulario.setCodigoP(codigoP);
			System.out.println("Código Postal actualizado.");
			break;
		case 4:
			System.out.print("Introduce el DNI: ");
			String dni = leer.nextLine();
			if(validarDni(dni)) formulario.setDni(dni);
			System.out.println("Dni actualizado.");
			break;
		case 5:	 
			System.out.print("Introduce el Email: ");
			String email = leer.nextLine();
			if (validarEmail(email)) formulario.setEmail(email);
			System.out.println("Email actualizado.");
			break;
		case 6:	
			System.out.print("Introduce la direccion: ");
			String direccion = leer.nextLine();
			formulario.setDireccion(direccion);
			System.out.println("Dirección actualizado.");
		case 7:	
			System.out.print("Introduce la marca del ordenador: ");
			String marcaOrdenador = leer.nextLine();
			formulario.setMarcaOrdenador(marcaOrdenador);
			System.out.println("Marca Ordenador actualizado.");
			break;
		case 8:	
			System.out.print("Introduce el modelo: ");
			String modelo = leer.nextLine();
			formulario.setMarcaOrdenador(modelo);
			System.out.println("Modelo actualizado.");
			break;
		case 9:	 
			System.out.print("Introduce la direccion de red: ");
			String dirRed = leer.nextLine();
			if(validarRed(dirRed)) formulario.setDirRed(dirRed);
			System.out.println("Dirección de Red actualizado.");
			break;
		case 10:
			System.out.print("\n");
			break;
		default:
			System.out.println("Opción no válida");

		}
	}
	
	public static boolean validarNombre(String nombre) {
		return (nombre.matches("^*[A-Za-z]"));
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
	
	public static boolean validarRed(String dirRed) {
		 return dirRed.matches("^([0-9]{1,3}\\.){3}[0-9]{1,3}$");
	}

}
