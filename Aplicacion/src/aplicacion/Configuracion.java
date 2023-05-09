package aplicacion;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Configuracion extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configuracion frame = new Configuracion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the panel.
	 */
	
	public Configuracion() {
		getContentPane().setBackground(SystemColor.controlShadow);
		setTitle("CONFIGURACION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(310, 320, 80, 25);
		getContentPane().add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(394, 320, 80, 25);
		getContentPane().add(btnCancelar);

	}

}
