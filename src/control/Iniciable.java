package control;

public interface Iniciable {
	/**
	 * Desordena el tablero.
	 */
	public void desordenarTablero(Carta[][] tablero);
	
	/**
	 * Crea el tablero según el número de parejas.
	 * @param parejas
	 */
	public void crearTablero(int parejas);
}
