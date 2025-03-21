import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		// Algoritmo para calcular la potencia de un número real
		double potencia= 1;
				
		// Crear Scanner para leer entrada del usuario
        Scanner leer = new Scanner(System.in);
        
        
        System.out.print("Ingrese la base (a): ");
        double base = leer.nextDouble();
        
        System.out.print("Ingrese el exponente (b): ");
        int exponente = leer.nextInt();
        
        
        //Calcular las posibles potencias
        if (base == 0 && exponente == 0) {
            potencia = 1;
        } else if (base == 0 && exponente > 0) {
            potencia = 0;
        }else if (base == 0 && exponente < 0) {
            // No se puede elevar 0 a un exponente negativo (división por 0)
            System.out.println("Error: No se puede elevar 0 a un exponente negativo.");
        }else {
        	//exponente positivo
            if (exponente > 0) {
                for (int i = 0; i < exponente; i++) {
                potencia *= base;
                }
            } 
         // Si el exponente negativo, calculamos el inverso de la potencia
         else if (exponente < 0) {
        	 for (int i = 0; i < -exponente; i++) {
                    potencia *= base;
                }
                potencia = 1 / potencia;
            }
            
        } leer.close();

        // Mostrar el resultado
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + potencia);
        
       
    } 
		
}

