package aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JMenu;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("SISTEMA DE COOPERATIVA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenu mnTRANSACCIONES = new JMenu("TRANSACCIONES");
		mnTRANSACCIONES.setBounds(0, 27, 115, 26);
		contentPane.add(mnTRANSACCIONES);
		
		JMenu mnDEBITO = new JMenu("DEBITO");
		mnTRANSACCIONES.add(mnDEBITO);
		
		JMenu mnREGISTRO = new JMenu("REGISTRO");
		mnREGISTRO.setBounds(0, 0, 115, 26);
		contentPane.add(mnREGISTRO);
		
		JMenu mnCUENTAS = new JMenu("CUENTAS");
		mnREGISTRO.add(mnCUENTAS);
	}
}
