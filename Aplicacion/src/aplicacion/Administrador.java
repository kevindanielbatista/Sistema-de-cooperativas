package aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Administrador extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField ContraseñaField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administrador frame = new Administrador();
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
	public Administrador() {
		setTitle("ADMINISTRADOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 395, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLogin.setBounds(137, 22, 121, 20);
		contentPane.add(lblLogin);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsuario.setBounds(29, 67, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContraseña.setBounds(29, 103, 73, 14);
		contentPane.add(lblContraseña);
		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textUsuario.setBounds(114, 64, 121, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		ContraseñaField = new JPasswordField();
		ContraseñaField.setBounds(114, 101, 121, 20);
		contentPane.add(ContraseñaField);
		
		JButton btnIniciarSesion = new JButton("INICIAR SECCION");
		btnIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 10));
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
					JOptionPane.showMessageDialog(null,"Usuario o Contraseña incorrectos", "ERROR", JOptionPane.INFORMATION_MESSAGE);
					textUsuario.setText("");
					ContraseñaField.setText("");
					textUsuario.requestFocus();
				}
			}
		});
		btnIniciarSesion.setBounds(114, 132, 121, 23);
		contentPane.add(btnIniciarSesion);
	}
}
