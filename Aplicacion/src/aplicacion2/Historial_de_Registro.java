package aplicacion2;


import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JList;
import javax.swing.SpinnerListModel;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.JScrollBar;
import java.util.Locale;

public class Historial_de_Registro extends JPanel {
	private JTable tRegistro;

	/**
	 * Create the panel.
	 */
	public Historial_de_Registro() {
		setBounds(new Rectangle(0, 81, 580, 380));
		setLayout(null);
		
		JLabel lblHistorialDeRegistros = new JLabel("Historial de Registros");
		lblHistorialDeRegistros.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHistorialDeRegistros.setBounds(10, 11, 131, 15);
		add(lblHistorialDeRegistros);
		
		JLabel lblTipo_de_cuenta = new JLabel("Tipo de Cuenta:");
		lblTipo_de_cuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipo_de_cuenta.setBounds(15, 40, 90, 20);
		add(lblTipo_de_cuenta);
		
		JComboBox cBoxTipo_de_cuenta = new JComboBox();
		cBoxTipo_de_cuenta.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cBoxTipo_de_cuenta.setModel(new DefaultComboBoxModel(new String[] {"CUENTAS AGREGADAS", "CUENTAS ELIMINADAS", "CUENTAS SUSPENDIDAS", "CUENTAS RETENIDAS", "CUENTAS ABANDONADAS"}));
		cBoxTipo_de_cuenta.setBounds(115, 40, 136, 20);
		add(cBoxTipo_de_cuenta);
		
		JLabel lblFechaInicial = new JLabel("Desde");
		lblFechaInicial.setBounds(115, 70, 75, 20);
		add(lblFechaInicial);
		
		JSpinner FechaInicial = new JSpinner();
		FechaInicial.setModel(new SpinnerDateModel(new Date(1681963200000L), null, null, Calendar.YEAR));
		FechaInicial.setBounds(300, 70, 90, 20);
		add(FechaInicial);
		
		JLabel lblFechaFinal = new JLabel("hasta");
		lblFechaFinal.setBounds(260, 70, 70, 20);
		add(lblFechaFinal);
		
		JSpinner FechaFinal = new JSpinner();
		FechaFinal.setModel(new SpinnerDateModel(new Date(1682143078209L), null, null, Calendar.YEAR));
		FechaFinal.setBounds(155, 70, 90, 20);
		add(FechaFinal);
		
		JButton btnBusqueda = new JButton("Buscar");
		btnBusqueda.setBounds(492, 70, 79, 23);
		add(btnBusqueda);
		
		JPanel contenido = new JPanel();
		contenido.setBackground(Color.WHITE);
		contenido.setSize(563, 240);
		contenido.setLocation(10, 97);
		add(contenido);
		contenido.setLayout(null);
		
		tRegistro = new JTable();
		tRegistro.setName("");
		tRegistro.setLocale(new Locale("es", "DO"));
		tRegistro.setFont(new Font("Tahoma", Font.BOLD, 10));
		tRegistro.setForeground(new Color(0, 0, 0));
		tRegistro.setModel(new DefaultTableModel(
			new Object[][] {
				{"REGISTRO", "NOMBRES", "APELLIDOS", "TIPO DE CUENTA", "NO. CUENTA", "FECHA"},
			},
			new String[] {
				"Registro", "Nombre", "Apellidos", "Tipo de Cuenta", "No. de Cuenta", "Fecha "
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tRegistro.getColumnModel().getColumn(0).setResizable(false);
		tRegistro.getColumnModel().getColumn(1).setResizable(false);
		tRegistro.getColumnModel().getColumn(1).setPreferredWidth(130);
		tRegistro.getColumnModel().getColumn(2).setResizable(false);
		tRegistro.getColumnModel().getColumn(2).setPreferredWidth(123);
		tRegistro.getColumnModel().getColumn(3).setResizable(false);
		tRegistro.getColumnModel().getColumn(3).setPreferredWidth(101);
		tRegistro.getColumnModel().getColumn(4).setResizable(false);
		tRegistro.getColumnModel().getColumn(4).setPreferredWidth(107);
		tRegistro.getColumnModel().getColumn(5).setResizable(false);
		tRegistro.getColumnModel().getColumn(5).setPreferredWidth(124);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBackground(new Color(200, 200, 200));
		scrollBar.setBounds(542, 0, 20, 240);
		contenido.add(scrollBar);
		tRegistro.setBackground(SystemColor.text);
		tRegistro.setBounds(0, 0, 542, 240);
		tRegistro.setBorder(new LineBorder(new Color(0, 0, 0)));
		contenido.add(tRegistro);
		
		JButton btnTerminar = new JButton("Descargar\r\n");
		btnTerminar.setBounds(394, 348, 90, 23);
		add(btnTerminar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(492, 348, 79, 23);
		add(btnEliminar);

	}
}
