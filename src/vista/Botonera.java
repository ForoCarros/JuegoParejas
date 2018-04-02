package vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;

public class Botonera extends JPanel {

	public JButton botones[][];

	public Botonera() {
		setBackground(new Color(70, 130, 180));
		this.setLayout(new GridLayout(1, 1));
	}

	/**
	 * Genera los botones del panel botonera
	 * 
	 * @param lado
	 *            de la botonera
	 */

	public void iniciarBotonera(int lado) {
		this.botones = new JButton[lado][lado];
		this.setLayout(new GridLayout(lado, lado));
		for (int i = 0; i < this.botones.length; i++) {
			for (int j = 0; j < this.botones[i].length; j++) {
				this.botones[i][j] = new JButton();
				this.botones[i][j].setName(i + "-" + j);
				this.botones[i][j].setBackground(null);
				this.botones[i][j].setBorder(null);
				this.add(this.botones[i][j]);
			}
		}
	}
}
