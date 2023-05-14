package aplicacion;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CuentasAportaciones extends JPanel {
	private JTextField textField;

	public CuentasAportaciones() {
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblCuenta = new JLabel("Cuenta");
		lblCuenta.setBounds(12, 32, 70, 15);
		add(lblCuenta);
		
		textField = new JTextField();
		textField.setBounds(112, 30, 114, 19);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ver cuenta");
		btnNewButton.setBounds(329, 319, 117, 25);
		add(btnNewButton);
	}
}

