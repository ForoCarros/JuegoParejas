package modelo;

import control.Iniciable;

public class Tablero implements Iniciable {
	Carta[][] cartas;

	public Tablero(int parejas) {
		super();
		crearTablero(parejas);
	}

	@Override
	public void desordenarTablero(Carta[][] tablero) {
		assert tablero!=null:"El tablero no existe";
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crearTablero(int dimension) {
		assert dimension>1:"Dimensiones inválidas";
		int idCarta=0;
		cartas=new Carta[dimension][dimension];
		for (int i = 0; i < cartas.length; i++) {
			if (i==cartas.length/2) {
				idCarta=0;
			}
			for (int j = 0; j < cartas[i].length; j++) {
				cartas[i][j]=new Carta(idCarta);
				idCarta++;
			}
			
		}
		
	}

}
