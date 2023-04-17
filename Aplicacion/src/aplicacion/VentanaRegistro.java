package aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;

public class VentanaRegistro {

	JFrame frame;
	private JTextField textField;
	private JLabel cedulaLabel;
	private JTextField textField_1;
	private JLabel lblCorreo;
	private JTextField textField_2;
	private JLabel lblDireccion;
	private JTextField textField_3;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRegistro window = new VentanaRegistro();
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
	public VentanaRegistro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 556, 668);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel registreseLabel = new JLabel("Registrese");
		registreseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		registreseLabel.setBounds(208, 12, 104, 15);
		frame.getContentPane().add(registreseLabel);
		
		JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setBounds(36, 42, 70, 15);
		frame.getContentPane().add(nombreLabel);
		
		textField = new JTextField();
		textField.setBounds(134, 39, 326, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		cedulaLabel = new JLabel("Cedula:");
		cedulaLabel.setBounds(36, 86, 70, 15);
		frame.getContentPane().add(cedulaLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 84, 326, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(36, 136, 70, 15);
		frame.getContentPane().add(lblCorreo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(134, 134, 326, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(36, 191, 70, 15);
		frame.getContentPane().add(lblDireccion);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(134, 191, 326, 72);
		frame.getContentPane().add(textPane);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(36, 300, 70, 15);
		frame.getContentPane().add(lblTelefono);
		
		textField_3 = new JTextField();
		textField_3.setBounds(134, 298, 326, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(36, 367, 70, 15);
		frame.getContentPane().add(lblSexo);
		
		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setBounds(134, 363, 149, 23);
		frame.getContentPane().add(rdbtnHombre);
		
		rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(287, 363, 149, 23);
		frame.getContentPane().add(rdbtnMujer);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(134, 438, 46, 20);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(211, 438, 46, 20);
		frame.getContentPane().add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(283, 438, 70, 20);
		frame.getContentPane().add(spinner_2);
		
		JLabel lblNacimientoddmmaaaa = new JLabel("Nacimiento(DD/MM/AAAA):");
		lblNacimientoddmmaaaa.setBounds(36, 394, 204, 44);
		frame.getContentPane().add(lblNacimientoddmmaaaa);
	}
}
