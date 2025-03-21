import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		//algoritmo para calcular número combinatorio
		Scanner leer = new Scanner(System.in);
		
		//solicitud de valores 
		System.out.print("Ingresa el número valor de m: ");
		int m = leer.nextInt();
		
		System.out.print("Ingresa el número valor de n: ");
		int n = leer.nextInt();

		long resultado = combinatorio(m,n);
		
		System.out.print("El valor de " +m+ " sobre "+n+" es: "+resultado);
		
		leer.close();
	}
	//métod para calcular el combinatorio
	public static long combinatorio(int m, int n) {
		if (n>m) {
			return 0;
		}
		return factorial(m)/(factorial(n)* factorial(m - n));
	}
	//calcular el factorial necesario para el cálculo del combinatorio
	public static long factorial (int num) {
		long resultado = 1;
		for(int i =1; i<=num;i++) {
			resultado *= i;
		}
		return resultado;
	}

}
