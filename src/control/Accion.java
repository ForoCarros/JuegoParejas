package control;

public class Accion implements Accionable {

	Juego juego;
	int posXAux, posYAux;
	int memoria = -1;
	
	public Accion(Juego juego) {
		super();
		this.juego = juego;
	}

	@Override
	public void realizarJugada(int posX, int posY, int id) {
		assert String.valueOf(id).isEmpty() : "coordenada vacia";
		this.juego.mostrarCarta(posX, posY);

		if (memoria > -1) {
			if (!(this.juego.compararCartas(memoria, id))) {
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
