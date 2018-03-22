package modelo;

import control.Iniciable;

public class Tablero implements Iniciable {
	private Carta[][] cartas;

	public Tablero(int dimensiones) {
		super();
		crearTablero(dimensiones);
	}

	@Override
	public void desordenarTablero(Carta[][] tablero) {
		assert tablero!=null:"El tablero no existe";
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crearTablero(int dimensiones) {
		assert dimensiones>1:"Dimensiones inválidas";
		int idCarta=0;
		cartas=new Carta[dimensiones][dimensiones];
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
