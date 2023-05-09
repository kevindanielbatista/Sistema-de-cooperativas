package aplicacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Prestamo extends JPanel {
	private JTextField TextCuenta;
	private JTextField TextCedula;
	private JTextField TextMonto;
	private JTextField TextNombre;
	private JTextField TextCuota;
	private JTextField TextApellidos;
	private JTextField TextMonto_adeudado;
	private JTextField TextMonto_a_pagar;
	private JTextField TextTipo_de_prestamo;
	private JTable table;
	private JTable tableDetalles;

	/**
	 * Create the panel.
	 */
	public Prestamo() {
		setBackground(SystemColor.menu);
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblNoRegistro = new JLabel("No. de registro:");
		lblNoRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNoRegistro.setBounds(414, 14, 89, 15);
		add(lblNoRegistro);
		
		JLabel lblPrestamo = new JLabel("PRESTAMO");
		lblPrestamo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrestamo.setBounds(15, 24, 121, 15);
		add(lblPrestamo);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(10, 40, 485, 20);
		add(separator);
		
		JLabel lblRD$ = new JLabel("RD$:");
		lblRD$.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRD$.setBackground(Color.WHITE);
		lblRD$.setBounds(78, 141, 46, 20);
		add(lblRD$);
		
		JLabel lblCuenta = new JLabel("Cuenta:");
		lblCuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCuenta.setBounds(10, 50, 46, 20);
		add(lblCuenta);
		
		TextCuenta = new JTextField();
		TextCuenta.setColumns(10);
		TextCuenta.setBounds(72, 50, 105, 20);
		add(TextCuenta);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCedula.setBounds(265, 50, 46, 20);
		add(lblCedula);
		
		TextCedula = new JTextField();
		TextCedula.setColumns(10);
		TextCedula.setBounds(314, 50, 105, 20);
		add(TextCedula);
		
		JLabel lblMonto = new JLabel("monto:");
		lblMonto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMonto.setBounds(10, 141, 46, 20);
		add(lblMonto);
		
		TextMonto = new JTextField();
		TextMonto.setHorizontalAlignment(SwingConstants.RIGHT);
		TextMonto.setColumns(10);
		TextMonto.setBounds(72, 141, 105, 20);
		add(TextMonto);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(10, 80, 55, 20);
		add(lblNombre);
		
		TextNombre = new JTextField();
		TextNombre.setColumns(10);
		TextNombre.setBounds(72, 80, 105, 20);
		add(TextNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellidos.setBounds(10, 110, 80, 20);
		add(lblApellidos);
		
		TextCuota = new JTextField();
		TextCuota.setColumns(10);
		TextCuota.setBounds(314, 80, 105, 20);
		add(TextCuota);
		
		JLabel lblTipo_de_Cuenta = new JLabel("Cuota:");
		lblTipo_de_Cuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipo_de_Cuenta.setBounds(270, 80, 60, 20);
		add(lblTipo_de_Cuenta);
		
		TextApellidos = new JTextField();
		TextApellidos.setColumns(10);
		TextApellidos.setBounds(72, 110, 105, 20);
		add(TextApellidos);
		
		JLabel lblMonto_Adeudado = new JLabel("Monto adeudado:");
		lblMonto_Adeudado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMonto_Adeudado.setBounds(207, 113, 105, 14);
		add(lblMonto_Adeudado);
		
		TextMonto_adeudado = new JTextField();
		TextMonto_adeudado.setBounds(314, 110, 105, 20);
		add(TextMonto_adeudado);
		TextMonto_adeudado.setColumns(10);
		
		JLabel lblTipo_de_prestamo = new JLabel("Tipo de prestamo");
		lblTipo_de_prestamo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipo_de_prestamo.setBounds(435, 53, 139, 14);
		add(lblTipo_de_prestamo);
		
		TextTipo_de_prestamo = new JTextField();
		TextTipo_de_prestamo.setBounds(435, 80, 139, 20);
		add(TextTipo_de_prestamo);
		TextTipo_de_prestamo.setColumns(10);
		
		JLabel lblMonto_a_Pagar = new JLabel("Monto a pagar:");
		lblMonto_a_Pagar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMonto_a_Pagar.setBounds(220, 144, 105, 14);
		add(lblMonto_a_Pagar);
		
		TextMonto_a_pagar = new JTextField();
		TextMonto_a_pagar.setColumns(10);
		TextMonto_a_pagar.setBounds(314, 141, 105, 20);
		add(TextMonto_a_pagar);
		
		JLabel lblComentario = new JLabel("Comentario:");
		lblComentario.setBounds(435, 185, 80, 14);
		add(lblComentario);
		
		JTextArea textComentario = new JTextArea();
		textComentario.setBounds(432, 210, 142, 109);
		add(textComentario);
		
		JLabel lblDetalles_del_prestamo = new JLabel("DETALLES");
		lblDetalles_del_prestamo.setFont(new Font("Times New Roman", Font.BOLD, 10));
		lblDetalles_del_prestamo.setBounds(15, 190, 75, 14);
		add(lblDetalles_del_prestamo);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 205, 409, 20);
		add(separator_1);
		
		tableDetalles = new JTable();
		tableDetalles.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Cuota", "Pago Mensual", "Interes Mensual", "Pago Total"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Float.class, Float.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableDetalles.getColumnModel().getColumn(0).setResizable(false);
		tableDetalles.getColumnModel().getColumn(1).setResizable(false);
		tableDetalles.getColumnModel().getColumn(2).setResizable(false);
		tableDetalles.setBounds(11, 210, 408, 128);
		add(tableDetalles);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(389, 349, 89, 23);
		add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(485, 349, 89, 23);
		add(btnCancelar);
		
		JFormattedTextField fTextRegistro = new JFormattedTextField();
		fTextRegistro.setBackground(SystemColor.menu);
		fTextRegistro.setBounds(502, 11, 72, 20);
		add(fTextRegistro);

	}
}
