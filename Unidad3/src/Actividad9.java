
public class Actividad9 {

	public static void main(String[] args) {
		// Algoritmo para imprimir y comprobar numeros entre 0 y 100
		
		//Declaracion de variables
		int contPar=0, contImpar=0, contMultiplos=0;
		int sumarPares=0, sumarImpares=0, sumarMultiplos=0;
		
		//Numeros del 1 al 100
		for(int i=1;i<=100;i++) {
			
			//Verifica par
			if (i%2 == 0) {
				contPar++;
				sumarPares += i;}
			else {
				contImpar++;
				sumarImpares += i;}	
	
			//verificar multiplos de 4 y 7
	
			if (i %4 ==0 && i % 7 == 0) {
				contMultiplos++;
				sumarMultiplos += i;
				}
		}
		//Mostra resultados en pantalla
		System.out.println("Resultados:");
        System.out.println("Números pares: " + contPar + ", Suma de pares: " + sumarPares);
        System.out.println("Números impares: " + contImpar + ", Suma de impares: " + sumarImpares);
        System.out.println("Números múltiplos de 4 y 7: " + contMultiplos + 
        		", Suma de múltiplos de 4 y 7: " + sumarMultiplos);

	}
	
}
