import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	private Calculadora  calcular;
	private Calculadora calcularNegativo;
	private Calculadora calcularNegativo2;
	
	@BeforeEach
	//asignar valores para todos los casos de prueba
	void setUp() throws Exception {
		calcular = new Calculadora(10,5);
		calcularNegativo = new Calculadora(-10,5);
		calcularNegativo2 = new Calculadora(10,-5);
	}

	@Test
	void testSuma() {
		assertTrue(calcular.suma() == 15.0);//prueba a sumar valores psoitivos
		assertTrue(calcularNegativo.suma()==-5);//prueba sumar con el primer valor negativo
		assertTrue(calcularNegativo2.suma()==5);//prueba sumar con el segundo valor negativo
	}

	@Test
	void testResta() {
		assertTrue(calcular.resta() == 5.0);//prueba a restar valores psoitivos
		assertTrue(calcularNegativo.resta()==-15);//prueba restar con el primer valor negativo
		assertTrue(calcularNegativo2.resta()==15);//prueba restar con el segundo valor negativo
	}

	@Test
	void testMultiplica() {
		assertTrue(calcular.multiplica() == 50.0);//prueba multiplicar con el segundo valor negativo
		assertTrue(calcularNegativo.multiplica()==-50);//prueba multiplicar con el primer valor negativo
		assertTrue(calcularNegativo2.multiplica()==-50);//prueba multiplicar con el segundo valor negativo
	}

	@Test
	void testDivide() {
		assertTrue(calcular.divide() == 2.0);//prueba dividir con el segundo valor negativo
		assertTrue(calcularNegativo.divide()==-2);//prueba dividir con el primer valor negativo
		assertTrue(calcularNegativo2.divide()==-2);//prueba dividir con el segundo valor negativo
		
	}

}
