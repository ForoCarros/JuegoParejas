package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class UIParejas extends JFrame {
	protected JPanel contentPane;
	protected Botonera botonera;

	public UIParejas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblJuegoParejas = new JLabel("Juego Parejas");
		lblJuegoParejas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJuegoParejas.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblJuegoParejas, BorderLayout.NORTH);

		botonera = new Botonera();
		contentPane.add(botonera, BorderLayout.CENTER);
	}
}