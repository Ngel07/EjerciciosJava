package Actividad12;


import java.util.Scanner;

public class ActividadAparato {

	public static void main(String[] args) {
				
		Scanner leer = new Scanner(System.in);

		        Aparato bombilla = new Aparato("Bombilla", 100);
		        Aparato radiador = new Aparato("Radiador", 2000);
		        Aparato plancha = new Aparato("Plancha", 1200);
		        
		        Instalacion instalacion = new Instalacion(bombilla, radiador, plancha);

		        
		        
		    int verConsumo;
			do {
		    	System.out.println();
		        System.out.print("\nElija el consumo que desea revisar");
		        System.out.print("\n1. Bombilla y Plancha");
		        System.out.print("\n2. Plancha y Radiador");
		        System.out.print("\n3. Bombilla plancha y radiador");
		        System.out.print("\n4. Salir");
		        System.out.println("\n");
		        
		        verConsumo = leer.nextInt();

		       switch (verConsumo) {
			case 1: 
				bombilla.encender();
		        plancha.encender();
		        instalacion.actualizarConsumo();
		        System.out.print(instalacion.mostrarConsumoTotal());
		        break;
			case 2:
				plancha.apagar();
		        radiador.encender();
		        instalacion.actualizarConsumo();
		        System.out.print(instalacion.mostrarConsumoTotal());
		        break;
			case 3:
				bombilla.encender();
		        plancha.encender();
		        radiador.encender();
				instalacion.actualizarConsumo();
		        System.out.println(instalacion.mostrarConsumoTotal());
		        break;
			case 4:
				System.out.print("Ha Salido");
				break;
			default: System.out.print("Ha Salido");
				
			}            
		} while  (verConsumo != 4);

	}
}

