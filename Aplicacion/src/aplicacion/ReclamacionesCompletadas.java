package aplicacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.SystemColor;
import javax.swing.JLabel;

public class ReclamacionesCompletadas extends JPanel {

	/**
	 * Create the panel.
	 */
	public ReclamacionesCompletadas() {
		setBackground(SystemColor.window);
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblReclamacionesCompletadas = new JLabel("RECLAMACIONES COMPLETADAS");
		lblReclamacionesCompletadas.setBounds(10, 25, 225, 20);
		add(lblReclamacionesCompletadas);

	}

}
