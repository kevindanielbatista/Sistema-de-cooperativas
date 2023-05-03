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

public class RetenerCuenta extends JPanel {
	private JTextField textCuenta;
	private JTextField textNombre;
	private JTextField textTipo_de_Cuenta;

	/**
	 * Create the panel.
	 */
	public RetenerCuenta() {
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
		
		JFormattedTextField fTextRegistro = new JFormattedTextField();
		fTextRegistro.setBackground(SystemColor.menu);
		fTextRegistro.setBounds(502, 8, 72, 20);
		add(fTextRegistro);
		
		textCuenta = new JTextField();
		textCuenta.setColumns(10);
		textCuenta.setBounds(82, 45, 105, 20);
		add(textCuenta);
		
		JLabel lblComentario = new JLabel("Comentario:");
		lblComentario.setBounds(28, 271, 65, 14);
		add(lblComentario);
		
		JTextArea textComentario = new JTextArea();
		textComentario.setBounds(94, 271, 186, 81);
		add(textComentario);
		
		JLabel lblRetenerCuenta = new JLabel("RETENER CUENTA");
		lblRetenerCuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRetenerCuenta.setBounds(27, 11, 121, 15);
		add(lblRetenerCuenta);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(28, 73, 55, 20);
		add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(90, 73, 105, 20);
		add(textNombre);
		
		JLabel lblTipo_de_Cuenta = new JLabel("Tipo de cuenta:");
		lblTipo_de_Cuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipo_de_Cuenta.setBounds(28, 103, 105, 20);
		add(lblTipo_de_Cuenta);
		
		textTipo_de_Cuenta = new JTextField();
		textTipo_de_Cuenta.setColumns(10);
		textTipo_de_Cuenta.setBounds(128, 103, 105, 20);
		add(textTipo_de_Cuenta);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(485, 346, 89, 23);
		add(btnCancelar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(390, 346, 89, 23);
		add(btnGuardar);

	}

}
