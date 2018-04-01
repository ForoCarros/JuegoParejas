package control;

public class Accion implements Accionable {

	/*
	 * ACLARACIONES DE LOS CAMBIOS: Juego juego es la clase que almacena el tablero
	 * y los métodos necesarios para jugar. He cambiado todo lo que tenías de
	 * Jugable (por ejemplo jugable.mostrarCarta() y esas cosas). Ahora es
	 * this.juego.loQueSea(). BorrarMemoria lo he cambiado a aquí porque aquí es
	 * donde se utiliza.
	 * 
	 * COSAS QUE A PRIORI CREO QUE NO SON NECESARIAS: las posiciones auxiliares,
	 * puesto que en el ParaUI se muestran o no las cartas en función de los valores
	 * de las propiedades.
	 */

	Juego juego;
	int memX = -1, memY = -1;
	int memoria = -1;
	int id = 0;

	public Accion(Juego juego) {
		super();
		this.juego = juego;
	}

	@Override
	public void realizarJugada(String[] coordenadas) {
		assert !coordenadas.toString().isEmpty() : "coordenada vacia";
		this.juego.incrementarJugada();
		int posX = Integer.parseInt(coordenadas[0]);
		int posY = Integer.parseInt(coordenadas[1]);
		this.juego.mostrarCarta(posX, posY);

		if (!this.juego.tablero.getCartas()[posX][posY].isEmparejada()) {
			if (this.memoria == -1) {
				System.out.println("Memoria -1");
				this.memX = posX;
				this.memY = posY;
				this.memoria = this.juego.tablero.getCartas()[posX][posY].getId();
			} else {
				System.out.println("Memoria:" + this.memoria);
				System.out.println(this.memoria + " " + this.memX + " " + this.memY + " " + posX + " " + posY);
				if (this.juego.compararCartas(this.memoria, this.juego.tablero.getCartas()[posX][posY].getId())
						&& !(this.memX == posX && this.memY == posY)) {
					System.out.println("Comparadas");
					this.juego.emparejarCartas(posX, posY, this.memX, this.memY);
				}
				borrarMemorias();
			}
		}
	}

	protected void ocultarCartas() {
		for (int i = 0; i < this.juego.tablero.getCartas().length; i++) {
			for (int j = 0; j < this.juego.tablero.getCartas()[i].length; j++) {
				this.juego.ocultarCarta(i, j);
			}
		}
	}

	@Override
	public void borrarMemorias() {
		this.memoria = -1;
		this.memX = -1;
		this.memY = -1;
	}
}
