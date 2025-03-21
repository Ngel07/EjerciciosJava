package Actividad13;

public class Elemento {
	private static int numero; 
    private static int contador = 0;
    
  //constructor
    public Elemento(int numero) {
        Elemento.numero = numero;
        contador++; 
    }
    public static int contarElementos() {
        return contador;
    }
    public int getNumero() {
        return numero; 
    }

}
