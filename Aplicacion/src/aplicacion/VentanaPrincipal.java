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
		button1.setBounds(50, 300, 100,50);
		JButton button2 = new JButton("Administrador");
		button2.setBounds(50, 350, 100,50);
		JLabel label1 = new JLabel("Usuario");
		label1.setBounds(50, 75, 100, 30);
		JLabel label1 = new JLabel("Contraseña");
		label1.setBounds(50, 140, 100, 30);
		JTextField text1 = new JTextField();
		text1.setBounds(100, 100, 100, 28);
		JPasswordField contrasena = new JPasswordField();
		text2.setBounds(100, 165, 100, 28);
		
		frame.add(button1);
		frame.add(button2);
		frame.add(label1);
		frame.add(label2);
		frame.add(text1);
		frame.add(contrasena);
		frame.setSize(800, 600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
