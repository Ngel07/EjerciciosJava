package Actividad7;


public class Producto implements Cloneable {
	
	static int codigo = 1;
	int id;
	String nombre;
	double precioBase;
	double descuento;
	double iva;
	
	//constructor por defecto
	public Producto(){
		this.id= codigo++;
		this.nombre="Producto sin nombre";
		this.precioBase=0;
		this.descuento=0;
		this.iva=0.21;
	}
	//constructor con parametros
	Producto(String nombre, double precioBase, double descuento, double iva){
		this.id=codigo++;
		this.nombre=nombre;
		this.precioBase=precioBase;
		this.descuento=descuento;
		this.iva=iva;
	}
	
	//Setters y getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase=precioBase;
	}
	
	
	//calcular precio
	public double calcularPrecio() {
		return  this.precioBase * (1+this.iva) - this.descuento;
	}
	
	//Método que clona el producto
	public Producto clone()  {
		Producto clonProducto = new Producto(this.nombre, this.precioBase, this.descuento, this.iva);
		return clonProducto;
	}
	
	//ver productos guardados
	public String toString() {
		 return "ID producto: "+ ", Nombre: "+nombre+ ", PVP: "+calcularPrecio()+"€";
	}
	
}
