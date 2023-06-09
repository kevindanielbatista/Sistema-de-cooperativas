package aplicacion;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerListModel;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.SystemColor;

public class AgregarCuenta extends JPanel {
	 
	private JPanel Contenido;
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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textTelefono_4;
	private JTextField textCorreo;

	/**
	 * Creacion del panel.
	 */
	public AgregarCuenta() {
		setBackground(SystemColor.menu);
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("AGREGAR CUENTA");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitulo.setBounds(25, 11, 121, 15);
		add(lblTitulo);
		
		JLabel lblnombre = new JLabel("Nombre:");
		lblnombre.setBounds(25, 52, 70, 15);
		lblnombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblnombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(82, 49, 138, 19);
		textNombre.setToolTipText("ingresar nombre completo");
		textNombre.setColumns(10);
		add(textNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(25, 78, 65, 14);
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.setBounds(82, 75, 138, 20);
		textApellidos.setColumns(10);
		add(textApellidos);
		
		JLabel lblTipoDeCuenta = new JLabel("Tipo de cuenta:");
		lblTipoDeCuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoDeCuenta.setBounds(246, 52, 100, 15);
		add(lblTipoDeCuenta);
		
		JComboBox cBoxTipo_de_Cuenta = new JComboBox();
		cBoxTipo_de_Cuenta.setModel(new DefaultComboBoxModel(new String[] {"Ahorro", "Credito", "Aportaciones", "Juvenil"}));
		cBoxTipo_de_Cuenta.setToolTipText("Elegir tipo de cuenta");
		cBoxTipo_de_Cuenta.setBounds(339, 48, 89, 22);
		add(cBoxTipo_de_Cuenta);
		
		JLabel lblNoRegistro = new JLabel("No. de registro:");
		lblNoRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNoRegistro.setBounds(412, 22, 89, 15);
		add(lblNoRegistro);
		
		JLabel lblcedula = new JLabel("Cedula:");
		lblcedula.setBounds(25, 103, 70, 15);
		lblcedula.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblcedula);
		
		textCedula = new JTextField();
		textCedula.setBounds(82, 100, 138, 19);
		textCedula.setToolTipText("Ingresar numero de identidad electoral");
		textCedula.setColumns(10);
		add(textCedula);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(25, 239, 56, 15);
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblCorreo);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(82, 236, 208, 20);
		add(textCorreo);
		textCorreo.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(25, 265, 70, 15);
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblDireccion);
		
		JTextPane textDireccion = new JTextPane();
		textDireccion.setBounds(85, 268, 273, 57);
		textDireccion.setToolTipText("Ingresar direccion de domicilio");
		add(textDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(25, 210, 70, 15);
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblTelefono);
		
		textTelefono_4 = new JTextField();
		textTelefono_4.setBounds(82, 207, 121, 19);
		textTelefono_4.setToolTipText("ingresar numero de telefono");
		textTelefono_4.setColumns(10);
		add(textTelefono_4);
		
		JLabel lblSexo_1 = new JLabel("Sexo:");
		lblSexo_1.setBounds(25, 184, 70, 15);
		lblSexo_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblSexo_1);
		
		JRadioButton rdbtnHombre_1 = new JRadioButton("Hombre");
		rdbtnHombre_1.setActionCommand("Hombre");
		rdbtnHombre_1.setBounds(82, 180, 70, 23);
		add(rdbtnHombre_1);
		
		//representa el botton de mujer en la seleccion de sexo
		JRadioButton rdbtnMujer_1 = new JRadioButton("Mujer");
		rdbtnMujer_1.setActionCommand("Mujer"); ////Tuve que anadir esta linea para poder ingresar este dato en la base de datos *K
		rdbtnMujer_1.setBounds(154, 180, 70, 23);
		add(rdbtnMujer_1);
		
		//selector del dia de nacimiento
		JSpinner spinnerDia_1 = new JSpinner();
		spinnerDia_1.setBounds(35, 152, 37, 20);
		spinnerDia_1.setToolTipText("Ingresar dia de nacimiento");
		spinnerDia_1.setForeground(SystemColor.menu);
		add(spinnerDia_1);
		
		//Etiqueta que indica el formato de como se introduce la fecha de nacimiento
		JLabel lblNacimientoddmmaaaa_1 = new JLabel("Fecha de nacimiento (dd/mm/aaaa):");
		lblNacimientoddmmaaaa_1.setBounds(25, 110, 218, 44);
		lblNacimientoddmmaaaa_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblNacimientoddmmaaaa_1);
		
		//Selector del mes de nacimiento del miembro
		JComboBox cBoxMes = new JComboBox();
		cBoxMes.setBounds(82, 151, 89, 22);
		cBoxMes.setToolTipText("Elegir mes de nacimiento\r\n");
		cBoxMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		add(cBoxMes);
		
		
		//Selector del anio de nacimiento del miembro
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
		
		//Etiqueta que representa el estado civil del miembro *K
		JLabel lblEstadoCivil_1 = new JLabel("Estado civil:");
		lblEstadoCivil_1.setBounds(224, 184, 77, 14);
		lblEstadoCivil_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblEstadoCivil_1);
		
		//representa el boton de soltero en el programa
		JRadioButton rdbtnSoltero_1 = new JRadioButton("Soltero");
		rdbtnSoltero_1.setActionCommand("Soltero"); //Tuve que anadir esta linea para poder ingresar este dato en la base de datos *K
		rdbtnSoltero_1.setBounds(302, 180, 70, 23);
		add(rdbtnSoltero_1);
		
        // representa el boton de casado en el programa
		JRadioButton rdbtnCasado_1 = new JRadioButton("Casado");
		rdbtnCasado_1.setActionCommand("Casado"); //Tuve que anadir esta linea para poder ingresar este dato en la base de datos *K
		rdbtnCasado_1.setBounds(374, 180, 73, 23);
		add(rdbtnCasado_1);
		
		//Este objeto permite que solo se pueda elegir una opcion en el panel de los casados * K
		ButtonGroup grupoCivil = new ButtonGroup();
		grupoCivil.add(rdbtnCasado_1);
		grupoCivil.add(rdbtnSoltero_1);
		
		//Este objeto permite que solo se pueda elegir una opcion el panel de sexo, tambien ayuda a ver cual esta checado *K
		ButtonGroup grupoSexo = new ButtonGroup();
		grupoSexo.add(rdbtnHombre_1);
		grupoSexo.add(rdbtnMujer_1);
		
		JButton btnGuardar = new JButton("Terminar");
		btnGuardar.setBounds(483, 346, 89, 23);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer dia = Integer.parseInt(spinnerDia_1.getValue().toString()); //Para convertir el valor del spinner de dias en int *K
				Integer año = Integer.parseInt(spinnerAño.getValue().toString()); //para convertir el valor del spinner de anio en int *K
				String civil = grupoCivil.getSelection().getActionCommand(); //variable para almacenar valor estado civil *K
				String sexo = grupoSexo.getSelection().getActionCommand(); //variable para almacenar valor sexo del miembro *K
				//el metodo de abajo conecta con la base de datos e inserta los datos en la base de datos
				
				if(cBoxTipo_de_Cuenta.getSelectedItem().toString().equals("Ahorro")) { //determina si la cuenta sera de ahorro u  otro tipo
					Conexion.insertarDatosAhorro(textNombre.getText(), textCedula.getText(), textApellidos.getText(), dia, cBoxMes.getSelectedItem().toString(),año, sexo, civil, textCorreo.getText(), textTelefono_4.getText(), textDireccion.getText());
				} else if (cBoxTipo_de_Cuenta.getSelectedItem().toString().equals("Credito")) {
					Conexion.insertarDatosCredito(textNombre.getText(), textCedula.getText(), textApellidos.getText(), dia, cBoxMes.getSelectedItem().toString(),año, sexo, civil, textCorreo.getText(), textTelefono_4.getText(), textDireccion.getText());
				} else if (cBoxTipo_de_Cuenta.getSelectedItem().toString().equals("Aportaciones")) {
					Conexion.insertarDatosAportaciones(textNombre.getText(), textCedula.getText(), textApellidos.getText(), dia, cBoxMes.getSelectedItem().toString(),año, sexo, civil, textCorreo.getText(), textTelefono_4.getText(), textDireccion.getText());
				} else {
					Conexion.insertarDatosJuvenil(textNombre.getText(), textCedula.getText(), textApellidos.getText(), dia, cBoxMes.getSelectedItem().toString(),año, sexo, civil, textCorreo.getText(), textTelefono_4.getText(), textDireccion.getText());
				}

				JOptionPane.showMessageDialog(null, "Registro completado", "", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		add(btnGuardar);
		
		

		

		
		

		
		
	
	}
}
