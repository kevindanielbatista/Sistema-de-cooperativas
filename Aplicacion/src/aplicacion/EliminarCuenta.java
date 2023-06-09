package aplicacion;

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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class EliminarCuenta extends JPanel {
	private JTextField textoCuenta;

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
		
		textoCuenta = new JTextField();
		textoCuenta.setBounds(80, 45, 105, 20);
		add(textoCuenta);
		textoCuenta.setColumns(10);
		
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
		
		JComboBox cboxTipoCuenta = new JComboBox();
		cboxTipoCuenta.setModel(new DefaultComboBoxModel(new String[] {"Ahorro.", "Credito.", "Aportaciones.", "Juvenil."}));
		cboxTipoCuenta.setToolTipText("Elegir tipo de cuenta");
		cboxTipoCuenta.setBounds(327, 42, 82, 24);
		add(cboxTipoCuenta);
		
		JButton btnTerminar_1 = new JButton("Terminar");
		btnTerminar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//debuggeo
				//System.out.println(cboxTipoCuenta.getSelectedItem().toString()); esta linea es util para depurar
				
				if (cboxTipoCuenta.getSelectedItem().toString().equals("Ahorro.")) {
					Conexion.borrarAhorro(textoCuenta.getText());					
				} else if (cboxTipoCuenta.getSelectedItem().toString().equals("Credito.")) {
					Conexion.borrarCredito(textoCuenta.getText());
				} else if (cboxTipoCuenta.getSelectedItem().toString().equals("Juvenil.")) {
					Conexion.borrarJuvenil(textoCuenta.getText());
				} else {
					Conexion.borrarAportaciones(textoCuenta.getText());
				}
				JOptionPane.showMessageDialog(null, "Registro eliminado", "", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnTerminar_1.setBounds(483, 346, 89, 23);
		add(btnTerminar_1);
		

	}
}
