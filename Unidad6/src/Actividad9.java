
public class Actividad9 {

	public static void main(String[] args) {
		//crear los vectores
		int[] vectorV = crearVector(50);
		int[] vectorP = crearVector(20);
		
		int[][] matrizM = generarMatriz(vectorV, vectorP);
		
		System.out.print("\nVector V: ");
		imprimirVector(vectorV);
		System.out.print("\nVector P: ");
		imprimirVector(vectorP);
		System.out.print("\nMatriz M: ");
		imprimirMatriz(matrizM);
		
	}

	
	//método para rellenar los vectores 
	public static int[] crearVector(int tamaño) {
		int[] vector = new int[tamaño];
		for(int i = 0; i< tamaño; i++) {
			vector[i] = i+1;
		}return vector;
				
	}//método para contruir la matriz a partir de los vectores
	public static int[][] generarMatriz(int[] vectorV, int[] vectorP) {
		int filas = vectorV.length;
		int columnas = vectorP.length;
		
		int[][] matrizM = new int[filas][columnas];
		
		for (int i = 0; i< filas; i++) {
			for (int j = 0; j<columnas;j++) {
				matrizM [i][j] = vectorV[i] * vectorP[j];
			}
		}return matrizM;
	}
	public static void imprimirVector(int[] vector) {
		for(int i = 0; i<vector.length;i++) {
			System.out.print(vector[i] + " ");
		}
		System.out.println();
	}
	
	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i<matriz.length; i++) {
			for (int j = 0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+ "\t");
			}
			System.out.println();
		}
	}

}