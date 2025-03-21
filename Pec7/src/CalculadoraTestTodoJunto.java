import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTestTodoJunto {
	private Calculadora  calcular;
	private Calculadora calcularNegativo;
	private Calculadora calcularNegativo2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		calcular = new Calculadora(8,2);
		calcularNegativo = new Calculadora(-8,2);
		calcularNegativo2 = new Calculadora(8,-2);
	}

	@Test
	void testTodoJunto() {
		assertTrue(calcular.suma() == 10.0);
		assertTrue(calcularNegativo.suma()==-6);
		assertTrue(calcularNegativo2.suma()==6);
		
		assertTrue(calcular.resta() == 6.0);
		assertTrue(calcularNegativo.resta()==-10);
		assertTrue(calcularNegativo2.resta()==10);
		
		assertTrue(calcular.multiplica() == 16.0);
		assertTrue(calcularNegativo.multiplica()==-16.0);
		assertTrue(calcularNegativo2.multiplica()==-16.0);
		
		assertTrue(calcular.divide() == 4.0);
		assertTrue(calcularNegativo.divide()==-4);
		assertTrue(calcularNegativo2.divide()==-4);
	}

}
