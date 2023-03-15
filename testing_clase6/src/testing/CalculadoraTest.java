package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void ejercicio1Test() {
		assertEquals(Calculadora.multiplicar(80,3), 240);
	}
	
	@Test
	void ejercicio2Test() {
		assertEquals(Calculadora.dividir(Calculadora.sumar(150, 180), 3), 110);
	}
	
	@Test
	void ejercicio3Test() {
		assertFalse(Calculadora.multiplicar(Calculadora.restar(90, 50), 15) == 605 );
	}
	
	@Test
	void ejercicio4Test() {
		assertFalse(Calculadora.multiplicar(Calculadora.sumar(70, 40), 25) == 2700);
	}

}
