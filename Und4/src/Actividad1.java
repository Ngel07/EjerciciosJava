import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		// Algoritmo para valorar el mayor de 3 numeros

		//Declarar variables
		int n;
		
		Scanner leer = new Scanner(System.in);
		
		//Pedir datos
		System.out.println("Introduce el primer número");
		int num1 = leer.nextInt();
		System.out.println("Introduce el segundo número");
		int num2 = leer.nextInt();
		System.out.println("Introduce el tercer número");
		int num3 = leer.nextInt();
		
		//llamo al metodo
		n=calcularMax(num1,num2,num3);
		
		System.out.println("El número mayor es "+n);
		
		leer.close();
	}
	
	
	//Aquí se definen los metodos
	public static int calcularMax(int num1,int num2,int num3) {
		int maximo;
		
		//calcular el maximo
		if (num1>num2) {
			maximo = num1;}
		else {maximo = num2;
		}
		if (maximo<num3) {
			maximo = num3;
		}
		return maximo;
	}
}
