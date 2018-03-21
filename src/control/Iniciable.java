package control;

import modelo.Carta;

public interface Iniciable {
	/**
	 * Desordena el tablero.
	 */
	public void desordenarTablero(Carta[][] tablero);
	
	/**
	 * Crea el tablero según el número de parejas.
	 * @param parejas número de parejas.
	 */
	public void crearTablero(int dimensiones);
}
