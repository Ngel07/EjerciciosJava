import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un número para factorizar: ");
        int numero = leer.nextInt();
        int divisor = 2;  
        
        //Muestra los resultados  
        System.out.print("La factorización prima de " + numero + " es: ");
        
        // Inicia factorizacion
        
        while (numero > 1) {
            
            if (numero % divisor == 0) {
                System.out.print(divisor + " ");  
                numero /= divisor;                
            } else {
                divisor++;  // Si no divide, probamos con el siguiente número y sucesivamente
           }
        }
		        
		leer.close();
	}
		
}
