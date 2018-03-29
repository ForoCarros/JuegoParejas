package control;

public class Accion implements Accionable {

	Juego juego;
	int posXAux, posYAux;
	int memoria = 0;
	// como traigo la id de cada carta????
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
