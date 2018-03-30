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
	int posXAux, posYAux;
	int memoria = 0;
	int id = 0;

	public Accion(Juego juego) {
		super();
		this.juego = juego;
	}

	@Override
	public void realizarJugada(String[] coordenadas) {
		assert coordenadas.toString().isEmpty() : "coordenada vacia";
		int posX = Integer.parseInt(coordenadas[0]);
		int posY = Integer.parseInt(coordenadas[1]);
		this.juego.mostrarCarta(posX, posY);

		if (memoria > -1) {
			// Aqui comparamos las dos ids, pero como la traigo¿?¿?¿?
			if (this.juego.compararCartas(id, id)) {
				// encontrada=true; y entonces solo es poner las dos cartas desveladas y fuera
			} else {
				this.juego.ocultarCarta(posX, posY);
				this.juego.ocultarCarta(posXAux, posYAux);
				this.borrarMemoria();
			}
		} else {
			this.memoria = id;
			this.posXAux = posX;
			this.posYAux = posY;
		}
	}

	@Override
	public void borrarMemoria() {
		this.memoria = -1;
	}
}
