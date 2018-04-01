package vista;

import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Botonera extends JPanel {

	public JButton botones[][];
	// medidas predetermindadas que despues se ajustan automaticamente en la UIParejas
	int anchoPanel = 150, altoPanel = 150;
	int ladoBoton = 50;

	/**
	 * Create the panel.
	 */
	public Botonera(int x, int y) {
		setLayout(null);
		this.setBounds(x, y, this.anchoPanel, this.altoPanel);
	}

	/**
	 * Genera los botones del panel botonera
	 * 
	 * @param lado
	 *            de la botonera
	 */

	public void iniciarBotonera(int lado) {
		// Tamaño botonera
		this.botones = new JButton[lado][lado];

		int x = 0, y = 0;
		for (int i = 0; i < this.botones.length; i++) {
			for (int j = 0; j < this.botones[i].length; j++) {

				this.botones[i][j] = new JButton();
				// Nombre del boton
				this.botones[i][j].setName(i + "-" + j);
				this.botones[i][j].setBounds(x, y, this.ladoBoton, this.ladoBoton);

				this.add(this.botones[i][j]);
				x += this.ladoBoton;
			}
			x = 0;
			y += this.ladoBoton;
		}
	}
}
