package aplicacion;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class Principal extends JFrame {

	private JPanel contentPrincipal;
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
	
	public Principal() {
		inicializar();
	}
	
	/**
	 * Create the frame.
	 */
	
	public void inicializar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\victo\\OneDrive\\Escritorio\\Sistema-de-cooperativas-main\\icons\\iPrincipal.jpg"));
		setTitle("SISTEMA DE COOPERATIVA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 500);
		setLocationRelativeTo(null);
		contentPrincipal = new JPanel();
		contentPrincipal.setBackground(new Color(153, 255, 153));
		contentPrincipal.setBorder(null);

		setContentPane(contentPrincipal);
		contentPrincipal.setLayout(null);
		
		JPanel pContenido = new JPanel();
		pContenido.setBackground(SystemColor.window);
		pContenido.setBounds(0, 81, 584, 380);
		contentPrincipal.add(pContenido);
		pContenido.setLayout(null);
		
		JTextPane textBienvenido = new JTextPane();
		textBienvenido.setForeground(Color.RED);
		textBienvenido.setFont(new Font("Arial Black", Font.PLAIN, 20));
		textBienvenido.setText("BIENVENIDO!!!");
		textBienvenido.setBounds(38, 37, 192, 43);
		pContenido.add(textBienvenido);
		
		JTextPane txtpnEsteEsEl = new JTextPane();
		txtpnEsteEsEl.setFont(new Font("Arial", Font.PLAIN, 12));
		txtpnEsteEsEl.setText("Este es el sistema de gestion financiera <nombre>.");
		txtpnEsteEsEl.setBounds(38, 103, 243, 167);
		pContenido.add(txtpnEsteEsEl);
		
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
		btnCerrarSesion.setBounds(496, 0, 86, 25);
		contentPrincipal.add(btnCerrarSesion);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.setBounds(0, 0, 319, 25);
		contentPrincipal.add(toolBar);
		
		Button btnAyuda = new Button("Ayuda");
		btnAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ayuda ayuda = new Ayuda();
				ayuda.setVisible(true);
			}
		});
		btnAyuda.setBackground(Color.LIGHT_GRAY);
		toolBar.add(btnAyuda);
		
		Button btnConfiguracion = new Button("Configuracion");
		btnConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Configuracion ajustes = new Configuracion();
				ajustes.setVisible(true);
			}
		});
		toolBar.add(btnConfiguracion);
		btnConfiguracion.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfiguracion.setBackground(Color.LIGHT_GRAY);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 42, 584, 43);
		contentPrincipal.add(menuBar);
		menuBar.setBackground(new Color(153, 255, 153));
		
		JMenu mnRegistro = new JMenu("REGISTRO");
		menuBar.add(mnRegistro);
		
		JMenu mnCUENTAS = new JMenu("CUENTAS");
		mnRegistro.add(mnCUENTAS);
		
		JMenuItem mntmAgregarCuenta = new JMenuItem("AGREGAR CUENTA");
		mnCUENTAS.add(mntmAgregarCuenta);
		mntmAgregarCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AgregarCuenta r = new AgregarCuenta();
				r.setBounds(0, 81, 582, 380);
				r.setLocation(0, 0);
				
				pContenido.removeAll();
				pContenido.add(r, BorderLayout.CENTER);
				pContenido.revalidate();
				pContenido.repaint();
			}
		});
		JMenuItem mntmeEliminarCuenta = new JMenuItem("ELIMINAR CUENTA");
		mnCUENTAS.add(mntmeEliminarCuenta);
		mntmeEliminarCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EliminarCuenta eliminarCuenta = new EliminarCuenta();
				eliminarCuenta.setBounds(0, 81, 582, 380);
				eliminarCuenta.setLocation(0, 0);
				
				pContenido.removeAll();
				pContenido.add(eliminarCuenta, BorderLayout.CENTER);
				pContenido.revalidate();
				pContenido.repaint();
			}
		});
				
		JMenuItem mntmSuspenderCuenta = new JMenuItem("SUSPENDER CUENTA");
		mnCUENTAS.add(mntmSuspenderCuenta);
		mntmSuspenderCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SuspenderCuenta suspenderCuenta = new SuspenderCuenta();
				suspenderCuenta.setBounds(0, 81, 582, 380);
				suspenderCuenta.setLocation(0, 0);
				
				pContenido.removeAll();
				pContenido.add(suspenderCuenta, BorderLayout.CENTER);
				pContenido.revalidate();
				pContenido.repaint();
			}
		});
		
		JMenuItem mntmRetenerCuenta = new JMenuItem("RETENER CUENTA");
		mnCUENTAS.add(mntmRetenerCuenta);
		
		JMenuItem mntmHistorial = new JMenuItem("HISTORIAL");
		mnRegistro.add(mntmHistorial);
		mntmHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Historial_de_Registro historialR = new Historial_de_Registro();
				historialR.setBounds(0, 81, 582, 380);
				historialR.setLocation(0, 0);
				
				pContenido.removeAll();
				pContenido.add(historialR, BorderLayout.CENTER);
				pContenido.revalidate();
				pContenido.repaint();
			}
		});
		
		JMenu mnCuentas = new JMenu("CUENTAS");
		menuBar.add(mnCuentas);
		
		JMenuItem mntmCuentasAhorros = new JMenuItem("CUENTAS DE AHORROS");
		mnCuentas.add(mntmCuentasAhorros);
		mntmCuentasAhorros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CuentasAhorro ahorro = new CuentasAhorro();
				ahorro.setBounds(0, 81, 582, 380);
				ahorro.setLocation(0, 0);
				
				pContenido.removeAll();
				pContenido.add(ahorro, BorderLayout.CENTER);
				pContenido.revalidate();
				pContenido.repaint();
			}
		});
		
		JMenuItem mntmCuentasCreditos = new JMenuItem("CUENTAS DE CREDITO");
		mnCuentas.add(mntmCuentasCreditos);
		mntmCuentasCreditos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CuentasCredito credito = new CuentasCredito();
				credito.setBounds(0, 81, 582, 380);
				credito.setLocation(0, 0);
				
				pContenido.removeAll();
				pContenido.add(credito, BorderLayout.CENTER);
				pContenido.revalidate();
				pContenido.repaint();			
			}
		});
		
		JMenuItem mntmCuentasAportaciones = new JMenuItem("CUENTAS DE APORTACIONES");
		mnCuentas.add(mntmCuentasAportaciones);
		mntmCuentasAportaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CuentasAportaciones aportaciones = new CuentasAportaciones();
				aportaciones.setBounds(0, 81, 582, 380);
				aportaciones.setLocation(0, 0);
				
				pContenido.removeAll();
				pContenido.add(aportaciones, BorderLayout.CENTER);
				pContenido.revalidate();
				pContenido.repaint();
			}
		});
		
		JMenuItem mntmCuentasJuveniles = new JMenuItem("CUENTAS JUVENILES");
		mnCuentas.add(mntmCuentasJuveniles);
		mntmCuentasJuveniles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CuentasJuvenil juvenil = new CuentasJuvenil();
				juvenil.setBounds(0, 81, 582, 380);
				juvenil.setLocation(0, 0);
				
				pContenido.removeAll();
				pContenido.add(juvenil, BorderLayout.CENTER);
				pContenido.revalidate();
				pContenido.repaint();
			}
		});
		
		JMenu mnTransacciones = new JMenu("TRANSACCIONES");
		menuBar.add(mnTransacciones);
		
		JMenu mnNuevaTransaccion = new JMenu("NUEVA TRANSACCION");
		mnTransacciones.add(mnNuevaTransaccion);
		
		JMenuItem mntmDeposito = new JMenuItem("DEPOSITO");
		mntmDeposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deposito deposito = new Deposito();
				deposito.setBounds(0, 81, 582, 380);
				deposito.setLocation(0, 0);
				
				pContenido.removeAll();
				pContenido.add(deposito, BorderLayout.CENTER);
				pContenido.revalidate();
				pContenido.repaint();
			}
		});
		mnNuevaTransaccion.add(mntmDeposito);
		
		JMenuItem mntmRetiro = new JMenuItem("RETIRO");
		mntmRetiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Retiro retiro = new Retiro();
				retiro.setBounds(0, 81, 582, 380);
				retiro.setLocation(0, 0);
				
				pContenido.removeAll();
				pContenido.add(retiro, BorderLayout.CENTER);
				pContenido.revalidate();
				pContenido.repaint();
			}
		});
		mnNuevaTransaccion.add(mntmRetiro);
		
		JMenuItem mntmPrestamo = new JMenuItem("PRESTAMO");
		mntmPrestamo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prestamo prestamo = new Prestamo();
				prestamo.setBounds(0, 81, 582, 380);
				prestamo.setLocation(0, 0);
				
				pContenido.removeAll();
				pContenido.add(prestamo, BorderLayout.CENTER);
				pContenido.revalidate();
				pContenido.repaint();
			}
		});
		mnNuevaTransaccion.add(mntmPrestamo);
		
		JMenuItem mntmHTransacciones = new JMenuItem("HISTORIAL");
		mnTransacciones.add(mntmHTransacciones);
		mntmHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Historial_de_Transacciones historialT = new Historial_de_Transacciones();
				historialT.setBounds(0, 81, 582, 380);
				historialT.setLocation(0, 0);
				
				pContenido.removeAll();
				pContenido.add(historialT, BorderLayout.CENTER);
				pContenido.revalidate();
				pContenido.repaint();
			}
		});
		
		JMenu mnReclamaciones = new JMenu("RECLAMACIONES");
		menuBar.add(mnReclamaciones);
		
		JMenu mnReportes = new JMenu("REPORTES");
		menuBar.add(mnReportes);
		
		
	}
}
