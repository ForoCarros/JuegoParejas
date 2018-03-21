package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

public class UIParejas extends JFrame {

	protected int cosita;
	protected JPanel contentPane;
	protected Botonera botonera;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIParejas frame = new UIParejas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//Hola cambiooogdsaddasgsad
	/**
	 * Create the frame.
	 */
	public UIParejas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblJuegoParejas = new JLabel("Juego Parejas");
		lblJuegoParejas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblJuegoParejas.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblJuegoParejas, BorderLayout.NORTH);
		
		botonera = new Botonera(100, 0);	
		contentPane.add(botonera, BorderLayout.CENTER);
		botonera.setBounds(100, 50, 150, 150);
		botonera.setLayout(new GridLayout(6, 0, 0, 0));
		
		
	}
	
	
	
	

}
