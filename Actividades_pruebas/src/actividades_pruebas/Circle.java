
/**
* @author Luz A
* @version 1.0
* @since 22/05/2024
* @param La clase Circle representa un círculo con un radio dado.
* Proporciona métodos para calcular el área y el perímetro del círculo.
*/


package actividades_pruebas;

	public class Circle {

		/**
	     * El radio del círculo.
	     */
	    private double radius;

	    /**
	     * Constructor para crear un círculo con un radio específico.
	     *
	     * @param radius El radio del círculo.
	     */
	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    /**
	     * Obtiene el radio del círculo.
	     *
	     * @return El radio del círculo.
	     */
	    public double getRadius() {
	        return radius;
	    }

	    /**
	     * Establece el radio del círculo.
	     *
	     * @param radius El nuevo radio del círculo.
	     */
	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    /**
	     * Calcula el área del círculo.
	     *
	     * @return El área del círculo.
	     */
	    public double calculateArea() {
	        return Math.PI * radius * radius;
	    }

	    /**
	     * Calcula el perímetro (circunferencia) del círculo.
	     *
	     * @return El perímetro del círculo.
	     */
	    public double calculatePerimeter() {
	        return 2 * Math.PI * radius;
	    }

	    /**
	     * Proporciona una representación en forma de cadena del círculo.
	     *
	     * @return Una cadena que representa el círculo.
	     */
	    @Override
	    public String toString() {
	        return "Circle [radius=" + radius + "]";
	    }

	    /**
	     * Método principal para probar la clase Circle.
	     *
	     * @param args Los argumentos de la línea de comandos.
	     */
	    public static void main(String[] args) {
	        Circle circle = new Circle(5.0);
	        System.out.println("Radio: " + circle.getRadius());
	        System.out.println("Area: " + circle.calculateArea());
	        System.out.println("Perímetro: " + circle.calculatePerimeter());
	    }
	}

	




