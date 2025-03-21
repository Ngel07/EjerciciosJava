package Actividad5;
public class Actividad5Punto {

	public static void main(String[] args) {
		// creacion de puntos
		Punto origen = new Punto(0, 0);
        Punto punto2 = new Punto(5, 3);
        Punto punto3 = new Punto(2, -1);
        double mitadX = (punto2.getX() + punto3.getX()) / 2;
        double mitadY = (punto2.getY() + punto3.getY()) / 2;
        Punto punto4 = new Punto(mitadX, mitadY);
        Punto punto5 = new Punto(4, 2);
        double distanciaA = punto5.calcularDistancia(origen);
        
        System.out.println("Coordenadas del origen: ");
        origen.visualizarCoordenadas();
        System.out.println("Coordenadas del quinto punto: ");
        punto5.visualizarCoordenadas();

       
        System.out.println("La distancia del punto (4, 2) al origen es: " + distanciaA);

	}

}
