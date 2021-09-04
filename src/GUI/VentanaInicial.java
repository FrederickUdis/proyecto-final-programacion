package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class VentanaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicial frame = new VentanaInicial();
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
	public VentanaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(24, 57, 159, 141);
		contentPane.add(label);
		
		JButton btnJugar = new JButton("Play");
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new VentanaAhorcado().setVisible(true);
				dispose();
			}
		});
		btnJugar.setBounds(270, 82, 89, 23);
		contentPane.add(btnJugar);
		
		JButton btnScore = new JButton("Score");
		btnScore.setBounds(270, 130, 89, 23);
		contentPane.add(btnScore);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(270, 178, 89, 23);
		contentPane.add(btnExit);
		
		JLabel lblAhorcadoxV = new JLabel("AHORCADOX V.1.0");
		lblAhorcadoxV.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAhorcadoxV.setBounds(136, 11, 173, 23);
		contentPane.add(lblAhorcadoxV);
	}
}
