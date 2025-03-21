import java.util.Scanner;

public class MyArray {
	private int[] numeros;

	//Constructor
	public MyArray(int[] numeros) {
		this.numeros=numeros;
	}

public void visualizarArray() {
	
	System.out.println("El nuevo array es: ");
    for (int i = 0; i < numeros.length; i++) {
        System.out.print(numeros[i] + " ");
    }
    System.out.println();
}

public void visualizarContPar() {
	
	System.out.println("Los valores pares son: ");
	for (int i = 0; i < numeros.length; i++) {
		if(numeros[i]%2==0)
		System.out.println("Posición: " + i + ", Contenido: "+numeros[i] + " ");
		
    }
	
}
public void visualizarContImpar() {
	System.out.println("Los valores impares son: ");
	for (int i = 0; i < numeros.length; i++) {
		if(numeros[i]%2!=0)
		System.out.println("Posición: " + i + ", Contenido: "+ numeros[i]);
		}
	}
}


