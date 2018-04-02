package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import modelo.Tablero;

class IniciableTest {
	
	@Test
	void testCrearTablero() {
		Tablero tablero = new Tablero(4);
		assertNotNull(tablero);
	}

	//Funciona, pero el assert no me da el resultado correcto.
	@Test
	void testDesordenarTablero() {
		Tablero tablero = new Tablero(4);
		Tablero tableroDos = tablero;
		System.out.println(tablero.getCartas()[0][0].getId());
		tableroDos.desordenarTablero();
		System.out.println(tableroDos.getCartas()[0][0].getId());
		assertNotEquals(tablero.getCartas()[0][0].getId(), tableroDos.getCartas()[0][0].getId());
	}
}