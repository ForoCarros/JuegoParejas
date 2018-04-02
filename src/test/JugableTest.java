package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import control.Juego;
import control.Jugable;
import modelo.Carta;
import modelo.Tablero;

class JugableTest {

	Tablero tablero=new Tablero(2);
	Juego juego = new Juego(tablero);

	@Test
	void testMostrarCarta() {
		this.tablero.crearTablero(2);
		this.juego.mostrarCarta(0, 0);
		assertFalse(this.tablero.getCartas()[0][0].isVelada());
	}

	@Ignore
	void testOcultarCarta() {
		this.tablero.crearTablero(2);
		this.juego.ocultarCarta(1, 1);
		assertTrue(this.tablero.getCartas()[1][1].isVelada());
		
	}

	@Ignore
	void testCompararCartas() {
		Juego juego = new Juego(null);
		Carta cartaUno = new Carta(1);
		cartaUno.setVelada(true);
		Carta cartaDos = new Carta(1);
		cartaDos.setVelada(true);
		Carta cartaTres = new Carta(2);
		cartaTres.setVelada(true);
		
		assertTrue(juego.compararCartas(cartaUno.getId(), cartaDos.getId()));
		assertFalse(juego.compararCartas(cartaDos.getId(), cartaTres.getId()));
	}
	
	@Test
	void testEmparejarCartas() {
		this.juego.emparejarCartas(0, 0, 1, 1);
		assertTrue(this.tablero.getCartas()[0][0].isEmparejada());
	}
	
	@Test
	void comprobarGanador() {
		for (int i = 0; i < this.tablero.getCartas().length; i++) {
			for (int j = 0; j < this.tablero.getCartas()[i].length; j++) {
				this.juego.emparejarCartas(i, j, i, j);
			}
		}
		assertEquals(this.juego.comprobarGanador(), true);
	}

}
