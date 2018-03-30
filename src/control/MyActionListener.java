package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {
	Juego juego;
	Accion accion;
	ParaUI paraUI;

	public MyActionListener(ParaUI paraUI, Juego juego) {
		super();
		this.juego = juego;
		this.accion = new Accion(this.juego);
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		assert e == null : "objeto nulo";
		JButton boton = (JButton) e.getSource();
		String[] coordenadas = boton.getName().split("-");
		int posX = Integer.parseInt(coordenadas[0]);
		int posY = Integer.parseInt(coordenadas[1]);
		int idAux=paraUI.tablero.getCartas()[posX][posY].getId();
		if (paraUI.tablero.getCartas()[posX][posY].isVelada()) {
			accion.realizarJugada(posX,posY, idAux);
		}
		this.paraUI.actualizarVentana();
	}
}
