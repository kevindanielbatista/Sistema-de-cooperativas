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
import javax.swing.JCheckBoxMenuItem;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import java.awt.Label;
import java.awt.Button;
import java.awt.Font;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Panel;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import java.awt.Rectangle;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Button btnCerrarSesion;

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
		contentPane.setBackground(new Color(0, 210, 105));
		contentPane.setBorder(new EmptyBorder(5, 2, 5, 2));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		desktopPane.setBounds(20, 114, 519, 332);
		contentPane.add(desktopPane);
		
		JTextPane textIntroduccion = new JTextPane();
		textIntroduccion.setText("BIENVENIDO!!\r\n\r\nEste es un sistema de gestion bancaria para cooperativas de Ahorros y creditos.\r\n");
		textIntroduccion.setBounds(21, 28, 158, 157);
		desktopPane.add(textIntroduccion);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 255, 255));
		menuBar.setBounds(20, 60, 754, 43);
		contentPane.add(menuBar);
		
		JMenu mnRegistro = new JMenu("REGISTRO");
		menuBar.add(mnRegistro);
		
		JMenu mnCUENTAS = new JMenu("CUENTAS");
		mnRegistro.add(mnCUENTAS);
		
		JMenuItem mntmAgregarCuenta = new JMenuItem("AGREGAR CUENTA");
		mnCUENTAS.add(mntmAgregarCuenta);
		
		JMenuItem mntmeEliminarCuenta = new JMenuItem("ELIMINAR CUENTA");
		mnCUENTAS.add(mntmeEliminarCuenta);
		
		JMenuItem mntmSuspenderCuenta = new JMenuItem("SUSPENDER CUENTA");
		mnCUENTAS.add(mntmSuspenderCuenta);
		
		JMenuItem mntmRetenerCuenta = new JMenuItem("RETENER CUENTA");
		mnCUENTAS.add(mntmRetenerCuenta);
		
		JMenu mnTransacciones = new JMenu("TRANSACCIONES");
		menuBar.add(mnTransacciones);
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnTransacciones.add(mnNewMenu);
		
		JMenu mnHistorial = new JMenu("HISTORIAL");
		menuBar.add(mnHistorial);
		
		JMenu mnReclamaciones = new JMenu("RECLAMACIONES");
		menuBar.add(mnReclamaciones);
		
		JCheckBoxMenuItem chckbxmntmPerdida = new JCheckBoxMenuItem("Perdida");
		mnReclamaciones.add(chckbxmntmPerdida);
		
		JMenu mnReportes = new JMenu("REPORTES");
		menuBar.add(mnReportes);
		
		btnCerrarSesion = new Button("Cerrar Sesion");
		btnCerrarSesion.setForeground(new Color(0, 0, 0));
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login l = new Login();
				l.setVisible(true);
			}
		});
		btnCerrarSesion.setFont(new Font("Arial", Font.BOLD, 12));
		btnCerrarSesion.setBackground(Color.LIGHT_GRAY);
		btnCerrarSesion.setBounds(563, 10, 100, 44);
		contentPane.add(btnCerrarSesion);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.setBounds(20, 10, 354, 43);
		contentPane.add(toolBar);
		
		Button btnAtras = new Button("Atras");
		btnAtras.setBackground(Color.LIGHT_GRAY);
		toolBar.add(btnAtras);
		
		Button btnAdelante = new Button("Adelante\r\n");
		btnAdelante.setFont(null);
		btnAdelante.setForeground(Color.BLACK);
		btnAdelante.setBackground(Color.LIGHT_GRAY);
		toolBar.add(btnAdelante);
		
		Button btnAyuda = new Button("Ayuda");
		btnAyuda.setBackground(Color.LIGHT_GRAY);
		toolBar.add(btnAyuda);
		
		Button btnConfiguracion = new Button("Configuracion");
		btnConfiguracion.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfiguracion.setBackground(Color.LIGHT_GRAY);
		btnConfiguracion.setBounds(669, 10, 105, 44);
		contentPane.add(btnConfiguracion);
	}
}
