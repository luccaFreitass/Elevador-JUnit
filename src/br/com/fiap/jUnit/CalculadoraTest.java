package br.com.fiap.jUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.fiap.model.Calculadora;

class CalculadoraTest {

	@Test
	void testSomar2double() {

		double n1 = 2.0;
		double n2 = 2.0;

		Calculadora calculadora = new Calculadora();

		assertEquals(4, calculadora.somar(n1, n2), 0.0);

	}

	@Test
	void testSubtrair2double() {

		double n1 = 5.0;
		double n2 = 2.0;

		Calculadora calculadora = new Calculadora();

		assertEquals(3, calculadora.subtrair(n1, n2), 0.0);

	}

}
