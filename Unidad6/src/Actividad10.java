import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int N;
		
		System.out.print("Ingrese el valor del orden del cuadrado latino(tamaño): ");
		N =  leer.nextInt();
		
		
		int [][] cuadradoLatino = formarCuadradoLatino(N);
		mostrarCuadradoLatino(cuadradoLatino);
		
		leer.close();
	}
	
	public static int[][] formarCuadradoLatino(int N) {
		int [][] cuadradoLatino = new int[N][N];
		
		for (int j = 0; j < N; j++) {
			cuadradoLatino[0][j] = j+1;
		}
		
		for (int i = 1; i<N; i++) {
			for(int j = 0; j < N; j++) {
				if (j == 0) {
					cuadradoLatino[i][j] = cuadradoLatino[i-1][N-1];
				}else {
					cuadradoLatino[i][j] = cuadradoLatino[i-1][j-1];
				}
			}
		}
		
		return cuadradoLatino;
	}

	public static void mostrarCuadradoLatino(int[][] cuadradoLatino) {
		int N = cuadradoLatino.length;
		
		System.out.println("El cuadrado Latino de orden: "+N+" es:");
			for (int i=0; i<N; i++) {
				for (int j=0; j<N; j++) {
					System.out.print(cuadradoLatino[i][j] + " ");
				}
				 System.out.println();
			}
	}
}
