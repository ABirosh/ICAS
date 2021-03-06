import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;

public class app {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					app window = new app();
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
	public app() {
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
		
		JLabel lblIcasEyeGaze = new JLabel("I-CAS Eye Gaze Stimulus");
		lblIcasEyeGaze.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblIcasEyeGaze.setBounds(98, 11, 247, 24);
		frame.getContentPane().add(lblIcasEyeGaze);
		
		textField = new JTextField();
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		textField.setBounds(10, 93, 106, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterNameHere = new JLabel("Enter Name Below");
		lblEnterNameHere.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblEnterNameHere.setBounds(10, 75, 106, 14);
		frame.getContentPane().add(lblEnterNameHere);
		
		JButton btnLoadStimulus = new JButton("Load Stimulus");
		btnLoadStimulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultListModel DLM = new DefaultListModel();
				DLM.addElement("Ana");
				DLM.addElement("Mozza");
				DLM.addElement("fash5");
				DLM.addElement("ya nas");
				
			}
		});
		btnLoadStimulus.setBounds(131, 172, 97, 23);
		frame.getContentPane().add(btnLoadStimulus);
		
		JButton btnStartStimulus = new JButton("Start Stimulus");
		btnStartStimulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AnimatedBoat();
			}
		});
		btnStartStimulus.setBounds(290, 133, 106, 23);
		frame.getContentPane().add(btnStartStimulus);
		
		JLabel lblSelectDisplacementSpeed = new JLabel("Select Speed");
		lblSelectDisplacementSpeed.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblSelectDisplacementSpeed.setBounds(131, 75, 97, 14);
		frame.getContentPane().add(lblSelectDisplacementSpeed);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(131, 93, 97, 20);
		frame.getContentPane().add(textField_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 171, 106, 24);
		frame.getContentPane().add(textArea);
	}
}
