package Actividad2;
import java.util.Scanner;

public class ActividadCoche {
	
	public static void main(String[] args) {
		
		Coche coche1 = new Coche();
		System.out.println("Valores por defecto ");
		coche1.mostrarInfo();
		System.out.println();
		
		Coche coche2 =new Coche();
		
		System.out.println();
		
		System.out.println("Ingrese los datos de un nuevo coche:");
        coche2 = insertarInfo();
        System.out.println("El nuevo coche ingresado es:");
        coche2.mostrarInfoCompleta();
        System.out.println();
        
	} // Solicitar datos al usuario
	public static Coche insertarInfo() {
	Scanner leer = new Scanner(System.in);
	
	 System.out.print("Modelo: ");
     String modelo = leer.nextLine();

     System.out.print("Color: ");
     String color = leer.nextLine();

     System.out.print("Pintura metalizada (S/N): ");
     boolean pinturaMetalizada = leer.nextLine().equalsIgnoreCase("S");

     System.out.print("Numero de matrícula ");
     String matricula = leer.nextLine();
     
     System.out.print("¿Qué tipo de coche es? (mini, utilitario, familiar, deportivo): ");
     Coche.TipoCoche tipo = Coche.TipoCoche.valueOf(leer.nextLine().toUpperCase());

     System.out.print("Año de fabricación ");
     int anio = leer.nextInt();
     leer.nextLine();  // Consumir la línea extra

     System.out.print("Modalidad de seguro (terceros/todo_riesgo): ");
     Coche.ModalidadSeguro seguro = Coche.ModalidadSeguro.valueOf(leer.nextLine().toUpperCase());

     leer.close();
     
     return new Coche(modelo, color, pinturaMetalizada, matricula, tipo, anio, seguro);
	}

}
