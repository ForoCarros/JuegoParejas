package modelo;

import control.Iniciable;
import utiles.Random;

public class Tablero implements Iniciable {

	private Carta[][] cartas;

	public Tablero(int dimensiones) {
		super();
		crearTablero(dimensiones);
		desordenarTablero(getCartas());
	}

	@Override
	public void desordenarTablero(Carta[][] tablero) {
		assert tablero != null : "El tablero no existe";
		Random random = new Random();
		for (int i = 0; i < (tablero.length)*2; i++) {
			int[] cambioUno=random.generarCoordenadasAleatorias(0, tablero.length-1);
			int[] cambioDos=random.generarCoordenadasAleatorias(0, tablero.length-1);
			int auxiliar=tablero[cambioDos[0]][cambioDos[1]].getId();
			tablero[cambioDos[0]][cambioDos[1]].setId(tablero[cambioUno[0]][cambioUno[1]].getId());
			tablero[cambioUno[0]][cambioUno[1]].setId(auxiliar);
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
