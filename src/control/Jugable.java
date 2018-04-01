package control;

public interface Jugable {
	/**
	 * Cambia el estado oculta de la carta a false.
	 * 
	 * @param x
	 *            posición x.
	 * @param y
	 *            posición y.
	 */
	public void mostrarCarta(int x, int y);

	/**
	 * Cambia el estado oculta de la carta a true.
	 * 
	 * @param x
	 *            posición x.
	 * @param y
	 *            posición y.
	 */
	public void ocultarCarta(int x, int y);

	/**
	 * Compara los id de dos cartas.
	 * @param id1
	 * @param id2
	 * @return true si son iguales.
	 */
	public boolean compararCartas(int id1, int id2);
	
	/**
	 * Cambia el emparejadas a true.
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	public void emparejarCartas(int x1, int y1, int x2, int y2);
	
	public void incrementarJugada();
}
