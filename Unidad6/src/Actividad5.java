import java.util.Scanner;


public class Actividad5 {

	public static void main(String[] args) {
		//
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Introduce el tamaño del array: ");
        int size = leer.nextInt();
        
        int[] arrayNumeros = new int[size];
        System.out.println("Introduce " + size + " números:");
        
        for (int i = 0; i < size; i++) {
            System.out.print("Número en posición " + i + ": ");
            arrayNumeros[i] = leer.nextInt();
        }
        leer.close();
        
        MyArray myArray = new MyArray(arrayNumeros);
        myArray.visualizarArray();
        myArray.visualizarContPar();
        myArray.visualizarContImpar();

	}

}
