package aplicacion;

import java.awt.*;
import javax.swing.*;

public class VentanaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		JButton button1 = new JButton("Iniciar sesion");
		button1.setBounds(294, 305, 160,50);
		JButton button2 = new JButton("Administrador");
		button2.setBounds(294, 367, 160,50);
		JLabel label1 = new JLabel("Usuario");
		label1.setBounds(334, 59, 100, 30);
		JLabel label2 = new JLabel("Contraseña");
		label2.setBounds(334, 169, 100, 30);
		JTextField text1 = new JTextField();
		text1.setBounds(294, 101, 160, 28);
		JPasswordField contrasena = new JPasswordField();
		contrasena.setBounds(294, 211, 160, 28);
		
		frame.getContentPane().add(button1);
		frame.getContentPane().add(button2);
		frame.getContentPane().add(label1);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(text1);
		frame.getContentPane().add(contrasena);
		frame.setSize(800, 600);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
