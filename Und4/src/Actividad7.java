import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		//Algoritmo para calculas el factorial
		
		// variables
		int num;
		int resultado;
		
		Scanner leer = new Scanner(System.in);
		
		//Solicitud de valores
		System.out.println("Vamos a calcular el factorial");
		System.out.print("Ingresa un número: ");
		num = leer.nextInt();
		
		//llamar al método
		resultado=calcularFactorial(num);
		leer.close();
		
		//imprimir el resultado
		System.out.print(" = "+resultado);
	}
	//calcular el factorial
	public static int calcularFactorial (int num) {
		//variables locales
		int factorial=1;
		
		//aplicación d ela fórmula
		System.out.print("Su factorial es:\n"+num+"! = ");
		for(int i=num;i>0;i--) {
			factorial = factorial*i;
			System.out.print(i);
			if (i>1) {
			System.out.print(" * ");}
		}return factorial; 
	}
}

