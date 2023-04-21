package aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerListModel;
import java.awt.Color;

public class Registro extends JFrame {
	 
	private JPanel cPaneRegistro;
	private JTextField textNombre;
	private JLabel cedulaLabel;
	private JTextField textCedula;
	private JLabel lblCorreo;
	private JTextField textCorreoElectronico;
	private JLabel lblDireccion;
	private JTextField textTelefono;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;
	private JTextField textApellidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registro() {
		setTitle("Nuevo Registro");
		setSize(462,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cPaneRegistro = new JPanel();
		cPaneRegistro.setBorder(new EmptyBorder(5, 2, 5, 2));
		
		setContentPane(cPaneRegistro);
		cPaneRegistro.setLayout(null);
		
		JLabel nombreLabel = new JLabel("Nombre:");
		nombreLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombreLabel.setBounds(10, 26, 70, 15);
		getContentPane().add(nombreLabel);
		
		textNombre = new JTextField();
		textNombre.setToolTipText("ingresar nombre completo");
		textNombre.setBounds(67, 23, 138, 19);
		getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellidos.setBounds(215, 26, 65, 14);
		cPaneRegistro.add(lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(287, 23, 145, 20);
		cPaneRegistro.add(textApellidos);
		textApellidos.setColumns(10);
		
		cedulaLabel = new JLabel("Cedula:");
		cedulaLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		cedulaLabel.setBounds(10, 55, 70, 15);
		getContentPane().add(cedulaLabel);
		
		textCedula = new JTextField();
		textCedula.setToolTipText("Ingresar numero de identidad electoral");
		textCedula.setBounds(67, 52, 138, 19);
		getContentPane().add(textCedula);
		textCedula.setColumns(10);
		
		lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCorreo.setBounds(10, 165, 56, 15);
		getContentPane().add(lblCorreo);
		
		textCorreoElectronico = new JTextField();
		textCorreoElectronico.setToolTipText("ingresar correo electronico");
		textCorreoElectronico.setBounds(67, 162, 216, 19);
		getContentPane().add(textCorreoElectronico);
		textCorreoElectronico.setColumns(10);
		
		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDireccion.setBounds(10, 217, 70, 15);
		getContentPane().add(lblDireccion);
		
		JTextPane textDireccion = new JTextPane();
		textDireccion.setToolTipText("Ingresar direccion de domicilio");
		textDireccion.setBounds(67, 217, 273, 57);
		getContentPane().add(textDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefono.setBounds(10, 191, 70, 15);
		getContentPane().add(lblTelefono);
		
		textTelefono = new JTextField();
		textTelefono.setToolTipText("ingresar numero de telefono");
		textTelefono.setBounds(67, 188, 121, 19);
		getContentPane().add(textTelefono);
		textTelefono.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSexo.setBounds(10, 134, 70, 15);
		getContentPane().add(lblSexo);
		
		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setBounds(54, 130, 70, 23);
		getContentPane().add(rdbtnHombre);
		
		rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(126, 130, 70, 23);
		getContentPane().add(rdbtnMujer);
		
		JSpinner spinnerDia = new JSpinner();
		spinnerDia.setToolTipText("Ingresar dia de nacimiento");
		spinnerDia.setForeground(new Color(240, 240, 240));
		spinnerDia.setModel(new SpinnerListModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", 
				"22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		spinnerDia.setBounds(238, 91, 37, 20);
		getContentPane().add(spinnerDia);
		
		JLabel lblNacimientoddmmaaaa = new JLabel("Fecha de nacimiento (dd/mm/aaaa):");
		lblNacimientoddmmaaaa.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNacimientoddmmaaaa.setBounds(10, 79, 218, 44);
		getContentPane().add(lblNacimientoddmmaaaa);
		
		JComboBox cBoxMes = new JComboBox();
		cBoxMes.setToolTipText("Elegir mes de nacimiento\r\n");
		cBoxMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		cBoxMes.setBounds(285, 90, 89, 22);
		cPaneRegistro.add(cBoxMes);
		
		JSpinner spinnerAño = new JSpinner();
		spinnerAño.setToolTipText("Ingresar año de nacimiento");
		spinnerAño.setModel(new SpinnerListModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910",
				"1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927",
				"1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944",
				"1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961",
				"1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978",
				"1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995",
				"1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005"}));
		spinnerAño.setBounds(384, 91, 48, 20);
		cPaneRegistro.add(spinnerAño);
		
		JButton btnTerminar = new JButton("Terminar");
		btnTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Registro completado");
				dispose();
			}
		});
		btnTerminar.setBounds(171, 361, 89, 23);
		cPaneRegistro.add(btnTerminar);
		
		JLabel lblEstadoCivil = new JLabel("Estado civil:");
		lblEstadoCivil.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstadoCivil.setBounds(224, 134, 77, 14);
		cPaneRegistro.add(lblEstadoCivil);
		
		JRadioButton rdbtnSoltero = new JRadioButton("Soltero");
		rdbtnSoltero.setBounds(288, 130, 70, 23);
		cPaneRegistro.add(rdbtnSoltero);
		
		JRadioButton rdbtnCasado = new JRadioButton("Casado");
		rdbtnCasado.setBounds(368, 130, 64, 23);
		cPaneRegistro.add(rdbtnCasado);
	}
}