package aplicacion2;


import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class EliminarCuenta extends JPanel {
	private JTextField textCuenta;
	private JTextField textNombre;
	private JTextField textTipo_de_Cuenta;

	/**
	 * Create the panel.
	 */
	public EliminarCuenta() {
		setBackground(SystemColor.menu);
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblCuenta = new JLabel("Cuenta:");
		lblCuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCuenta.setBounds(26, 48, 46, 14);
		add(lblCuenta);
		
		JLabel lblNoRegistro = new JLabel("No. de registro:");
		lblNoRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNoRegistro.setBounds(412, 11, 89, 15);
		add(lblNoRegistro);
		
		JFormattedTextField fTextRegistro = new JFormattedTextField();
		fTextRegistro.setBackground(SystemColor.menu);
		fTextRegistro.setBounds(500, 8, 72, 20);
		add(fTextRegistro);
		
		textCuenta = new JTextField();
		textCuenta.setBounds(80, 45, 105, 20);
		add(textCuenta);
		textCuenta.setColumns(10);
		
		JLabel lblComentario = new JLabel("Comentario:");
		lblComentario.setBounds(26, 271, 65, 14);
		add(lblComentario);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(92, 271, 186, 81);
		add(textArea);
		
		JLabel lblTitulo = new JLabel("ELIMINAR CUENTA");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitulo.setBounds(25, 11, 121, 15);
		add(lblTitulo);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(485, 346, 89, 23);
		add(btnCancelar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Registro eliminado", "", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnEliminar.setBounds(393, 346, 89, 23);
		add(btnEliminar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(26, 73, 55, 20);
		add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(88, 73, 105, 20);
		add(textNombre);
		
		JLabel lblTipo_de_Cuenta = new JLabel("Tipo de cuenta:");
		lblTipo_de_Cuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipo_de_Cuenta.setBounds(26, 103, 105, 20);
		add(lblTipo_de_Cuenta);
		
		textTipo_de_Cuenta = new JTextField();
		textTipo_de_Cuenta.setColumns(10);
		textTipo_de_Cuenta.setBounds(126, 103, 105, 20);
		add(textTipo_de_Cuenta);

	}
}
