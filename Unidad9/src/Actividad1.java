import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		pedirNumeros();
		
	}
	
	public static void pedirNumeros() {
				
		Scanner leer = new Scanner(System.in);
		String numerosIngresados = "";
		
		try {
			while(true) {
				System.out.println("Ingresa números entre el 1 y el 5: ");
				int numero = (leer.nextInt());
					if(numero>=1 && numero<=5) {
						numerosIngresados += numero;
						
					}else {System.out.println("El número está fuera del rango");
						
						}
			}
		}catch (InputMismatchException e) {
			System.out.println("El valor introducido no es válido, \nIngresa un número entre el 1 y el 5: ");
		}
		finally {
			System.out.println("\n Los números ingresados anteriormente son:"+numerosIngresados);
			leer.close();
		}
		
	}
	
}



