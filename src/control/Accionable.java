package control;

public interface Accionable {
	/**
	 * Realiza la jugada. Implementa métodos de Jugable.
	 * 
	 * @param x
	 *            coordenada x.
	 * @param y
	 *            coordenada y.
	 * @throws InterruptedException
	 */
	public void realizarJugada(String[] coordenadas);

	/**
	 * Establece el valor de las variables de memoria a -1.
	 */
	public void borrarMemorias();

}
