package aplicacion;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.SystemColor;

public class Reclamacion extends JPanel {
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textCedula;
	private JTextField textCorreoElectronico;
	private JTextField textRegistro;

	/**
	 * Create the panel.
	 */
	public Reclamacion() {
		setBackground(SystemColor.menu);
		setBounds(new Rectangle(0, 81, 584, 380));
		setLayout(null);
		
		JLabel lblRegistro = new JLabel("Registro:");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRegistro.setBounds(430, 11, 57, 20);
		add(lblRegistro);
		
		JLabel lblReclamacion = new JLabel("NUEVA RECLAMACION");
		lblReclamacion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblReclamacion.setBounds(27, 46, 167, 14);
		add(lblReclamacion);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(27, 63, 500, 2);
		add(separator);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(27, 68, 57, 20);
		add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(89, 68, 150, 20);
		add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApellidos.setBounds(27, 96, 57, 20);
		add(lblApellidos);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(89, 96, 150, 20);
		add(textApellidos);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCedula.setBounds(27, 124, 57, 20);
		add(lblCedula);
		
		textCedula = new JTextField();
		textCedula.setColumns(10);
		textCedula.setBounds(89, 124, 150, 20);
		add(textCedula);
		
		JLabel lblCorreoElectronico = new JLabel("Correo Electronico:");
		lblCorreoElectronico.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCorreoElectronico.setBounds(27, 152, 148, 14);
		add(lblCorreoElectronico);
		
		textCorreoElectronico = new JTextField();
		textCorreoElectronico.setColumns(10);
		textCorreoElectronico.setBounds(27, 170, 212, 20);
		add(textCorreoElectronico);
		
		JLabel lblComentario = new JLabel("Comentario:");
		lblComentario.setBounds(27, 201, 75, 14);
		add(lblComentario);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(27, 216, 500, 124);
		add(textArea);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(438, 346, 89, 23);
		add(btnCancelar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(340, 346, 89, 23);
		add(btnGuardar);
		
		textRegistro = new JTextField();
		textRegistro.setBackground(SystemColor.menu);
		textRegistro.setBounds(488, 11, 86, 20);
		add(textRegistro);
		textRegistro.setColumns(10);

	}
}
