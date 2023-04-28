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
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		setResizable(false);//Desactiva el boton maximizar ventana
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\victo\\OneDrive\\Escritorio\\Sistema-de-cooperativas-main\\icons\\iPrincipal.jpg"));
		setTitle("ADMINISTRADOR");//Establece el titulo de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Establece el cierre completo de la aplicacion
		setSize(395, 230); //Establece el tamaño de la ventana
		setLocationRelativeTo(null); //Establece la ventana en el centro
		contentPane = new JPanel();//Crea un panel sobre la ventana para el contenido
		contentPane.setBackground(SystemColor.control);//Da color de fondo al panel de contenido
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));//Establece el tamaño del borde del panel

		setContentPane(contentPane);
		contentPane.setLayout(null);//Desactivamos el Diseño por defecto del panel
		
		JLabel lblLogin = new JLabel("LOGIN");//Creamos una etiqueta Login con el te
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 20));//Establecemos el estilo del texto
		lblLogin.setBounds(137, 22, 121, 20);//Establecemos el tamaño de la etiqueta Login
		contentPane.add(lblLogin);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsuario.setBounds(56, 67, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblContraseña.setBounds(54, 103, 73, 14);
		contentPane.add(lblContraseña);
		
		textUsuario = new JTextField();
		textUsuario.setToolTipText("Ingrese su usuario de administrador");
		textUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textUsuario.setBounds(137, 64, 121, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		ContraseñaField = new JPasswordField();
		ContraseñaField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] usuario = ContraseñaField.getPassword();
				String usuarioFinal = new String(usuario);
				
				if (textUsuario.getText().equals("admin") && usuarioFinal.equals("admin")) {
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
		ContraseñaField.setToolTipText("Ingrese su contraseña");
		ContraseñaField.setBounds(137, 101, 121, 20);
		contentPane.add(ContraseñaField);
		
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
		btnIniciarSesion.setForeground(new Color(0, 0, 0));
		btnIniciarSesion.setBackground(SystemColor.inactiveCaption);
		btnIniciarSesion.setToolTipText("Presiona para iniciar sesion");
		btnIniciarSesion.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] usuario = ContraseñaField.getPassword();
				String usuarioFinal = new String(usuario);
				
				if (textUsuario.getText().equals("admin") && usuarioFinal.equals("admin")) {
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
		btnIniciarSesion.setBounds(117, 144, 125, 23);
		contentPane.add(btnIniciarSesion);
	}
}
