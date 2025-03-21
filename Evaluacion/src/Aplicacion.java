import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		Ruta ruta0 = null;
		int opcion;

		do {
			System.out.println("SELECCIONA UNA DE LAS SIGUIENTES OPCIONES(1,5):");
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
				ruta0 = new Ruta(nombreRuta, ciclica);
				System.out.println("La ruta se ha creado.");
				break;
			case 2:
				if (ruta0 == null || !ruta0.getInicio()) {
					System.out.println("No hay una ruta creada, debes iniciar una");

				} else {
					System.out.print("Introduce el punto de paso (x,y)");
					String paso = leer.nextLine();
					System.out.println("¿Es paso inicial? (s/n)");
					boolean inicio = leer.nextLine().equalsIgnoreCase("s");

					int resultado = ruta0.AnadirPaso(paso, inicio, false);
					if (resultado == 0) {
						System.out.println("Paso añadido correctamente.");
					} else {
						System.out.println("No se pudo añadir el paso.");
					}
				}
				break;

			case 3:
				if (ruta0 == null || !ruta0.getInicio()) {
					System.out.print("No hay una ruta creada, debes iniciar una");
				} else {
					System.out.print("Introduce el punto de paso final (x,y)");
					String pasoFinal = leer.nextLine();
					int resultado = ruta0.AnadirPaso(pasoFinal, false, true);
					if (resultado == 0) {
						System.out.println("Punto final añadido correctamente. La ruta está cerrada.");
					} else {
						System.out.println("No se pudo añadir el punto final.");
					}
				}
				break;
			case 4:
				if (ruta0 != null) {
					ruta0.mostrarInfo();
				} else {
					System.out.print("No hay una ruta creada, debes iniciar una");
				}
				break;
			case 5:
				System.out.println("El programa ha terminado");
				break;
			default:
				System.out.println("opcion no válida");
			}
		} while (opcion != 5);
		leer.close();
	}
}
