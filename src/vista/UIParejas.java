package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class UIParejas extends JFrame {
	protected JPanel contentPane;
	protected Botonera botonera;

	public UIParejas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 575);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblJuegoParejas = new JLabel("Juego Parejas");
		lblJuegoParejas.setBackground(new Color(135, 206, 235));
		lblJuegoParejas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJuegoParejas.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblJuegoParejas, BorderLayout.NORTH);

		botonera = new Botonera();
		botonera.setBackground(new Color(135, 206, 235));
		contentPane.add(botonera, BorderLayout.CENTER);
	}
}