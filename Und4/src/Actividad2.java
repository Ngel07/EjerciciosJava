import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		// Algoritmo para valorar el mayor de 4 numeros

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
		System.out.println("Introduce el cuarto número");
		int num4 = leer.nextInt();
		
		//llamar al metodo
		n=calcularMax(num1,num2,num3,num4);
		
		System.out.println("El número mayor es "+n);
		
		leer.close();
	}
	
	
	//Aquí se definen los metodos
	public static int calcularMax(int num1,int num2,int num3,int num4) {
		int maximo;
		
		//calcular el maximo
		if (num1>num2) {
			maximo = num1;}
		else {maximo = num2;
		}
		if (maximo<num3) {
			maximo = num3;
		}
		if (maximo<num4) {
			maximo = num4;
		}
		return maximo;
	}
}