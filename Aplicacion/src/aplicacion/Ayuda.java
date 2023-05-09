package aplicacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class Ayuda extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ayuda frame = new Ayuda();
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
	public Ayuda() {
		setTitle("AYUDA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(SystemColor.desktop);
		separator.setBounds(136, 0, 10, 361);
		contentPane.add(separator);
		
		JPanel Concepto = new JPanel();
		Concepto.setBackground(SystemColor.window);
		Concepto.setBounds(0, 0, 137, 361);
		contentPane.add(Concepto);
		Concepto.setLayout(null);
		
		JTree General = new JTree();
		General.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("General") {
				{
				}
			}
		));
		General.setBounds(0, 0, 137, 361);
		Concepto.add(General);
		
		JPanel Informacion = new JPanel();
		Informacion.setBackground(SystemColor.text);
		Informacion.setBounds(137, 0, 346, 361);
		contentPane.add(Informacion);
	}
}
