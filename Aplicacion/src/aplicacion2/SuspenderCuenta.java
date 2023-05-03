package aplicacion2;


import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.SystemColor;

public class SuspenderCuenta extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public SuspenderCuenta() {
		setBackground(SystemColor.menu);
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblCuenta = new JLabel("Cuenta:");
		lblCuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCuenta.setBounds(28, 48, 46, 14);
		add(lblCuenta);
		
		JLabel lblNoRegistro = new JLabel("No. de registro:");
		lblNoRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNoRegistro.setBounds(414, 11, 89, 15);
		add(lblNoRegistro);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(82, 45, 105, 20);
		add(textField);
		
		JLabel lblComentario = new JLabel("Comentario:");
		lblComentario.setBounds(28, 271, 65, 14);
		add(lblComentario);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(94, 271, 186, 81);
		add(textArea);
		
		JLabel lblSuspenderCuenta = new JLabel("SUSPENDER CUENTA");
		lblSuspenderCuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSuspenderCuenta.setBounds(27, 11, 121, 15);
		add(lblSuspenderCuenta);
		
		JButton btnTerminar_1 = new JButton("Terminar");
		btnTerminar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cuenta Suspendida", "", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnTerminar_1.setBounds(485, 346, 89, 23);
		add(btnTerminar_1);

	}

}
