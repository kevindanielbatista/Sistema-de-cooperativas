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
import java.awt.Toolkit;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\victo\\OneDrive\\Escritorio\\Sistema-de-cooperativas-main\\icons\\iPrincipal.jpg"));
		setTitle("SISTEMA DE COOPERATIVA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(572, 500);
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
		textIntroduccion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textIntroduccion.setText("\r\n\r\nEste es un sistema de gestion bancaria para cooperativas de Ahorros y creditos.\r\n");
		textIntroduccion.setBounds(21, 88, 190, 133);
		desktopPane.add(textIntroduccion);
		
		JTextPane txtpnBienvenido = new JTextPane();
		txtpnBienvenido.setForeground(Color.RED);
		txtpnBienvenido.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnBienvenido.setText("BIENVENIDO!!!\r\n");
		txtpnBienvenido.setBounds(21, 40, 125, 60);
		desktopPane.add(txtpnBienvenido);
		
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
		btnCerrarSesion.setBounds(354, 10, 86, 44);
		contentPane.add(btnCerrarSesion);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.setBounds(20, 10, 222, 43);
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
		btnConfiguracion.setBounds(446, 10, 93, 44);
		contentPane.add(btnConfiguracion);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(20, 60, 519, 43);
		contentPane.add(menuBar);
		menuBar.setBackground(new Color(0, 255, 255));
		
		JMenu mnRegistro = new JMenu("REGISTRO");
		menuBar.add(mnRegistro);
		
		JMenu mnCUENTAS = new JMenu("CUENTAS");
		mnRegistro.add(mnCUENTAS);
		
		JMenuItem mntmAgregarCuenta = new JMenuItem("AGREGAR CUENTA");
		mnCUENTAS.add(mntmAgregarCuenta);
		mntmAgregarCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro r = new Registro();
				r.setVisible(true);
			}
		});
		JMenuItem mntmeEliminarCuenta = new JMenuItem("ELIMINAR CUENTA");
		mnCUENTAS.add(mntmeEliminarCuenta);
		
		JMenuItem mntmSuspenderCuenta = new JMenuItem("SUSPENDER CUENTA");
		mnCUENTAS.add(mntmSuspenderCuenta);
		
		JMenuItem mntmRetenerCuenta = new JMenuItem("RETENER CUENTA");
		mnCUENTAS.add(mntmRetenerCuenta);
		
		JMenu mnTransacciones = new JMenu("TRANSACCIONES");
		menuBar.add(mnTransacciones);
		
		JMenu mnNuevaTransaccion = new JMenu("NUEVA TRANSACCION");
		mnTransacciones.add(mnNuevaTransaccion);
		
		JMenuItem mntmDeposito = new JMenuItem("DEPOSITO");
		mnNuevaTransaccion.add(mntmDeposito);
		
		JMenuItem mntmRetiro = new JMenuItem("RETIRO");
		mnNuevaTransaccion.add(mntmRetiro);
		
		JMenu mnHistorial = new JMenu("HISTORIAL");
		menuBar.add(mnHistorial);
		
		JMenuItem mntmHist_de_transacciones = new JMenuItem("TRANSACCIONES");
		mnHistorial.add(mntmHist_de_transacciones);
		
		JMenuItem mntmHist_de_registro = new JMenuItem("REGISTRO");
		mnHistorial.add(mntmHist_de_registro);
		
		JMenu mnReclamaciones = new JMenu("RECLAMACIONES");
		menuBar.add(mnReclamaciones);
		
		JCheckBoxMenuItem chckbxmntmPerdida = new JCheckBoxMenuItem("Perdida");
		mnReclamaciones.add(chckbxmntmPerdida);
		
		JMenu mnReportes = new JMenu("REPORTES");
		menuBar.add(mnReportes);
	}
}
