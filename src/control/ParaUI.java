package control;

import modelo.Tablero;
import vista.UIParejas;

public class ParaUI extends UIParejas implements ParaUIable {
	Tablero tablero;
	MyActionListener listener;
	final int LADO = 6;

	public ParaUI() {
		super();
		this.listener = new MyActionListener(this);
		this.tablero = new Tablero(this.LADO);
		this.botonera.iniciarBotonera(this.LADO);
		this.establecerListeners();
		this.actualizarVentana();
	}
	
	private void establecerListeners() {
		for (int i = 0; i < this.botonera.botones.length; i++) {
			for (int j = 0; j < this.botonera.botones[i].length; j++) {
				this.botonera.botones[i][j].addActionListener(listener);
			}
		}
	}

	@Override
	public void actualizarVentana() {
		for (int i = 0; i < this.botonera.botones.length; i++) {
			for (int j = 0; j < this.botonera.botones[i].length; j++) {
				// this.botonera.botones[i][j].setText(String.valueOf(this.tablero.getCartas()[i][j].getId()));
				if (this.tablero.getCartas()[i][j].isVelada()) {
					this.botonera.botones[i][j].setText(String.valueOf(this.tablero.getCartas()[i][j].getId()));
				}
			}
		}

	}

}
