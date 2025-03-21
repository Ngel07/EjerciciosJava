package Actividad14;

public class Item {
	String nombre;
	int generarId;
	static int contarId ;
	
	// constructores
	public Item(String nombre) {
        this.nombre = nombre;
        contarId++;
        this.generarId = contarId;
	}
	//getters
	public int getgenerarId() {
        return generarId;
	}
	public String getNombre() {
        return nombre;
	}
}
