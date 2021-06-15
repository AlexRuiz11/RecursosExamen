package JavaSwing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hipervinculo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hipervinculo window = new Hipervinculo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hipervinculo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
		
		
		final JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(129, 232, 156, 20);
		frame.getContentPane().add(lblNewLabel);

		lblNewLabel.setForeground(Color.BLUE.darker());
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		lblNewLabel.setText("<html><a href=''>Recuperar contraseña</a></html>");

		lblNewLabel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://www.google.com"));
				} catch (IOException  e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setText("hola");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setText("<html><a href=''>" + "holaaa" + "</a></html>");
			}

		});
		
		
		
		
	}

}
