package aplicacion;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro extends JPanel {
	private JTextField textoCuenta;
	private JTextField textoMonto;

	/**
	 * Create the panel.
	 */
	public Retiro() {
		setBackground(SystemColor.menu);
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblCuenta = new JLabel("Cuenta:");
		lblCuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCuenta.setBounds(23, 48, 65, 14);
		add(lblCuenta);
		
		JLabel lblNoRegistro = new JLabel("No. de registro:");
		lblNoRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNoRegistro.setBounds(414, 11, 89, 15);
		add(lblNoRegistro);
		
		textoCuenta = new JTextField();
		textoCuenta.setColumns(10);
		textoCuenta.setBounds(124, 45, 105, 20);
		add(textoCuenta);
		
		JLabel lblComentario = new JLabel("Comentario:");
		lblComentario.setBounds(28, 271, 65, 14);
		add(lblComentario);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(94, 271, 186, 81);
		add(textArea);
		
		JLabel lblDeposito = new JLabel("RETIRO");
		lblDeposito.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeposito.setBounds(27, 11, 121, 15);
		add(lblDeposito);
		
		JComboBox cBoxTipo_de_Cuenta = new JComboBox();
		cBoxTipo_de_Cuenta.setModel(new DefaultComboBoxModel(new String[] {"Ahorro", "Credito", "Aportaciones", "Juvenil"}));
		cBoxTipo_de_Cuenta.setToolTipText("Elegir tipo de cuenta");
		cBoxTipo_de_Cuenta.setBounds(339, 48, 89, 22);
		add(cBoxTipo_de_Cuenta);
		
		JButton btnTerminar = new JButton("Retirar");
		btnTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (cBoxTipo_de_Cuenta.getSelectedItem().toString().equals("Ahorro")) {
					Conexion.retirarAhorro(textoCuenta.getText(), Double.parseDouble(textoMonto.getText()));					
				} else if (cBoxTipo_de_Cuenta.getSelectedItem().toString().equals("Credito")) {
					Conexion.retirarCredito(textoCuenta.getText(), Double.parseDouble(textoMonto.getText()));	
				} else if (cBoxTipo_de_Cuenta.getSelectedItem().toString().equals("Juvenil")) {
					Conexion.retirarJuvenil(textoCuenta.getText(), Double.parseDouble(textoMonto.getText()));						
				} else {
					Conexion.retirarAportaciones(textoCuenta.getText(), Double.parseDouble(textoMonto.getText()));						
				}
				JOptionPane.showMessageDialog(null, "Retiro realizado", "", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnTerminar.setBounds(485, 346, 89, 23);
		add(btnTerminar);
		
		JLabel lblMonto = new JLabel("Monto:");
		lblMonto.setBounds(23, 78, 70, 15);
		add(lblMonto);
		
		textoMonto = new JTextField();
		textoMonto.setBounds(124, 77, 105, 19);
		add(textoMonto);
		textoMonto.setColumns(10);

	}
}
