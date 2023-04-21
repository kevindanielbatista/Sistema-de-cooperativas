package aplicacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

public class Configuracion extends JPanel {

	/**
	 * Create the panel.
	 */
	public Configuracion() {
		setBackground(Color.LIGHT_GRAY);
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblConfiguracion = new JLabel("CONFIGURACION");
		lblConfiguracion.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblConfiguracion.setBounds(26, 11, 121, 15);
		add(lblConfiguracion);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(385, 346, 89, 23);
		add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(484, 346, 89, 23);
		add(btnCancelar);

	}

}
