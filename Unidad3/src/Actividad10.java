
public class Actividad10 {

	public static void main(String[] args) {
		//Algoritmo para visualizar las tablas de multiplicar
		//Variables
		int i=0,x=0;
		int contador=0;
		
		//Construccion de las tablas
		for (i=1; i<=10; i++) {
			contador++;
			System.out.println("Tabla del "+contador );
			for (x=1; x<=10; x++) {
				int resultado = i*x;
				System.out.println(+i+" x "+x+" = "+resultado);
			}
				

		}

	}
}