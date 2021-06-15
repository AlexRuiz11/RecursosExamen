package JavaSwing;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Botones {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Botones window = new Botones();
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
	public Botones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("PACO");
		rdbtnNewRadioButton.setBounds(244, 33, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("PEPE");
		rdbtnNewRadioButton_1.setBounds(26, 33, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
	
		
	    ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(rdbtnNewRadioButton_1);
        bgroup.add(rdbtnNewRadioButton);
        
        JButton btnNewButton = new JButton("dECIR hOLA");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		if(rdbtnNewRadioButton.isSelected()) {
        		
        			
					JOptionPane.showMessageDialog(frame, "Hola "+ rdbtnNewRadioButton.getText() );
					
				

				

        			
        		}
        		
        		
        		if(rdbtnNewRadioButton_1.isSelected()) {
        		
        			
					JOptionPane.showMessageDialog(frame, "Hola "+ rdbtnNewRadioButton_1.getText() );

        		}
        	
        	}
        });
        btnNewButton.setBounds(165, 187, 123, 23);
        frame.getContentPane().add(btnNewButton);

	
		
	}
	
	
	
}
