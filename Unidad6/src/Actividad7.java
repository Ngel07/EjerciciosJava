
public class Actividad7 {

	public static void main(String[] args) {
		//declarar la matriz
		int[][] matrizA = new int[5][7];
		
		
		int valor = 1;
		
		for(int i = 0; i< matrizA.length; i++) {
			for(int j = 0; j< matrizA[i].length; j++) {
				matrizA[i][j] = valor++;
			}
		}
		
		//Visulizar la matriz completa
		 System.out.println("Matriz completa:");
		 mostrarMatriz(matrizA);
		 
		 //Visualizar fila quinta
		 System.out.println("\nQuinta fila:");
		 for(int j = 0; j<matrizA[4].length; j++) {
			 System.out.print(matrizA[4][j]+" ");
		 }
		 System.out.println();
		 
		 int elementoF4C3 = matrizA[3][2];
		 int elementoF5C3 = matrizA[4][2];
		 
		 matrizA[3][2] = elementoF5C3;
		 matrizA[4][2] = elementoF4C3; 
		 
		 System.out.println("Matriz intercambiando las posiciones de Row 4 Col 3 por Row 5 Col 3: ");
		 mostrarMatriz(matrizA);
		 
		 System.out.println("\nPrimera y cuarta columna:");
		 for(int i = 0; i<matrizA.length; i++) {
			 System.out.print(matrizA[i][0]+"\t"+matrizA[i][3]+"  \n");
		 }
		 
		 //intercambio de columnas
		 for(int i = 0; i<matrizA.length; i++) {
			 int mTemp = matrizA[i][0];
			 matrizA[i][0] = matrizA[i][3];
			 matrizA[i][3] = mTemp;
		 }
		 System.out.println("Matriz con las columnas intercambiadas: ");
		 mostrarMatriz(matrizA);
}
	 public static void mostrarMatriz(int[][] matrizA) {
		for(int i = 0; i< matrizA.length; i++) {
			for(int j = 0; j< matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
