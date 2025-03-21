
public class Actividad7 {

	public static void main(String[] args) {
		// Algoritmo para imprimir los números impares de 1 a 99 y contarlos
		
		//Declaración de variables
		int i=1;
		int p=2;
		int m=5;
		int cont=0;
		int contp=0;
		int contm=0;
		
		//mensaje en pantalla para el usuario
		System.out.println("Estos son los números impares entre 1 y 99: ");
		
		//primer ciclo que cuenta los impares
		while (i<100) {
		
			System.out.print(i+" ");
			i+=2;
			cont++;
			
		};System.out.println("\nson en total "+cont+" números impares entre 1 y 99 ");
		
		System.out.println("\nEstos son los números pares entre 1 y 99: ");
		
		
		//segundo ciclo para contar los pares
		while (p<99) {
			
			System.out.print(p+" ");
			p+=2;
			contp++;
			
		};System.out.println("\nson en total "+contp+" números pares entre 1 y 99 ");
		
		
		System.out.println("\nEstos son los números multiplos de 5 entre 1 y 99: ");
		
		//Tercer ciclo para contar los mjultiplos de 5
		while (m<99) {
			
			System.out.print(m+" ");
			m+=5;
			contm++;
			
		};System.out.println("\nson en total "+contm+" números multiplos de 5 entre 1 y 99");
		
		
	}

}
