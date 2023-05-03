package aplicacion2;


import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerListModel;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class AgregarCuenta extends JPanel {
	 
	private JTextField textNombre;
	private JTextField textCedula;
	private JTextField textApellidos;
	private JTextField textField_4;
	private JTextField textCorreo;
	private JTextField textMonto_de_Apertura;
	private ButtonGroup btnGrSexo;
	private ButtonGroup btnGrEcivil;

	/**
	 * Creacion del panel.
	 */
	
	public AgregarCuenta() {
		setBorder(new LineBorder(Color.LIGHT_GRAY));
		setBackground(SystemColor.menu);
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		btnGrSexo = new ButtonGroup();
		btnGrEcivil = new ButtonGroup();
		JLabel lblTitulo = new JLabel("AGREGAR CUENTA");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitulo.setBounds(25, 11, 121, 15);
		add(lblTitulo);
		
		JLabel lblnombre = new JLabel("Nombre:");
		lblnombre.setBounds(25, 52, 70, 15);
		lblnombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblnombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(85, 49, 138, 20);
		textNombre.setToolTipText("ingresar nombre completo");
		textNombre.setColumns(10);
		add(textNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(25, 78, 65, 15);
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(85, 75, 138, 20);
		textApellidos.setColumns(10);
		add(textApellidos);
		
		JLabel lblTipoDeCuenta = new JLabel("Tipo de cuenta:");
		lblTipoDeCuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoDeCuenta.setBounds(275, 52, 100, 15);
		add(lblTipoDeCuenta);
		
		JComboBox cBoxTipo_de_Cuenta = new JComboBox();
		cBoxTipo_de_Cuenta.setModel(new DefaultComboBoxModel(new String[] {"Ahorro ", "Credito", "Aportaciones", "Juvenil"}));
		cBoxTipo_de_Cuenta.setToolTipText("Elegir tipo de cuenta");
		cBoxTipo_de_Cuenta.setBounds(400, 48, 89, 20);
		add(cBoxTipo_de_Cuenta);
		
		JLabel lblMonto_de_Apertura = new JLabel("Monto de Apertura:");
		lblMonto_de_Apertura.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMonto_de_Apertura.setBounds(275, 78, 112, 15);
		add(lblMonto_de_Apertura);
		
		textMonto_de_Apertura = new JTextField();
		textMonto_de_Apertura.setHorizontalAlignment(SwingConstants.RIGHT);
		textMonto_de_Apertura.setText("RD$");
		textMonto_de_Apertura.setToolTipText("ingresar nombre completo");
		textMonto_de_Apertura.setColumns(10);
		textMonto_de_Apertura.setBounds(400, 75, 89, 20);
		add(textMonto_de_Apertura);
		
		JLabel lblNoRegistro = new JLabel("No. de registro:");
		lblNoRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNoRegistro.setBounds(412, 22, 89, 15);
		add(lblNoRegistro);
		
		JLabel lblcedula = new JLabel("Cedula:");
		lblcedula.setBounds(25, 103, 70, 15);
		lblcedula.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblcedula);
		
		textCedula = new JTextField();
		textCedula.setBounds(85, 100, 138, 20);
		textCedula.setToolTipText("Ingresar numero de identidad electoral");
		textCedula.setColumns(10);
		add(textCedula);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(25, 239, 56, 15);
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblCorreo);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(85, 236, 208, 20);
		add(textCorreo);
		textCorreo.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(25, 265, 70, 15);
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblDireccion);
		
		JTextPane textDireccion = new JTextPane();
		textDireccion.setBorder(new LineBorder(Color.LIGHT_GRAY));
		textDireccion.setBounds(85, 268, 273, 57);
		textDireccion.setToolTipText("Ingresar direccion de domicilio");
		add(textDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(25, 210, 70, 15);
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblTelefono);
		
		textField_4 = new JTextField();
		textField_4.setBounds(85, 207, 121, 20);
		textField_4.setToolTipText("ingresar numero de telefono");
		textField_4.setColumns(10);
		add(textField_4);
		
		JLabel lblSexo_1 = new JLabel("Sexo:");
		lblSexo_1.setBounds(25, 184, 70, 15);
		lblSexo_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblSexo_1);
		
		JSpinner spinnerDia_1 = new JSpinner();
		spinnerDia_1.setBounds(35, 152, 37, 20);
		spinnerDia_1.setToolTipText("Ingresar dia de nacimiento");
		spinnerDia_1.setForeground(SystemColor.menu);
		add(spinnerDia_1);
		
		JLabel lblNacimientoddmmaaaa_1 = new JLabel("Fecha de nacimiento (dd/mm/aaaa):");
		lblNacimientoddmmaaaa_1.setBounds(25, 126, 218, 15);
		lblNacimientoddmmaaaa_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblNacimientoddmmaaaa_1);
		
		JComboBox cBoxMes = new JComboBox();
		cBoxMes.setBounds(82, 151, 89, 20);
		cBoxMes.setToolTipText("Elegir mes de nacimiento\r\n");
		cBoxMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		add(cBoxMes);
		
		JSpinner spinnerAño = new JSpinner();
		spinnerAño.setBounds(181, 152, 48, 20);
		spinnerAño.setModel(new SpinnerListModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910",
				"1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927",
				"1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944",
				"1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961",
				"1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978",
				"1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995",
				"1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005"}));;
		spinnerAño.setToolTipText("Ingresar año de nacimiento");
		add(spinnerAño);
		
		JRadioButton rdbtnHombre_1 = new JRadioButton("Hombre");
		rdbtnHombre_1.setBounds(85, 180, 65, 23);
		btnGrSexo.add(rdbtnHombre_1);
		add(rdbtnHombre_1);
		
		JRadioButton rdbtnMujer_1 = new JRadioButton("Mujer");
		rdbtnMujer_1.setBounds(150, 180, 65, 23);
		btnGrSexo.add(rdbtnMujer_1);
		add(rdbtnMujer_1);
		
		JRadioButton rdbtnSoltero_1 = new JRadioButton("Soltero");
		rdbtnSoltero_1.setBounds(340, 180, 65, 23);
		btnGrEcivil.add(rdbtnSoltero_1);
		add(rdbtnSoltero_1);
		
		JRadioButton rdbtnCasado_1 = new JRadioButton("Casado");
		rdbtnCasado_1.setBounds(405, 180, 65, 23);
		btnGrEcivil.add(rdbtnCasado_1);
		add(rdbtnCasado_1);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(395, 346, 85, 23);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int registro; 
				String nombre = textNombre.getText();
				String apellidos = textApellidos.getText();
				String cedula = textCedula.getText();
				String telefono = textField_4.getText();
				String correo = textCorreo.getText();
				String direccion = textDireccion.getText();
				/*String estadoCivil;
				//String sexo;
							
				if (rdbtnSoltero_1.isSelected() == true) {
					estadoCivil = "Soltero";
				} else if (rdbtnCasado_1.isSelected() == true) {
					estadoCivil = "Casado";
				}
				
				if (rdbtnHombre_1.isSelected() == true) {
					sexo = "Masculino";
				} else if (rdbtnMujer_1.isSelected() == true) {
					sexo = "Femenino";
				}*/
				
				try {
					
					Connection con = SQLConexion.getSQLConexion();
					PreparedStatement ps = con.prepareStatement("INSERT INTO Registro (registro, nombre, apellidos, cedula, telefono, correo, direccion) VALUES ( ?, ?, ?, ?, ?, ?, ?)");
					ps.setInt(1,1);
					ps.setString(2, nombre);
					ps.setString(3, apellidos);
					ps.setString(4, cedula);
					/*
					ps.setString(6, sexo);
					ps.setString(7, estadoCivil);
					*/
					ps.setString(5, telefono);
					ps.setString(6, correo);
					ps.setString(7, direccion);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Registro completado", "", JOptionPane.INFORMATION_MESSAGE);
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, e.toString());
				}				
			}
		});
		
		JLabel lblEstadoCivil_1 = new JLabel("Estado civil:");
		lblEstadoCivil_1.setBounds(260, 184, 70, 15);
		lblEstadoCivil_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblEstadoCivil_1);
		
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNombre.setText("");
				textCedula.setText("");
				textApellidos.setText("");
				textField_4.setText("");
				textCorreo.setText("");
				textDireccion.setText("");
				btnGrSexo.clearSelection();
				btnGrEcivil.clearSelection();
				spinnerAño.setModel(new SpinnerListModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910",
						"1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927",
						"1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944",
						"1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961",
						"1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978",
						"1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995",
						"1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005"}));;
				cBoxMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
						"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
				cBoxTipo_de_Cuenta.setModel(new DefaultComboBoxModel(new String[] {"Ahorro ", "Credito", "Aportaciones"}));
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNombre.setText("");
				textCedula.setText("");
				textApellidos.setText("");
				textField_4.setText("");
				textCorreo.setText("");
				textDireccion.setText("");	
				btnGrSexo.clearSelection();
				btnGrEcivil.clearSelection();
				spinnerAño.setModel(new SpinnerListModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910",
						"1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927",
						"1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944",
						"1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961",
						"1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978",
						"1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995",
						"1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005"}));;
				cBoxMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
						"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
				cBoxTipo_de_Cuenta.setModel(new DefaultComboBoxModel(new String[] {"Ahorro ", "Credito", "Aportaciones"}));
			}
		});
		btnCancelar.setBounds(485, 346, 85, 23);
		add(btnCancelar);
		add(btnGuardar);
		
	}
}