package control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {

	Accion accion;

	public MyActionListener(Accion accion) {
		super();
		this.accion = accion;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		String[]coordenadas = boton.getName().split("-");
		accion.realizarJugada(coordenadas);
	}
}
