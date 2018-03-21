package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import control.Iniciable;

class IniciableTest {
	//Se necesita la clase Carta.
	Iniciable instancia;
	Carta tablero[][] = new Carta[2][2];
	Carta tableroDos[][] = new Carta[2][2];

	@Before
	void crearTablero() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				this.tablero[i][j] = new Carta();
				this.tableroDos[i][j] = new Carta();
			}
		}
	}

	@Test
	void testDesordenarTablero() {
		this.instancia = new;
		this.instancia.desordenarTablero(this.tablero);
		assertNotEquals(tablero, tableroDos);
	}

	@Test
	void testCrearTablero() {
		this.instancia = new;
		assertNotEquals(this.tablero, null);
	}

}
