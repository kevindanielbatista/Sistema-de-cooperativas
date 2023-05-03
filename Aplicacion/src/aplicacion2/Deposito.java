package aplicacion2;


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
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class Deposito extends JPanel {
	private JTextField textNombre;
	private JTextField textCuenta;
	private JTextField textTipo_de_Cuenta;
	private JTextField txtMonto;

	/**
	 * Create the panel.
	 */
	public Deposito() {
		setBackground(SystemColor.menu);
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblCuenta = new JLabel("Cuenta:");
		lblCuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCuenta.setBounds(20, 45, 46, 20);
		add(lblCuenta);
		
		textCuenta = new JTextField();
		textCuenta.setColumns(10);
		textCuenta.setBounds(82, 45, 105, 20);
		add(textCuenta);
		
		JLabel lblMonto = new JLabel("monto:");
		lblMonto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMonto.setBounds(255, 45, 46, 20);
		add(lblMonto);
		
		txtMonto = new JTextField();
		txtMonto.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMonto.setText("RD$:");
		txtMonto.setColumns(10);
		txtMonto.setBounds(308, 45, 105, 20);
		add(txtMonto);
		
		JLabel lblNoRegistro = new JLabel("No. de registro:");
		lblNoRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNoRegistro.setBounds(414, 11, 89, 20);
		add(lblNoRegistro);
		
		JFormattedTextField fTextRegistro = new JFormattedTextField();
		fTextRegistro.setBackground(SystemColor.control);
		fTextRegistro.setBounds(502, 11, 72, 20);
		add(fTextRegistro);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(20, 75, 55, 20);
		add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(82, 75, 105, 20);
		add(textNombre);
		
		JLabel lblTipo_de_Cuenta = new JLabel("Tipo de cuenta:");
		lblTipo_de_Cuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipo_de_Cuenta.setBounds(20, 105, 105, 20);
		add(lblTipo_de_Cuenta);
		
		textTipo_de_Cuenta = new JTextField();
		textTipo_de_Cuenta.setColumns(10);
		textTipo_de_Cuenta.setBounds(120, 105, 105, 20);
		add(textTipo_de_Cuenta);
		
		JLabel lblComentario = new JLabel("Comentario:");
		lblComentario.setBounds(28, 271, 65, 14);
		add(lblComentario);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(94, 271, 186, 81);
		add(textArea);
		
		JLabel lblDeposito = new JLabel("DEPOSITO");
		lblDeposito.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeposito.setBounds(20, 11, 121, 15);
		add(lblDeposito);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(390, 346, 89, 23);
		add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(485, 346, 89, 23);
		add(btnCancelar);

	}
}
