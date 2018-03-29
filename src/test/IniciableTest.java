package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import control.Iniciable;
import modelo.Carta;
import modelo.Tablero;

class IniciableTest {
	Iniciable instancia;
	Tablero tablero;
	Tablero auxiliar;

	@Test
	void testCrearTablero() {
		this.tablero = new Tablero(3);
		assertNotEquals(this.instancia, null);
	}

	@Test
	void testDesordenarTablero() {
		this.instancia = new Tablero(3);
		this.tablero = (Tablero) this.instancia;
		this.auxiliar = this.instancia.desordenarTablero();
		this.tablero.desordenarTablero(this.tablero);
		assertNotEquals(this.instancia, this.auxiliar);
	}
}