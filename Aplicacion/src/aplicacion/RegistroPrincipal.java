package aplicacion;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class RegistroPrincipal extends JFrame {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroPrincipal window = new RegistroPrincipal();
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
	public RegistroPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		JButton inicSesion = new JButton("Iniciar sesion");
		inicSesion.setBounds(294, 305, 160,50);
		JButton administrador = new JButton("Administrador");
		administrador.setBounds(294, 367, 160,50);
		JLabel label1 = new JLabel("Usuario");
		label1.setBounds(334, 59, 55, 15);
		JLabel label2 = new JLabel("Contraseña");
		label2.setBounds(334, 169, 83, 15);
		JTextField text1 = new JTextField();
		text1.setBounds(294, 101, 160, 28);
		JPasswordField contrasena = new JPasswordField();
		contrasena.setBounds(294, 211, 160, 28);
		
		frame.getContentPane().add(inicSesion);
		frame.getContentPane().add(administrador);
		frame.getContentPane().add(label1);
		frame.getContentPane().add(label2);
		frame.getContentPane().add(text1);
		frame.getContentPane().add(contrasena);
		frame.setSize(800, 600);
		frame.getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(165, 211, 1, 1);
		frame.getContentPane().add(table);
		
		JButton registrarse = new JButton("Registrarse");
		registrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				VentanaRegistro regis = new VentanaRegistro();
				regis.frame.setVisible(true);
			   
			}
		});
		registrarse.setBounds(294, 432, 160, 50);
		frame.getContentPane().add(registrarse);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
