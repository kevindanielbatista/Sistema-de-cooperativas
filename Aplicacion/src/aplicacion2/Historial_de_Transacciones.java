package aplicacion2;


import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollBar;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

public class Historial_de_Transacciones extends JPanel {
	private JTable tableHTransacciones;

	/**
	 * Create the panel.
	 */
	public Historial_de_Transacciones() {
		setBounds(new Rectangle(0, 81, 580, 380));
		setLayout(null);
		
		JLabel lblHistorialDeTransacciones = new JLabel("Historial de Transacciones");
		lblHistorialDeTransacciones.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHistorialDeTransacciones.setBounds(10, 10, 170, 15);
		add(lblHistorialDeTransacciones);
		
		JLabel lblTipo_de_cuenta = new JLabel("Tipo de Cuenta:");
		lblTipo_de_cuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipo_de_cuenta.setBounds(10, 40, 90, 20);
		add(lblTipo_de_cuenta);
		
		JComboBox cBoxTipo_de_cuenta = new JComboBox();
		cBoxTipo_de_cuenta.setModel(new DefaultComboBoxModel(new String[] {"DEPOSITOS", "RETIROS", "PAGOS"}));
		cBoxTipo_de_cuenta.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cBoxTipo_de_cuenta.setBounds(105, 40, 136, 20);
		add(cBoxTipo_de_cuenta);
		
		JLabel lblFechaInicial = new JLabel("Desde");
		lblFechaInicial.setBounds(105, 70, 75, 20);
		add(lblFechaInicial);
		
		JSpinner FechaInicial = new JSpinner();
		FechaInicial.setModel(new SpinnerDateModel(new Date(1682481600000L), null, null, Calendar.DAY_OF_YEAR));
		FechaInicial.setBounds(290, 70, 90, 20);
		add(FechaInicial);
		
		JLabel lblFechaFinal = new JLabel("hasta");
		lblFechaFinal.setBounds(250, 70, 70, 20);
		add(lblFechaFinal);
		
		JSpinner FechaFinal = new JSpinner();
		FechaFinal.setModel(new SpinnerDateModel(new Date(1682481600000L), null, null, Calendar.DAY_OF_YEAR));
		FechaFinal.setBounds(145, 70, 90, 20);
		add(FechaFinal);
		
		JButton btnBusqueda = new JButton("Buscar");
		btnBusqueda.setBounds(490, 70, 79, 23);
		add(btnBusqueda);
		
		JPanel contenido = new JPanel();
		contenido.setLayout(null);
		contenido.setBackground(Color.WHITE);
		contenido.setBounds(10, 95, 563, 240);
		add(contenido);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBackground(SystemColor.scrollbar);
		scrollBar.setBounds(542, 0, 20, 240);
		contenido.add(scrollBar);
		
		tableHTransacciones = new JTable();
		tableHTransacciones.setModel(new DefaultTableModel(
			new Object[][] {
				{"TRANSACCION", "CUENTA", "MONTO", "FECHA/HORA", "COMENTARIO"},
			},
			new String[] {
				"TRANSACCION", "CUENTA", "MONTO", "FECHA/HORA", "COMENTARIO"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, Integer.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				true, true, true, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tableHTransacciones.getColumnModel().getColumn(0).setResizable(false);
		tableHTransacciones.getColumnModel().getColumn(0).setPreferredWidth(115);
		tableHTransacciones.getColumnModel().getColumn(1).setResizable(false);
		tableHTransacciones.getColumnModel().getColumn(2).setResizable(false);
		tableHTransacciones.getColumnModel().getColumn(3).setResizable(false);
		tableHTransacciones.getColumnModel().getColumn(3).setPreferredWidth(107);
		tableHTransacciones.getColumnModel().getColumn(4).setResizable(false);
		tableHTransacciones.getColumnModel().getColumn(4).setPreferredWidth(324);
		tableHTransacciones.setName("");
		tableHTransacciones.setLocale(new Locale("es", "DO"));
		tableHTransacciones.setForeground(Color.BLACK);
		tableHTransacciones.setFont(new Font("Tahoma", Font.BOLD, 10));
		tableHTransacciones.setBorder(new LineBorder(new Color(0, 0, 0)));
		tableHTransacciones.setBackground(Color.WHITE);
		tableHTransacciones.setBounds(0, 0, 542, 240);
		contenido.add(tableHTransacciones);
		
		JButton btnTerminar = new JButton("Descargar\r\n");
		btnTerminar.setBounds(395, 350, 90, 23);
		add(btnTerminar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(490, 350, 79, 23);
		add(btnEliminar);

	}
}
