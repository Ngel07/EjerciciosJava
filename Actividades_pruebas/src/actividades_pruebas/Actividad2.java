package actividades_pruebas;

public class Actividad2 {
	
	int numHombres = 0;
	int numMujeres = 0;

	public int name (boolean curso, String sexo, boolean RedAlumnos) {
		
		int resultado = 0;
		
		while(RedAlumnos) {
			resultado = 1;
			
			while(curso == true) {
				resultado = 2; 
				
				if(sexo.equals("H"))
					numHombres++;
				else
					numMujeres++;
			}
		}return resultado; 
	}
}
 