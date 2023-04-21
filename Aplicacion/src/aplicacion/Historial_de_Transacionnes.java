package aplicacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;

public class Historial_de_Transacionnes extends JPanel {

	/**
	 * Create the panel.
	 */
	public Historial_de_Transacionnes() {
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblHistorialDeRegistros = new JLabel("Historial de Registros");
		lblHistorialDeRegistros.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHistorialDeRegistros.setBounds(27, 11, 131, 15);
		add(lblHistorialDeRegistros);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(224, 70, 46, 14);
		add(lblNewLabel);
		
		JButton btnTerminar = new JButton("Terminar");
		btnTerminar.setBounds(485, 346, 89, 23);
		add(btnTerminar);
		
		JSpinner FechaInicial = new JSpinner();
		FechaInicial.setModel(new SpinnerDateModel(new Date(1681963200000L), new Date(1681963200000L), new Date(1681963200000L), Calendar.DAY_OF_YEAR));
		FechaInicial.setBounds(280, 67, 60, 20);
		add(FechaInicial);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 46, 14);
		add(lblNewLabel_1);
		
		JSpinner FechaFinal = new JSpinner();
		FechaFinal.setModel(new SpinnerDateModel(new Date(1681963200000L), null, null, Calendar.DAY_OF_YEAR));
		FechaFinal.setBounds(445, 67, 60, 20);
		add(FechaFinal);

	}

}
