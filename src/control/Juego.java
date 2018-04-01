package control;

import modelo.Tablero;

public class Juego implements Jugable {
	Tablero tablero;
	int jugada = 0;

	public Juego(Tablero tablero) {
		super();
		this.tablero = tablero;
	}

	@Override
	public void mostrarCarta(int x, int y) {
		this.tablero.getCartas()[x][y].setVelada(false);

	}

	@Override
	public void ocultarCarta(int x, int y) {
		this.tablero.getCartas()[x][y].setVelada(true);

	}

	@Override
	public boolean compararCartas(int id1, int id2) {
		return id1 == id2;
	}

	@Override
	public void emparejarCartas(int x1, int y1, int x2, int y2) {
		this.tablero.getCartas()[x1][y1].setEmparejada(true);
		this.tablero.getCartas()[x2][y2].setEmparejada(true);

	}

	@Override
	public void incrementarJugada() {
		this.jugada++;
	}
}
