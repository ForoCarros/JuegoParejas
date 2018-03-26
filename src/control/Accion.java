package control;

public class Accion implements Accionable{
	
	Jugable jugable;
	int posXAux,posYAux;
	int memoria=0;
	// como traigo la id de cada carta????
	int id=0;

	@Override
	public void realizarJugada(String[] coordenadas) {
		int posX = Integer.parseInt(coordenadas[0]);
		int posY = Integer.parseInt(coordenadas[1]);
		jugable.mostrarCarta(posX, posY);

		if (memoria > -1) {
			//  Aqui comparamos las dos ids, pero como la traigo¿?¿?¿?
			if (jugable.compararCartas(id, id)) {
				//encontrada=true; y entonces solo es poner las dos cartas desveladas y fuera
			} else {
				jugable.ocultarCarta(posX, posY);
				jugable.ocultarCarta(posXAux, posYAux);
				jugable.borrarMemoria();
			}
		}else {
			memoria=id;
			posXAux=posX;
			posYAux=posY;
		}
	}
}
