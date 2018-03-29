package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {

	Accion accion;
	ParaUI paraUI;

	// Que traigo el paraui aqui para ver en el tablero las ids de las cartas????

	public MyActionListener(ParaUI paraUI) {
		super();
		this.accion = new Accion();
		this.paraUI = paraUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		assert e == null : "objeto nulo";
		JButton boton = (JButton) e.getSource();
		String[] coordenadas = boton.getName().split("-");
		accion.realizarJugada(coordenadas);
		System.out.println(coordenadas[0] + " " + coordenadas[1]);
		this.paraUI.actualizarVentana();
	}
}
