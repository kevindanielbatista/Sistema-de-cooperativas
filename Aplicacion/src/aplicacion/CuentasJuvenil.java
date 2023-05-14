package aplicacion;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CuentasJuvenil extends JPanel {
	private JTextField textField;

	public CuentasJuvenil() {
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cuenta");
		lblNewLabel.setBounds(28, 27, 70, 15);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(146, 25, 114, 19);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ver cuenta");
		btnNewButton.setBounds(336, 328, 117, 25);
		add(btnNewButton);
	}
}

