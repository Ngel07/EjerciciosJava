package actividades_pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Actividad3Test {

	@Test
	final void Contador1else() {
		
		int x = -1;
		int y = -10;
		int ValorEsperado = -1;
		int ValorReal;
		
		Actividad3 instancia = new Actividad3();
		 
		ValorReal = instancia.Contador1(x,y);
		
		assertEquals(ValorEsperado, ValorReal);
		
	}


	@Test
	final void Contador1IfElse() {
	
		int x = -12;
		int y = 20;
		int ValorEsperado = 0 ;
		int ValorReal;
	
	Actividad3 instancia = new Actividad3();
	 
	ValorReal = instancia.Contador1(x, y);
	
	assertEquals(ValorEsperado, ValorReal);
	
}
	@Test
	final void Contador1PrimerIfSegundoif() {
	
		int x = 10;
		int y = 3;
		int ValorEsperado = 1 ;
		int ValorReal;
		
		
	
	Actividad3 instancia = new Actividad3();
	
	 
	ValorReal = instancia.Contador1(x, y);
	
	assertEquals(ValorEsperado, ValorReal);
	}
	
	

}
