package control;

public class Accion implements Accionable {
	Juego juego;
	int memX = -1, memY = -1;
	int memoria = -1;
	int id = 0;

	public Accion(Juego juego) {
		super();
		this.juego = juego;
	}

	/**
	 * Gestiona la jugada.
	 */
	@Override
	public void realizarJugada(String[] coordenadas) {
		assert !coordenadas.toString().isEmpty() : "coordenada vacia";
		this.juego.incrementarJugada();
		int posX = Integer.parseInt(coordenadas[0]);
		int posY = Integer.parseInt(coordenadas[1]);
		this.juego.mostrarCarta(posX, posY);

		if (!this.juego.tablero.getCartas()[posX][posY].isEmparejada()) {
			if (this.memoria == -1) {
				this.memX = posX;
				this.memY = posY;
				this.memoria = this.juego.tablero.getCartas()[posX][posY].getId();
			} else {
				if (this.juego.compararCartas(this.memoria, this.juego.tablero.getCartas()[posX][posY].getId())
						&& !(this.memX == posX && this.memY == posY)) {
					this.juego.emparejarCartas(posX, posY, this.memX, this.memY);
				}
				borrarMemorias();
			}
		}
	}

	/**
	 * Oculta las cartas de todo el tablero.
	 */
	private void ocultarCartas() {
		for (int i = 0; i < this.juego.tablero.getCartas().length; i++) {
			for (int j = 0; j < this.juego.tablero.getCartas()[i].length; j++) {
				this.juego.ocultarCarta(i, j);
			}
		}
	}

	/**
	 * Establece los valores de las variables de memoria a -1.
	 */
	@Override
	public void borrarMemorias() {
		this.memoria = -1;
		this.memX = -1;
		this.memY = -1;
	}
}
