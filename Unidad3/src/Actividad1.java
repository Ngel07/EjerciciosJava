import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		// Código para clasificar calificaciones
		
		// Declaración de variables
		double nota=0;
		
	
			//Solicitar la nota al usuario
		System.out.println("Ingrese una nota entre cero y diez:  ");
			Scanner leer = new Scanner(System.in);
			nota = leer.nextDouble();
			
		// Evaluación de valores
		if (nota <0 || nota>10) {
			System.out.println ("NOTA NO VÁLIDA");}
		
		else if (nota <3) { 
			System.out.println ("MUY DEFICIENTE");}
			
			else if (nota < 5) { 
			System.out.println ("INSUFICIENTE");}
			
			else if (nota < 6) {
				System.out.println ("SUFICIENTE");}
			
			else if (nota < 7) {
				System.out.println ("BIEN");}
				
			else if (nota < 9) {
				System.out.println ("NOTABLE");}
			
			else {
				System.out.println ("EXCELENTE");}
			
				
		
		//cerrar el scanner
		leer.close();

	}
	
}
