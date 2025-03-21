package Actividad7;

import java.util.ArrayList;
import java.util.Scanner;


public class Aplicacion {
	
	private static ArrayList<Producto> productos = new ArrayList<>();
	private static ArrayList<Pedido> pedidos = new ArrayList<>();
	private static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//menu principal para ingresar producto/hacer pedido
		 int opcion;
		 
		do {
			opcion=mostrarMenu();
			procesarOpcion(opcion);
		}while (opcion!=3);
	}	
		public static int mostrarMenu() {
			
			System.out.println("//// MENÚ PRINCIPAL ////");
			System.out.println("________________________");
			System.out.println("1. REGISTRAR PRODUCTO");
			System.out.println("2. HACER PEDIDO");
			System.out.println("3. SALIR");
			System.out.println("\n");
			return leer.nextInt();
			
		}
		
		public static void procesarOpcion(int opcion) {
		
			switch (opcion) {
			case 1://registrar producto
				procesarSubMenu1();
				break;
			case 2://Hacer pedido
				procesarSubMenu2();
				break;
			case 3:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Esta opcion no es válida");
				break;
			}
	}
		
		//Submenú para registrar producto 
		public static void procesarSubMenu1() {
			int opcion;
			do {
				System.out.println("\n<<<-SUBMENÚ REGISTRAR PRODUCTO->>>");
				System.out.println("1. Registrar Producto");
				System.out.println("2. Ver ultimo producto ingresado");
				System.out.println("3. Ver productos ingresados");
				System.out.println("4. Eliminar producto");
				System.out.println("5. Volver al menú principal");
				opcion = leer.nextInt();
				leer.nextLine();
					
			switch (opcion) {
				case 1:
					agregarProducto();
					break;
				case 2:
					verUltimo();
					break;
				case 3:
					verProductos();
					break;
				case 4:
					eliminarProducto();
					break;
				case 5:
					System.out.println("Volviendo al menú principal...");
					break;
				default:
					System.out.println("Opción no válida.");
					break;
				}
			}while (opcion !=5);
		}
		//método para agregar un producto
		public static void agregarProducto(){
			System.out.println("\nIngresa los datos del producto: ");
			System.out.println("Nombre: ");
			String nombre = leer.nextLine();
			System.out.println("Precio Base: ");
			double precioBase = leer.nextDouble();
			System.out.println("Descuento: ");
			double descuento = leer.nextDouble();
			System.out.println("Iva: ");
			double iva = leer.nextDouble();
			leer.nextLine(); 
			
			Producto nuevoProducto = new Producto(nombre, precioBase, descuento, iva);
			productos.add(nuevoProducto);
			System.out.println("Producto registrado!");
		}
		
		static void verUltimo() {
			if(productos.isEmpty()) {
				System.out.println("No hay productos registrados");
			}else System.out.println("El último producto ingresado es: "
					+productos.get(productos.size()-1));
		}
		//ver productos listado completo
		public static void verProductos() {
			if (productos.isEmpty()) {
				 System.out.println("No hay productos registrados.");
			} else {
				System.out.println("\n<<< Lista de Productos >>>");
				 System.out.println("\n"+productos.toString());
				}
			}
		
		
		//eliminar producto
		public static void eliminarProducto() {
			if (productos.isEmpty()) {
				System.out.println("No hay productos para eliminar.");
				return;
			}
			
				verProductos();
				System.out.print("Ingrese el ID del producto a eliminar: ");
				int id = leer.nextInt();
				leer.nextLine();
		
				for(int i=0;i<productos.size();i++) {
					if(productos.get(i).id == id) {
					productos.remove(i);
					System.out.println("Producto eliminado con éxito.");
			        return;
					}
				}
			
		}
				
		//Submenú para registrar pedido
		public static int mostrarSubMenu2() {
			System.out.println("\n<<< SUBMENÚ REALIZAR PEDIDO >>>");
			System.out.println("1. Iniciar Pedido");
			System.out.println("2. Agregar producto");
			System.out.println("3. Eliminar producto");
			System.out.println("4. Ver pedido y pagar");
			System.out.println("5. Salir");
					
			return leer.nextInt();
		}
		
		//procesar submenú2
		public static void procesarSubMenu2() {
			int opcion;
			do {
			opcion = mostrarSubMenu2();
			leer.nextLine();
			switch (opcion) {
			
			case 1:
				iniciarPedido();
		        break;
			case 2: 
				agregarProductoPedido();
				break;
			case 3:
				eliminarProductoPedido();
				break;
			case 4: 
				verPedido();
				break;
			case 5:
				System.out.println("Saliendo del submenú...");
				break;
			default:
                System.out.println("Opción no válida.");
                break;
				}
			}while (opcion!=5);
		}
		//método para iniciar pedido 
		public static void iniciarPedido() {
			System.out.println("\nIngresa los datos del pedido: ");
			System.out.print("Nombre del cliente: ");
	        String nombreCliente = leer.nextLine();
	        System.out.print("Ingrese la fecha del pedido (dd/mm/yyyy): ");
	        String fecha = leer.nextLine();
	       
	        if(!fecha.matches("^(0[1-9]|[12][0-9]|3[0-1]/0[1-9]|1[0-2]/[0-9]{4}$") ) {
	        	System.out.println("El formato de fecha no es válido");
	        }
	        Pedido nuevoPedido = new Pedido(nombreCliente,fecha);
	        pedidos.add(nuevoPedido);
	        System.out.println("Pedido creado");
		}
		
		public static void agregarProductoPedido() {
			System.out.println("\n--- Lista de Productos Disponibles ---");
			for (int i= 0; i<productos.size();i++) {
				System.out.println(productos.get(i));
			}
			
			System.out.println("Ingrese el ID del producto para agregar al pedido: ");
			int codigoP = leer.nextInt();
			leer.nextLine();
			
			Producto productoSeleccionado = null;
			for(int i=0; i<productos.size();i++) {
				if(productos.get(i).id == codigoP) {
					productoSeleccionado = productos.get(i);
					break;
				}
			}
			
			if(productoSeleccionado == null) {
				System.out.println("Producto no encontrado.");
		        return;
			}
			
			//Clonar el producto
			Producto copiaProducto = productoSeleccionado.clone();
			
			//agregar un pedido a ultimo pedido
			Pedido ultimoPedido = pedidos.get(pedidos.size()-1);
			if(ultimoPedido.listadoPedido == null) {
				ultimoPedido.listadoPedido = new ArrayList<>();
			}
			
			ultimoPedido.listadoPedido.add(copiaProducto);
			ultimoPedido.precioTotal += copiaProducto.calcularPrecio();
			
			System.out.println("Producto agregado al pedido con éxito.");
			
		}
		
		
		public static void eliminarProductoPedido() {
			if (pedidos.isEmpty()) {
				System.out.println("No hay productos para eliminar.");
				return;
			}
			
				verProductos();
				System.out.print("Ingrese el ID del producto a eliminar: ");
				int id = leer.nextInt();
				leer.nextLine();
		
				for(int i=0;i<pedidos.size();i++) {
					if(pedidos.get(i).id == id) {
					pedidos.remove(i);
					System.out.println("Producto eliminado con éxito.");
			        return;
					}
				}
		}
		
		//metodo para ver el pedido
		public static void verPedido() {
			if (pedidos.isEmpty()) {
				System.out.println("No hay pedidos registrados.");
		        return;
			}
			
			Pedido ultimopedido = pedidos.get(pedidos.size()-1);
			ultimopedido.verPedido();
		}

}
