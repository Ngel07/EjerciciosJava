
public class Calculadora {

    private double numero1;
    private double numero2;

    // Constructor
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método para sumar
    public double suma() {
        return numero1 + numero2;
    }

    // Método para restar
    public double resta() {
        return numero1 - numero2;
    }

    // Método para multiplicar
    public double multiplica() {
        return numero1 * numero2;
    }

    // Método para dividir
    public double divide() {
        return numero1 / numero2;
    }
}