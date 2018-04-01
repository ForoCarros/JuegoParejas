package control;

import modelo.Tablero;
import utiles.StretchIcon;
import vista.UIParejas;

public class ParaUI extends UIParejas implements ParaUIable {
	Tablero tablero;
	MyActionListener listener;
	Juego juego;
	final int LADO = 6;
	final int ARCHIVOS = 20;
	final String EXTENSION = ".jpg";
	StretchIcon iconos[];

	public ParaUI() {
		super();
		this.tablero = new Tablero(this.LADO);
		this.juego = new Juego(this.tablero);
		this.listener = new MyActionListener(this, this.juego);
		this.botonera.iniciarBotonera(this.LADO);
		this.generarImagenes();
		this.establecerListeners();
		this.actualizarVentana();
	}

	private void generarImagenes() {
		this.iconos = new StretchIcon[this.ARCHIVOS];
		for (int i = 0; i < this.ARCHIVOS; i++) {
			this.iconos[i] = new StretchIcon("assets/" + i + this.EXTENSION);
		}
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
				if (!this.tablero.getCartas()[i][j].isVelada() || this.tablero.getCartas()[i][j].isEmparejada()) {
					// this.botonera.botones[i][j].setText(String.valueOf(this.tablero.getCartas()[i][j].getId()));
					this.botonera.botones[i][j].setIcon(this.iconos[this.tablero.getCartas()[i][j].getId()]);
				} else {
					this.botonera.botones[i][j].setIcon(null);
				}
			}
		}
	}
}
