package Actividad6Pizza;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Pizza pizza = new Pizza();
		
		int opcion;
		
		do {
		opcion=mostrarMenu(leer);
		procesarOpcion(opcion, pizza, leer);		
		} while (opcion!=5);
	}

	public static int mostrarMenu(Scanner leer) {		
		System.out.println("\n Selecciona una opción: ");
		System.out.println("1. Preparar Pizza ");
		System.out.println("2. Ver Pizza");
		System.out.println("3. Ver Precio");
		System.out.println("4. Pagar");
		System.out.println("5. Salir");
		System.out.println("Ha elegido: ");
		return leer.nextInt();		
	}
	
	public static void procesarOpcion(int opcion, Pizza pizza, Scanner leer) {
		
		switch (opcion) {
		case 1:
			prepararPizza(pizza, leer);
				break;
		case 2:
			System.out.println("La pizza seleccionada es: ");
			if(pizza.getMasa() == null) {
				System.out.println("No ha seleccionado Masa");
			}else {
				String masaSeleccionada = pizza.getMasa().getNombre();
				System.out.println("Masa: "+masaSeleccionada);
			}
			System.out.println("Ingredientes: ");
			String[] ingredientes = pizza.getIngredientes();
			for(int i = 0; i<pizza.getNumIngredientes(); i++) {
				System.out.println(ingredientes[i]);
				if(i< pizza.getNumIngredientes() -1) {
					System.out.println(",");
				}
			}
			System.out.println();
			break;
		case 3:
			System.out.println("El precio de la pizza es: "+ pizza.calcularPrecio());
			break;
		case 4:
			System.out.println("El valor a pagar es de: "+pizza.calcularPrecio());
			System.out.println("Gracias por tu compra. ¡Regresa pronto!");
			break;
		case 5:
			System.out.println("Saliendo de la aplicacion...");
			break;
			default:
				System.out.println("Opción no válida");
		}
	}
	
	public static void prepararPizza(Pizza pizza, Scanner leer) {
		boolean terminado = false;
		
		while(!terminado) {
			System.out.println("\n Elige las opciones para preparar tu pizza");
			System.out.println("1. Elegir Masa");
			System.out.println("2. Agregar Ingrediente");
			System.out.println("3. Terminar");
			int opcion = leer.nextInt();
			leer.nextLine();
			
			switch (opcion) {
			case 1:
				System.out.println("\n Selecciona el tipo de masa");
				System.out.println("1. Fina");
				System.out.println("2. Gruesa");
				System.out.println("3. Borde Queso");
				int tipoMasa = leer.nextInt();
				leer.nextLine();
				
				if (tipoMasa == 1) pizza.setMasa(new Masa("Fina", 5));
				else if (tipoMasa == 2) pizza.setMasa(new Masa("Gruesa", 7));
				else if (tipoMasa == 3) pizza.setMasa(new Masa("Borde Queso", 10));
				else System.out.println("Opción no válida"); 
				break;
			case 2:
				
				while (pizza.getNumIngredientes()<5) {
					System.out.println("\nSelecciona los ingredientes que vas a agregar");
					System.out.println("1. Tomate 2 €");
					System.out.println("2. Mozzarella 3 €");
					System.out.println("3. Jamón York 4 €");
					System.out.println("4. Queso Azul 5 €");
					System.out.println("5. Chedar 3 €");
					System.out.println("6. Queso Base 1 €");
					int tipoIngrediente = leer.nextInt();
					leer.nextLine();
					
				switch(tipoIngrediente) {
					case 1: pizza.addIngrediente(new Ingrediente("Tomate", 2)); break;
					case 2: pizza.addIngrediente(new Ingrediente("Mozzarella", 3)); break;
					case 3: pizza.addIngrediente(new Ingrediente("Jamón York", 4)); break;
					case 4: pizza.addIngrediente(new Ingrediente("Queso Azul", 5)); break;
					case 5: pizza.addIngrediente(new Ingrediente("Chedar", 3)); break;
					case 6: pizza.addIngrediente(new Ingrediente("Queso Base", 1)); break;
					default: System.out.println("Opción no válida");
					}
				}
				break;
			case 3:
				terminado = true;
				break;
			default:
				System.out.println("Opción no válida");
			}
		}
	}
}
