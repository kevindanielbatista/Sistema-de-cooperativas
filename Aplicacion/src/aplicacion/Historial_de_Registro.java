package aplicacion;

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

public class Historial_de_Registro extends JPanel {

	/**
	 * Create the panel.
	 */
	public Historial_de_Registro() {
		setBounds(new Rectangle(0, 81, 580, 380));
		setLayout(null);
		
		JLabel lblHistorialDeRegistros = new JLabel("Historial de Registros");
		lblHistorialDeRegistros.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHistorialDeRegistros.setBounds(23, 11, 131, 15);
		add(lblHistorialDeRegistros);
		
		JLabel lblTipo_de_cuenta = new JLabel("Tipo de Cuenta:");
		lblTipo_de_cuenta.setBounds(23, 37, 79, 20);
		add(lblTipo_de_cuenta);
		
		JComboBox cBoxTipo_de_cuenta = new JComboBox();
		cBoxTipo_de_cuenta.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cBoxTipo_de_cuenta.setModel(new DefaultComboBoxModel(new String[] {"CUENTAS AGREGADAS", "CUENTAS ELIMINADAS", "CUENTAS SUSPENDIDAS", "CUENTAS RETENIDAS", "CUENTAS ABANDONADAS"}));
		cBoxTipo_de_cuenta.setBounds(105, 37, 136, 20);
		add(cBoxTipo_de_cuenta);
		
		JLabel lblFechaInicial = new JLabel("Fecha Inicial:");
		lblFechaInicial.setBounds(350, 37, 66, 20);
		add(lblFechaInicial);
		
		JSpinner FechaInicial = new JSpinner();
		FechaInicial.setModel(new SpinnerDateModel(new Date(1681963200000L), null, null, Calendar.DAY_OF_YEAR));
		FechaInicial.setBounds(420, 63, 60, 20);
		add(FechaInicial);
		
		JLabel lblFechaFinal = new JLabel("Fecha Final:");
		lblFechaFinal.setBounds(350, 66, 66, 20);
		add(lblFechaFinal);
		
		JSpinner FechaFinal = new JSpinner();
		FechaFinal.setModel(new SpinnerDateModel(new Date(1681963200000L), null, null, Calendar.DAY_OF_YEAR));
		FechaFinal.setBounds(420, 37, 60, 20);
		add(FechaFinal);
		
		JButton btnBusqueda = new JButton("Busqueda");
		btnBusqueda.setBounds(491, 62, 79, 23);
		add(btnBusqueda);
		
		JButton btnTerminar = new JButton("Terminar");
		btnTerminar.setBounds(481, 346, 89, 23);
		add(btnTerminar);

	}
}
