package control;

import modelo.Tablero;

public class Juego implements Jugable{
	Tablero tablero;

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
}
