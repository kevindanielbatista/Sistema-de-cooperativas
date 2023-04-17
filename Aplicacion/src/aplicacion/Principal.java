package aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Principal extends JFrame {

	private JPanel VentanaPrincipal;

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
		JFrame frame = new JFrame("Sistema de Cooerativa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 400, 500, 400);
		VentanaPrincipal = new JPanel();
		FlowLayout fl_VentanaPrincipal = (FlowLayout) VentanaPrincipal.getLayout();
		fl_VentanaPrincipal.setAlignment(FlowLayout.LEFT);
		VentanaPrincipal.setForeground(new Color(0, 0, 0));
		VentanaPrincipal.setBackground(new Color(192, 192, 192));
		VentanaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(VentanaPrincipal);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(0, 0, 0));
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		VentanaPrincipal.add(menuBar);
		
		JMenu Inicio = new JMenu("Inicio");
		menuBar.add(Inicio);
		
		JMenuItem Estado = new JMenuItem("Ver estado");
		Inicio.add(Estado);
		
		JMenuItem Transaccion = new JMenuItem("Transacciones");
		Inicio.add(Transaccion);
		
		JMenu Registro = new JMenu("Registro");
		menuBar.add(Registro);
		
		JMenuItem Añadir = new JMenuItem("Añadir registro");
		Registro.add(Añadir);
		
		JMenuItem Eliminar = new JMenuItem("Eliminar registro");
		Registro.add(Eliminar);
		
		JMenu Solicitudes = new JMenu("Solicitudes");
		menuBar.add(Solicitudes);
		
		JMenu Reclamaciones = new JMenu("Reclamaciones");
		menuBar.add(Reclamaciones);
		
		JMenu Historial = new JMenu("Historial");
		menuBar.add(Historial);
		
		JMenu Reportes = new JMenu("Reportes");
		menuBar.add(Reportes);
		
		JMenu Help = new JMenu("Ayuda");
		menuBar.add(Help);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
