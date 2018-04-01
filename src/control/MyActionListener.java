package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {
	Juego juego;
	Accion accion;
	ParaUI paraUI;

	// Que traigo el paraui aqui para ver en el tablero las ids de las cartas????

	public MyActionListener(ParaUI paraUI, Juego juego) {
		super();
		this.juego = juego;
		this.accion = new Accion(this.juego);
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		assert e != null : "objeto nulo";
		JButton boton = (JButton) e.getSource();
		String[] coordenadas = boton.getName().split("-");
		accion.realizarJugada(coordenadas);
		this.paraUI.actualizarVentana();
		if (this.juego.jugada != 1 && this.juego.jugada % 2 == 0) {
			this.accion.ocultarCartas();
		}
	}
}
