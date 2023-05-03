package aplicacion2;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.Action;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login extends JFrame {

	private JPanel contentPane;
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
		setResizable(false);
		setBackground(new Color(85, 107, 47));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\victo\\OneDrive\\Escritorio\\Sistema-de-cooperativas-main\\icons\\iPrincipal.jpg"));
		setTitle("SISTEMA DE COOPERATIVA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(561, 376);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsuario.setBounds(48, 128, 65, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblContraseña.setBounds(48, 186, 66, 14);
		contentPane.add(lblContraseña);
		
		textUsuario = new JTextField();
		textUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (textUsuario.getText().equals("Ingrese su nombre de usuario")) {
					textUsuario.setText("");
					textUsuario.setForeground(Color.black);
				}
				if (String.valueOf(ContraseñaField.getPassword()).isEmpty()) {
					ContraseñaField.setText("********");
					ContraseñaField.setForeground(Color.LIGHT_GRAY);
				}
			}
		});
		textUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (textUsuario.getText().equals("Ingrese su nombre de usuario")) {
					textUsuario.setText("");
					textUsuario.setForeground(Color.black);
				}
				if (String.valueOf(ContraseñaField.getPassword()).isEmpty()) {
					ContraseñaField.setText("********");
					ContraseñaField.setForeground(Color.LIGHT_GRAY);
				}
			}
		});
		textUsuario.setBorder(null);
		textUsuario.setForeground(Color.LIGHT_GRAY);
		textUsuario.setText("Ingrese su nombre de usuario");
		textUsuario.setToolTipText("Ingresar usuario ");
		textUsuario.setBounds(48, 153, 229, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		JButton btnIniciarSesion = new JButton("INICIAR SESION");
		btnIniciarSesion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnIniciarSesion.setBackground(SystemColor.activeCaption);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnIniciarSesion.setBackground(SystemColor.inactiveCaption);
			}
		});
		btnIniciarSesion.setBackground(SystemColor.inactiveCaption);
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
					textUsuario.setText("Ingrese su nombre de usuario");
					textUsuario.setForeground(Color.LIGHT_GRAY);
					ContraseñaField.setText("********");
					ContraseñaField.setForeground(Color.LIGHT_GRAY);
					textUsuario.requestFocus();
				}
			}
		});
		textUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (textUsuario.getText().equals("Ingrese su nombre de usuario")) {
					textUsuario.setText("");
					textUsuario.setForeground(Color.black);
				}
				if (String.valueOf(ContraseñaField.getPassword()).isEmpty()) {
					ContraseñaField.setText("********");
					ContraseñaField.setForeground(Color.LIGHT_GRAY);
				}
			}
		});
		btnIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnIniciarSesion.setBounds(86, 258, 127, 23);
		contentPane.add(btnIniciarSesion);
		
		JButton btnAdministrador = new JButton("ADMINISTRADOR");
		btnAdministrador.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnAdministrador.setBackground(SystemColor.activeCaption);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnAdministrador.setBackground(SystemColor.inactiveCaption);
			}
		});
		btnAdministrador.setBackground(SystemColor.inactiveCaption);
		btnAdministrador.setToolTipText("Ingresar como administrador");
		btnAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administrador admin = new Administrador();
				admin.setVisible(true);
			}
		});
		btnAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//presionar enter
				Administrador admin = new Administrador();
				admin.setVisible(true);
			}
		});
		btnAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAdministrador.setBounds(86, 292, 127, 23);
		contentPane.add(btnAdministrador);
		
		ContraseñaField = new JPasswordField();
		ContraseñaField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (String.valueOf(ContraseñaField.getPassword()).equals("********")) {
					ContraseñaField.setText("");
					ContraseñaField.setForeground(Color.black);
				}
				if (textUsuario.getText().isEmpty()) {
					textUsuario.setText("Ingrese su nombre de usuario");
					textUsuario.setForeground(Color.LIGHT_GRAY);
				}
			}
		});
		ContraseñaField.addActionListener(new ActionListener() {
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
					textUsuario.setText("Ingrese su nombre de usuario");
					textUsuario.setForeground(Color.LIGHT_GRAY);
					ContraseñaField.setText("********");
					ContraseñaField.setForeground(Color.LIGHT_GRAY);
					textUsuario.requestFocus();
				}
			}
		});
		
		ContraseñaField.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (String.valueOf(ContraseñaField.getPassword()).equals("********")) {
					ContraseñaField.setText("");
					ContraseñaField.setForeground(Color.black);
				}
				if (textUsuario.getText().isEmpty()) {
					textUsuario.setText("Ingrese su nombre de usuario");
					textUsuario.setForeground(Color.LIGHT_GRAY);
				}
			}
		});
		ContraseñaField.setText("********");
		ContraseñaField.setForeground(Color.LIGHT_GRAY);
		ContraseñaField.setBorder(null);
		ContraseñaField.setToolTipText("Ingresar contraseña");
		ContraseñaField.setBounds(48, 211, 229, 20);
		contentPane.add(ContraseñaField);
		
		JLabel lnlLogoEmpresa = new JLabel("");
		lnlLogoEmpresa.setToolTipText("Logo de la empresa");
		lnlLogoEmpresa.setBackground(Color.WHITE);
		lnlLogoEmpresa.setLabelFor(this);
		lnlLogoEmpresa.setIcon(new ImageIcon("C:\\Users\\victo\\OneDrive\\Escritorio\\Sistema-de-cooperativas-main\\Sistema-de-cooperativas-main\\Aplicacion\\src\\Image\\iEmpresa.png"));
		lnlLogoEmpresa.setBounds(108, 11, 84, 82);
		contentPane.add(lnlLogoEmpresa);
		
		JLabel lblLogin = new JLabel("       LOGIN");
		lblLogin.setBounds(86, 93, 127, 25);
		contentPane.add(lblLogin);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lbliFondo = new JLabel("");
		lbliFondo.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lbliFondo.setToolTipText("Imagen de la empresa");
		lbliFondo.setBackground(new Color(0, 0, 0));
		lbliFondo.setIcon(new ImageIcon("C:\\Users\\victo\\OneDrive\\Escritorio\\Sistema-de-cooperativas-main\\Sistema-de-cooperativas-main\\Aplicacion\\src\\Image\\iFondo.png"));
		lbliFondo.setBounds(304, 0, 241, 337);
		contentPane.add(lbliFondo);
		
		JSeparator separatorUsuario = new JSeparator();
		separatorUsuario.setBackground(Color.BLACK);
		separatorUsuario.setBounds(48, 173, 229, 2);
		contentPane.add(separatorUsuario);
		
		JSeparator separatoContraseña = new JSeparator();
		separatoContraseña.setBackground(Color.BLACK);
		separatoContraseña.setBounds(48, 231, 229, 2);
		contentPane.add(separatoContraseña);
		
		
	}
}
