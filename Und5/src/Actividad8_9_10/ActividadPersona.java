package Actividad8_9_10;
import java.util.Scanner;
public class ActividadPersona {

	public static void main(String[] args) {
		//
		Scanner leer = new Scanner(System.in);
		Persona persona = new Persona();
		

		System.out.println("Ingrese su fecha de nacimiento : ");
		System.out.print("Ingrese el día (1-31): ");
		int dia = leer.nextInt();
		System.out.print("Ingrese el mes (1-12): ");
		int mes = leer.nextInt();
		System.out.print("Ingrese el año (AAAA): ");
		int anio = leer.nextInt();
		Fecha fnacimiento = new Fecha(dia,mes,anio); 
		
		
		System.out.println("Ingrese nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese apellidos: ");
        String apellidos = leer.nextLine();
        System.out.println("Ingrese DNI: ");
        String dni = leer.nextLine();
        System.out.println("Ingrese la dirección: ");
        String direccion = leer.nextLine();
        System.out.println("Ingrese su email: ");
        String email = leer.nextLine();
		
        persona = new Persona(fnacimiento, nombre, apellidos, dni, direccion, email);
        
        System.out.println(persona);
        
        leer.close();
	}

}
