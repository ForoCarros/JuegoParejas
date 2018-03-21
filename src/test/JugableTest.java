package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import control.Jugable;

class JugableTest {
	Jugable instancia;
	Carta tablero[][] = new Carta[2][2];

	@Before
	void crearTablero() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				this.tablero[i][j] = new Carta();
			}
		}
	}

	@Test
	void testMostrarCarta() {
		this.instancia = new;
		this.instancia.ocultarCarta(1, 1);
		assertEquals(this.tablero[1][1].oculta, false);
	}

	@Test
	void testOcultarCarta() {
		this.instancia = new;
		this.instancia.ocultarCarta(1, 1);
		assertEquals(this.tablero[1][1].oculta, true);
	}

	@Test
	void testCompararCartas() {
		this.instancia = new;
		assertTrue(this.instancia.compararCartas(this.tablero[0][0], this.tablero[1][0]));
	}

	@Test
	void testBorrarMemoria() {
		this.instancia = new;
		this.instancia.borrarMemoria();
		assertEquals(this.instancia.memoria, -1);
	}

}
