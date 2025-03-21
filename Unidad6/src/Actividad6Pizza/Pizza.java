package Actividad6Pizza;

public class Pizza {
	private Masa masa;
	private Ingrediente[] ingredientes;
	private int numIngredientes;
	
	//Constructor de pizza
	public Pizza() {
		this.ingredientes = new Ingrediente[5];
		this.numIngredientes = 0;
	}
	//método para asignar masa
	public void setMasa(Masa masa){
		this.masa = masa;
	};
	//Método para obtener la masa
	public Masa getMasa() {
		return this.masa;
	}
	//Método para agregar un ingrediente
	public void addIngrediente(Ingrediente ingrediente) {
		if (numIngredientes<5) {
			ingredientes[numIngredientes] = ingrediente;
			numIngredientes++;
		}else {
			System.out.println("No se pueden agregar más de 5 ingredientes");
		}
	}
	
	//Metodo para obtener los ingredientes
	public String[] getIngredientes() {
		String[] nombresIngredientes = new String[numIngredientes];
		for (int i = 0; i<numIngredientes; i++) {
			nombresIngredientes[i] = ingredientes[i].getNombre();
		}
		return nombresIngredientes;
	}
	
	//Método para obtener número de ingredientes
	public int getNumIngredientes() {
		return this.numIngredientes;
	}
	
	//Método para calcular el precio
	public int calcularPrecio() {
		int precioTotal = 0;
		
		if(masa != null) {
			precioTotal += masa.getPrecio();
		}
		for (int i = 0; i< numIngredientes;i++) {
			precioTotal += ingredientes[i].getPrecio();
		}
		return precioTotal;
	}
}
	class Masa{
		private String nombre;
		private double precio;
	
		public Masa(String nombre, double precio) {
			this.nombre = nombre;
			this.precio = precio;
			}
	
	public String getNombre(){
		return nombre;
	}
	
	public double getPrecio(){
		return precio;
	}
	
}
class Ingrediente {
	private String nombre;
	private double precio;
	
	public Ingrediente(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public double getPrecio(){
		return precio;
	}
}


