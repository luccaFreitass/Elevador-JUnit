package br.com.fiap.jUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.fiap.model.Elevador;

class ElevadorTest {

	@Test
	void testEntrarNoElevador() {

		Elevador elevador = new Elevador(200.0, 100.0, false);

		assertEquals(180.0, elevador.entrarNoElevador(80.0), 0);
	}

	@Test
	void testSairDoElevador() {

		Elevador elevador = new Elevador(200.0, 180.0, false);

		assertEquals(100.0, elevador.sairDoElevador(80.0), 0);
	}

	@Test
	void testAvaliarPesoAlermeON() {

		Elevador elevador = new Elevador(200.0, 300.0, false);

		assertEquals(true, elevador.avaliarpeso());
	}

	@Test
	void testAvaliarPesoAlermeOFF() {

		Elevador elevador = new Elevador(200.0, 180.0, false);

		assertEquals(false, elevador.avaliarpeso());
	}

}
