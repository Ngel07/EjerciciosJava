import java.util.Scanner;

public class Prueba_Aplicacion {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
        PruebaRuta ruta0 = null;
        int opcion;

        do {
            System.out.println("\nSELECCIONA UNA DE LAS SIGUIENTES OPCIONES(1,5):");
            System.out.println("1. - Crear ruta.");
            System.out.println("2. - Añadir punto de paso a la ruta.");
            System.out.println("3. – Añadir punto final a la ruta.");
            System.out.println("4. – Mostrar información de la ruta.");
            System.out.println("5. - Finalizar");
            opcion = leer.nextInt();
            leer.nextLine();
            
          switch (opcion) {
			case 1: 
				 System.out.print("Ingrese el nombre de la ruta: ");
                 String nombreRuta = leer.nextLine();
                 System.out.print("¿La ruta es cíclica? (s/n): ");
                 boolean ciclica = leer.nextLine().equalsIgnoreCase("s");
                 ruta0 = new PruebaRuta(nombreRuta, ciclica);
                 System.out.println("La ruta se ha creada.");	
				break;
			case 2: 
				if(ruta0==null) {
				System.out.print("No hay una ruta creada, debes iniciar una");	
				}
				else{System.out.print("Introduce el punto de paso (x,y)");
				 String paso = leer.nextLine();
				 ruta0.AnadirPaso(paso,false, false);
				
				 if(ruta0.numeroPasos<1) {
					ruta0.AnadirPaso(paso,true, false);
					System.out.println("La ruta ha sido iniciada correctamente.");
				}
			    }break; 
			 case 3:
				if(ruta0==null) {
					System.out.print("No hay una ruta creada, debes iniciar una");
					System.out.println("\nNo se pudo añadir el punto final.");			
				}else 
					System.out.print("Introduce el punto de paso final (x,y)");
					String pasoFinal = leer.nextLine();
					ruta0.AnadirPaso(pasoFinal, false, true);
		            System.out.println("Punto final añadido correctamente. La ruta está cerrada.");
		            break;
			case 4:
				if(ruta0==null){
					System.out.print("No hay una ruta creada, debes iniciar una");	
					}
				ruta0.mostrarInfo();
				break;
			default: System.out.println("opcion no válida");
          }	
        }while (opcion!=5);
			
       }
	
}
