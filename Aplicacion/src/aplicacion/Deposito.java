package aplicacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposito extends JPanel {
	private JTextField cuentaTexto;
	private JTextField montoTexto;

	/**
	 * Create the panel.
	 */
	public Deposito() {
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
		
		cuentaTexto = new JTextField();
		cuentaTexto.setColumns(10);
		cuentaTexto.setBounds(82, 45, 105, 20);
		add(cuentaTexto);
		
		JLabel lblComentario = new JLabel("Comentario:");
		lblComentario.setBounds(28, 271, 65, 14);
		add(lblComentario);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(94, 271, 186, 81);
		add(textArea);
		
		JLabel lblDeposito = new JLabel("DEPOSITO");
		lblDeposito.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeposito.setBounds(27, 11, 121, 15);
		add(lblDeposito);
		
		JButton btnTerminar = new JButton("Terminar");
		btnTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Conexion.depositar(cuentaTexto.getText(),(Double.parseDouble(montoTexto.getText())));
				JOptionPane.showMessageDialog(null, "Deposito realizado", "", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnTerminar.setBounds(485, 346, 89, 23);
		add(btnTerminar);
		
		JLabel lblMonto = new JLabel("Monto");
		lblMonto.setBounds(23, 74, 70, 15);
		add(lblMonto);
		
		montoTexto = new JTextField();
		montoTexto.setBounds(82, 77, 114, 19);
		add(montoTexto);
		montoTexto.setColumns(10);

	}
}
