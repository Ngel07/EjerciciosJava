package Practica3;

import java.util.ArrayList;

public class Pedido {
		
	static int codigo = 1;
	int id;
	String nombreCliente;
	String fecha;
	double precioTotal;
	double descuento;
	public ArrayList<Producto> listadoPedido;
	
	//ver pedido
	public Pedido() {
		this.id = codigo++;
		this.nombreCliente="Cliente desconocido";
		this.fecha= "00/00/0000";
		this.precioTotal=0.0;
	}
	
	public Pedido(String nombreCliente, String fecha) {
		this.id = codigo++;
		this.nombreCliente = nombreCliente;
		this.fecha = fecha;
		this.precioTotal=0.0;
	}
	//getter y setter
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente=nombreCliente;
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
		
	public void verPedido() {
		System.out.println("////////////////////////////");
		System.out.println("ID del pedido: "+id);
		System.out.println("Cliente: "+nombreCliente);
		System.out.println("Fecha: "+ fecha);
		System.out.println("Productos en el pedido: ");
		
		if (listadoPedido.isEmpty()) {
			System.out.println("No hay productos en el pedido");
		}else {
			for(int i=0;i<listadoPedido.size();i++) {
				System.out.println(listadoPedido.get(i));
			}
		}
		
		System.out.println("Precio total: "+precioTotal+"€");
		System.out.println("_____________________________________");

	}
	
	
	
}
