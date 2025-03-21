package Actividad1;
import java.util.ArrayList;
import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ArrayList<Empleado> empleados = new ArrayList<>();
		ArrayList<Empleado> empleadosMostrados = new ArrayList<>();
		String respuesta;
		
		do {
		System.out.println("Ingrese nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese apellidos: ");
        String apellidos = leer.nextLine();
        System.out.println("Ingrese sueldo: ");
        double sueldo = leer.nextDouble();
        leer.nextLine();
        
        //agregar el empleado a la lsita
        empleados.add(new Empleado(nombre,apellidos,sueldo));
        
        //preguntar para agregara más empleados
        System.out.println("¿Quieres insertar los datos de otro empleado? (S/N)");
		respuesta = leer.nextLine().toUpperCase();		
		
		}while (respuesta.equals("S"));
		
		
		//visualizar los empleados ingresados sin duplicados
			System.out.println("\nListado de empleados (únicos) con sueldo: ");
			for(int i=0; i<empleados.size();i++) {
				Empleado actual = empleados.get(i);
				boolean repetido = false;
				
				//Recorrer la lista para descartar datos repetidos
				for (int j=0; j<empleadosMostrados.size(); j++) {
					Empleado mostrado = empleadosMostrados.get(j);
					
					//si no son repetidos los agrega a ala lsita de mostrar
					if(mostrado.getNombre().equals(actual.getNombre()) || mostrado.getSueldo() == actual.getSueldo()) {
						repetido = true;
						break;// sale del bucle cuando encuentra uno igual al buscado
					}
				}
				//si no es repetido lo agrega a ala nueva lista
				if(!repetido) {
					empleadosMostrados.add(actual);
					System.out.println(actual);
				}
			}
			leer.close();
		}

}

