package aplicacion;

import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CuentasJuvenil extends JPanel {
	private JTextField textoCuenta;

	public CuentasJuvenil() {
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cuenta");
		lblNewLabel.setBounds(28, 27, 70, 15);
		add(lblNewLabel);
		
		textoCuenta = new JTextField();
		textoCuenta.setBounds(146, 25, 114, 19);
		add(textoCuenta);
		textoCuenta.setColumns(10);
		
		JButton verCuenta = new JButton("Ver cuenta");
		verCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cuenta = Conexion.mostrarCuentaJuvenil(textoCuenta.getText());
				JOptionPane.showMessageDialog(null, cuenta, "", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		verCuenta.setBounds(330, 332, 117, 25);
		add(verCuenta);
	}
}

