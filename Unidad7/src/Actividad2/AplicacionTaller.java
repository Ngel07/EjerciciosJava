package Actividad2;

import java.util.Scanner;

public class AplicacionTaller {

	public static void main(String[] args) {
		Taller taller = new Taller();
		Scanner leer = new Scanner(System.in);
		int opcion;
		
		do {
			
		System.out.println("\n Menu principal Taller v.1.0");
		System.out.println("1. Registrar coche");
        System.out.println("2. Listar coches pendientes de reparar");
        System.out.println("3. Listar coches reparados");
        System.out.println("4. Registrar coche como reparado");
        System.out.println("5. Registrar salida de coche del taller");
        System.out.println("6. Salir");
        opcion = leer.nextInt();
        leer.nextLine();
        
        switch (opcion) {
        case 1:
        	System.out.print("Ingrese la matrícula: ");
        	String matricula = leer.nextLine();
        	System.out.print("Ingrese el color: ");
        	String color = leer.nextLine();
        	System.out.print("Ingrese el modelo: ");
        	String modelo = leer.nextLine();
        	System.out.print("Ingrese la marca: ");
        	String marca = leer.nextLine();
        	System.out.print("Ingrese la cilindrada: ");
        	int cilindrada = leer.nextInt();
        	Coche coche = new  Coche(matricula, color, modelo, marca, cilindrada);
        	taller.registrarCoche(coche);
        	break;
        case 2: 
        	taller.listarPendientes();
        	break;
        case 3:
        	taller.listarReparados();
        	break;
        case 4:
        	System.out.print("Ingrese la matrícula del coche a registrar como reparado: ");
        	matricula = leer.nextLine();
        	taller.registrarReparado(matricula);
        	break;
        case 5: 
        	System.out.println("Ingrese la matricula del cohe que va a retirar del taller");
        	matricula = leer.nextLine();
        	taller.registrarSalida(matricula);
        	break;
        case 6:
        	System.out.println("Saliendo d ela aplicación");
        	break;
        default:
        	System.out.println("Opción no válida");
        	}
        }while (opcion!=6);
	
        leer.close();
	}
}
	
		

