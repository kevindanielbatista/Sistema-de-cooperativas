package aplicacion;

import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Rectangle;
import javax.swing.JLabel;

public class ReclamacionesPendientes extends JPanel {

	/**
	 * Create the panel.
	 */
	public ReclamacionesPendientes() {
		setBounds(new Rectangle(0, 81, 584, 380));
		setBackground(SystemColor.window);
		setLayout(null);
		
		JLabel lblReclamacionesPendientes = new JLabel("RECLAMACIONES PENDIENTES");
		lblReclamacionesPendientes.setBounds(10, 25, 173, 14);
		add(lblReclamacionesPendientes);

	}

}
