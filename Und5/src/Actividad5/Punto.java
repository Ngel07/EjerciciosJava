package Actividad5;

public class Punto {
	//Atributos
	private double x,y;
	
	//Constructor
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	//metodos
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double calcularDistancia(Punto nPunto) {
		double diferenciaX = nPunto.getX() - this.x;
		double diferenciaY = nPunto.getY() - this.y;
		
		return Math.sqrt(diferenciaX*diferenciaX+diferenciaY*diferenciaY);
	}
	public void visualizarCoordenadas() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
