package control;

public interface Accionable {
	/**
	 * Muestra la carta en la posición.
	 * 
	 * @param x
	 *            posición x.
	 * @param y
	 *            posición y.
	 */
	public void mostrarCarta(int x, int y);

	/**
	 * Oculta la carta en la posición.
	 * 
	 * @param x
	 *            posición x.
	 * @param y
	 *            posición y.
	 */
	public void ocultarCarta(int x, int y);

	/**
	 * Compara dos cartas.
	 * @param id1
	 * @param id2
	 * @return true si son iguales.
	 */
	public boolean compararCartas(int id1, int id2);
	
	/**
	 * Elimina la id almacenada.
	 */
	public void borrarMemoria();
}
