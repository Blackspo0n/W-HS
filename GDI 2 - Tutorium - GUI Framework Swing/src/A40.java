

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class A40 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					A40 frame = new A40();
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
	public A40() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel topPanel = new JPanel();
		contentPane.add(topPanel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Bitte treffen Sie Ihre wahl! - Wie wollen Sie spielen?");
		topPanel.add(lblNewLabel);
		
		JPanel btnPanel = new JPanel();
		contentPane.add(btnPanel, BorderLayout.CENTER);
		btnPanel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewButton = new JButton("Player vs. Player");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GDI2MinichessController controller = new GDI2MinichessController(new GDI2MinichessGUI(), true, true);
			}
		});
		btnPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Player vs. Com (Black)");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GDI2MinichessController controller = new GDI2MinichessController(new GDI2MinichessGUI(), true, false);
			}
		});
		btnPanel.add(btnNewButton_1);
		
		JButton btnPlayerVsCom = new JButton("Player vs. Com (White)");
		btnPlayerVsCom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GDI2MinichessController controller = new GDI2MinichessController(new GDI2MinichessGUI(), false, true);
			}
		});
		btnPanel.add(btnPlayerVsCom);
		
		JButton btnComVsCom = new JButton("Com vs. Com");
		btnComVsCom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				GDI2MinichessController controller = new GDI2MinichessController(new GDI2MinichessGUI(), false, false);
			}
		});
		btnPanel.add(btnComVsCom);
	}

}
