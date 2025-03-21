import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		//metodo calcular la media armónica de 2 numeros
		double num1,num2;
		double resultado;
		
		Scanner leer = new Scanner(System.in);
		
		//recibir parametros por teclado
		do {
		System.out.println("Escribe el primer número: ");
		num1 = leer.nextDouble();
		
		System.out.println("Escribe el segundo número: ");
		num2 = leer.nextDouble();
		
		//evita valores no válidos
		if (num1==0||num2==0) {
			System.out.print("0 no es válido para calcular la media Armónica, ingresa otro valor");
			System.out.println();
			}
		} while(num1==0||num2==0);
		//llamada al metodo
		resultado=calcularMediaH(num1,num2);
		
		System.out.println(" La media armónica de:"+num1+ " y "+num2+" es: "+resultado);
		leer.close();
	}
	//calcular la media Armónica
	public static double calcularMediaH (double num1, double num2) {
		// calcular los inversos
		double inver1 = 1/num1;
		double inver2 = 1/num2;
		
		//Hallar la media 
		double mediaH =2/(inver1+inver2);
		return mediaH;
		}
}

	
