package actividades_pruebas;


public class Actividad1 {
	
	public  static float visualizarMedia(float x, float y) {
		float resultado = 0;
		 if (x<0 || y<0 )
			 
			 System.out.println("X y Y deben ser positivos");
		 
		 else {
			 resultado =(x + y )/2;
			 System.out.println("La media es: "+resultado);
		 }return resultado;
		 
	} 

}