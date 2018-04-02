package modelo;

import control.Iniciable;
import utiles.Random;

public class Tablero implements Iniciable {

	private Carta[][] cartas;

	public Tablero(int dimensiones) {
		super();
		crearTablero(dimensiones);
		desordenarTablero();
	}

	@Override
	public void desordenarTablero() {
		assert this.cartas != null : "El tablero no existe";
		Random random = new Random();
		for (int i = 0; i < (this.cartas.length) * 2; i++) {
			int[] cambioUno = random.generarCoordenadasAleatorias(0, this.cartas.length - 1);
			int[] cambioDos = random.generarCoordenadasAleatorias(0, this.cartas.length - 1);
			int auxiliar = this.cartas[cambioDos[0]][cambioDos[1]].getId();
			this.cartas[cambioDos[0]][cambioDos[1]].setId(this.cartas[cambioUno[0]][cambioUno[1]].getId());
			this.cartas[cambioUno[0]][cambioUno[1]].setId(auxiliar);
		}
	}

	@Override
	public void crearTablero(int dimensiones) {
		assert dimensiones > 1 : "Dimensiones inválidas";
		int idCarta = 0;
		setCartas(new Carta[dimensiones][dimensiones]);
		for (int i = 0; i < getCartas().length; i++) {
			if (i == getCartas().length / 2) {
				idCarta = 0;
			}
			for (int j = 0; j < getCartas()[i].length; j++) {
				getCartas()[i][j] = new Carta(idCarta);
				idCarta++;
			}
		}
	}

	public Carta[][] getCartas() {
		return cartas;
	}

	public void setCartas(Carta[][] cartas) {
		this.cartas = cartas;
	}
}
