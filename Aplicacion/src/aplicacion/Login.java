package aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsurio;
	private JPasswordField ContraseñaField;
	private JTextField textUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\victo\\OneDrive\\Escritorio\\Sistema-de-cooperativas-main\\icons\\iPrincipal.jpg"));
		setTitle("SISTEMA DE COOPERATIVA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 297);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 210, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLogin.setBounds(68, 11, 67, 31);
		contentPane.add(lblLogin);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsuario.setBounds(19, 71, 65, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContraseña.setBounds(19, 96, 66, 14);
		contentPane.add(lblContraseña);
		
		textUsuario = new JTextField();
		textUsuario.setToolTipText("Ingresar usuario ");
		textUsuario.setBounds(95, 69, 100, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		JButton btnIniciarSesion = new JButton("INICIAR SESION");
		btnIniciarSesion.setToolTipText("Iniciar sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] usuario = ContraseñaField.getPassword();
				String usuarioFinal = new String(usuario);
				
				if (textUsuario.getText().equals("Wilmi") && usuarioFinal.equals("1974")) {
					dispose();
					JOptionPane.showMessageDialog(null, "Acesso concedido", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
					Principal p = new Principal();
					p.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null,"Usuario o Contraseña incorrectos", "ERROR", 
							JOptionPane.INFORMATION_MESSAGE);
					textUsuario.setText("");
					ContraseñaField.setText("");
					textUsuario.requestFocus();
				}
			}
		});
		
		btnIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnIniciarSesion.setBounds(44, 147, 127, 23);
		contentPane.add(btnIniciarSesion);
		
		JButton btnAdministrador = new JButton("ADMINISTRADOR");
		btnAdministrador.setToolTipText("Ingresar como administrador");
		btnAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administrador admin = new Administrador();
				admin.setVisible(true);
			}
		});
		btnAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAdministrador.setBounds(44, 191, 127, 23);
		contentPane.add(btnAdministrador);
		
		ContraseñaField = new JPasswordField();
		ContraseñaField.setToolTipText("Ingresar contraseña");
		ContraseñaField.setBounds(95, 94, 100, 20);
		contentPane.add(ContraseñaField);
		
		
	}
}
