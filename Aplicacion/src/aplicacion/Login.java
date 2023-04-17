package aplicacion;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private JPanel Login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Login = new JPanel();
		FlowLayout fl_Login = (FlowLayout) Login.getLayout();
		fl_Login.setAlignment(FlowLayout.LEFT);
		Login.setForeground(new Color(0, 0, 0));
		Login.setBackground(new Color(192, 192, 192));
		Login.setBorder(new EmptyBorder(5, 5, 5, 5));

		JButton button1 = new JButton("Iniciar sección");
		button1.setBounds(100,300,200,50);
		JButton button2 = new JButton("Administrador");
		button2.setBounds(100,380, 200,50);
				
		JLabel label1 = new JLabel("Usuario");
		label1.setBounds(100,75, 200,30);
		JTextField text1 = new JTextField();
		text1.setBounds(100,100, 100,28);
		
		JLabel label2 = new JLabel("Contraseña");
		label2.setBounds(100,140, 200,30);
		
		JPasswordField contrasena = new JPasswordField();
		contrasena.setBounds(100,165, 200,28);
		
		frame.add(label1); 
		frame.add(text1);
		frame.add(label2);
		frame.add(contrasena);
		frame.add(button1);
		frame.add(button2);
		frame.setLayout(null);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
