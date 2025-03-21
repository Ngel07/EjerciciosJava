import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		//Algoritmo para calcular cambio en monedas
		
		// Declaración de variables
		int valor =0, 
			mon2=0, 
			mon1=0;
		int centimos=0,
			cent50=0, 
			cent20=0, 
			cent10=0, 
			cent5=0,
			cent2=0, 
			cent1=0;
		
			
		Scanner leer = new Scanner(System.in);	
			
		//Solicitar la cantidad al usuario
			
		System.out.println("Ingrese la cantidad de euros:  ");
		valor = leer.nextInt();
		System.out.println("Ingrese la cantidad de centimos:  ");
		centimos = leer.nextInt();
		
		//Calcular 
		mon2=valor/2;
		mon1=valor%2;
		cent50=centimos/50;
		cent20=centimos%50/20; 
		cent10=centimos%50%20/10; 
		cent5=centimos%50%20%10/5;
		cent2=centimos%50%20%10%5/2;
		cent1=centimos%50%20%10%5%2;
		
		//Resultados 
		System.out.println("Monedas de 2 euros: "+mon2);
		System.out.println("Monedas de 1 euros: "+mon1);
		System.out.println("Monedas de 50 centimos: "+cent50);
		System.out.println("Monedas de 20 centimos: "+cent20);
		System.out.println("Monedas de 10 centimos: "+cent10);
		System.out.println("Monedas de 5 centimos: "+cent5);
		System.out.println("Monedas de 2 centimos: "+cent2);
		System.out.println("Monedas de 1 centimos: "+cent1);
		
		//cerrar el scanner
		leer.close();
	}

}
