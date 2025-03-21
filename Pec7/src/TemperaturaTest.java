import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemperaturaTest {
	private Temperatura convertirFarenheit;
	private Temperatura convertirCelsius;

	@BeforeEach
	void setUp() throws Exception {
		convertirCelsius = new Temperatura();
		convertirFarenheit = new Temperatura();
	}

	@Test
	void testCelsiusToFarenheit() {
		assertTrue(convertirCelsius.CelsiusToFarenheit(-5) == 23.0 );
	}
	
	@Test
	void testCelsiusToFarenheit2() {
		assertTrue(convertirCelsius.CelsiusToFarenheit(0) == 32.0 );
	}
	
	@Test
	void testCelsiusToFarenheit3() {
		assertTrue(convertirCelsius.CelsiusToFarenheit(15) == 59.0 );
	}
	
	@Test
	void testCelsiusToFarenheit4() {
		assertTrue(convertirCelsius.CelsiusToFarenheit(32) == 89.6 );
	}

	@Test
	void testFarenheitToCelsius() {
		assertTrue(convertirFarenheit.FarenheitToCelsius(-5) == -21.0);
	}
	

	@Test
	void testFarenheitToCelsius2() {
		assertTrue(convertirFarenheit.FarenheitToCelsius(0) == -18.0);
	}
	
	@Test
	void testFarenheitToCelsius3() {
		assertTrue(convertirFarenheit.FarenheitToCelsius(15) == -9.0);
	}
	
	@Test
	void testFarenheitToCelsius4() {
		assertTrue(convertirFarenheit.FarenheitToCelsius(32) == 0.0);
	}
}
