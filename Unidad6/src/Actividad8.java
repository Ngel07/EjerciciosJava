
public class Actividad8 {

	public static void main(String[] args) {
		int[][] matrizB = new int[7][5];
		
		
		int valor = 1;
		
		for(int i = 0; i< matrizB.length; i++) {
			for(int j = 0; j< matrizB[i].length; j++) {
				matrizB[i][j] = valor++;
			}
		}
		System.out.println("Matriz completa:");
		mostrarMatriz(matrizB);
		
		//Matriz 7x7
		int[][] matrizC = new int[7][7]; 
		
		//Coopinado matrizA en matrizB

		for(int i = 0; i< matrizB.length; i++) {
			for(int j = 0; j< matrizB[i].length; j++) {
				matrizC[i][j] = matrizB[i][j];
			}
		}
		
		//Calcular las nuevas columnas 6 y 7
		for(int i = 0; i< matrizB.length; i++) {
			int suma = 0;
			for(int j = 0; j< 5; j++) {
				suma += matrizC[i][j];
			}
			matrizC[i][5] = suma;
			matrizC[i][6] = suma/5;
		}
		System.out.println("Matriz transformada: ");
		mostrarMatriz(matrizC);
		 
	}
	 public static void mostrarMatriz(int[][] matrizB) {
			for(int i = 0; i< matrizB.length; i++) {
				for(int j = 0; j< matrizB[i].length; j++) {
					System.out.print(matrizB[i][j] + "\t");
				}
				System.out.println();
			}
	 }
}
