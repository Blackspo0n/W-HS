import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Taschenrechner extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Taschenrechner frame = new Taschenrechner();
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
	public Taschenrechner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblTaschenrechner = new JLabel("Taschenrechner");
		panel.add(lblTaschenrechner);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblZahl = new JLabel("Zahl 1:");
		lblZahl.setBounds(10, 11, 46, 14);
		panel_1.add(lblZahl);
		
		JLabel lblZahl_1 = new JLabel("Zahl 2:");
		lblZahl_1.setBounds(10, 36, 46, 14);
		panel_1.add(lblZahl_1);
		
		textField = new JTextField();
		textField.setBounds(66, 8, 198, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 33, 198, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField_2.setText("" + (Integer.parseInt(textField.getText()) +  Integer.parseInt(textField_1.getText())));
				}
				catch(Exception err) {
					textField_2.setText(err.toString());
				}
			}
		});
		button.setBounds(10, 89, 46, 46);
		panel_1.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField_2.setText("" + (Integer.parseInt(textField.getText()) - Integer.parseInt(textField_1.getText())));
				}
				catch(Exception err) {
					textField_2.setText(err.toString());
				}
			}
		});
		button_1.setBounds(82, 89, 46, 46);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField_2.setText("" + (Integer.parseInt(textField.getText()) *  Integer.parseInt(textField_1.getText())));
				}
				catch(Exception err) {
					textField_2.setText(err.toString());
				}
			}
		});
		button_2.setBounds(150, 89, 46, 46);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField_2.setText("" + (Integer.parseInt(textField.getText()) / Integer.parseInt(textField_1.getText())));
				}
				catch(Exception err) {
					textField_2.setText(err.toString());
				}
			}
		});
		button_3.setBounds(218, 89, 46, 46);
		panel_1.add(button_3);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnC.setBounds(10, 146, 254, 46);
		panel_1.add(btnC);
		
		JLabel lblErgebniss = new JLabel("Ergebniss:");
		lblErgebniss.setBounds(10, 61, 58, 14);
		panel_1.add(lblErgebniss);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 58, 198, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
	}
}
