package aplicacion;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CuentasAhorro extends JPanel {
	private JTextField textField;

	public CuentasAhorro () {
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblCuenta = new JLabel("Cuenta");
		lblCuenta.setBounds(26, 31, 70, 15);
		add(lblCuenta);
		
		textField = new JTextField();
		textField.setBounds(89, 29, 114, 19);
		add(textField);
		textField.setColumns(10);
		
		JButton verCuenta = new JButton("Ver cuenta");
		verCuenta.setBounds(317, 328, 117, 25);
		add(verCuenta);
	}
}
