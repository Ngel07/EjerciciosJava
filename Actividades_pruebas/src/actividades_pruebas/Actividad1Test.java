package actividades_pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Actividad1Test {

	@Test
	final void testVisualizarMediaelse() {
		float x = 6;
		float y = 3;
		float valorEsperado = 4.5f;
		float valorReal;
				
		Actividad1 instancia = new Actividad1();
		
		valorReal = instancia.visualizarMedia(x,y); 
		
		assertEquals(valorEsperado, valorReal);
		
	}
	
		
	@Test
	final void testVisualizarMediaif() {
		float x = -6;
		float y = 3;
		float resultado;
		boolean camino = false;
				
		if (x<0 || y<0 ) {
			 
			 System.out.println("X y Y deben ser positivos");
		camino = true;
		}
		 
		 else {
			 resultado =(x + y )/2;
			 System.out.println("La media es: "+resultado);
		 }
		assertTrue(camino);
	}

}