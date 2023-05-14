package aplicacion;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CuentasAhorro extends JPanel {
	private JTextField textoCuenta;

	public CuentasAhorro () {
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblCuenta = new JLabel("Cuenta");
		lblCuenta.setBounds(26, 31, 70, 15);
		add(lblCuenta);
		
		textoCuenta = new JTextField();
		textoCuenta.setBounds(89, 29, 114, 19);
		add(textoCuenta);
		textoCuenta.setColumns(10);
		
		JButton verCuenta = new JButton("Ver cuenta");
		verCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cuenta = Conexion.mostrarCuentaAhorro(textoCuenta.getText());
				JOptionPane.showMessageDialog(null, cuenta, "", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		verCuenta.setBounds(317, 328, 117, 25);
		add(verCuenta);
	}
}
