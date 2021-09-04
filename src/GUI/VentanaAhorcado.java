package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import LOG.JuegoFacil;
import javax.swing.JLabel;

public class VentanaAhorcado extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private int ahorcado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAhorcado frame = new VentanaAhorcado();
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
	public VentanaAhorcado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds (100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JuegoFacil jf=new JuegoFacil();
		jf.setPalabra();
		String palabraPrueba=jf.getPalabra();
		
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='A'){
						asignarLetras(i, "A");
					}
					else{
						cont+=1;
					}
				
				}
				if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnA.setBounds(10, 67, 47, 34);
		contentPane.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnB.setBounds(67, 67, 47, 34);
		contentPane.add(btnB);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(124, 112, 47, 34);
		contentPane.add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setBounds(181, 112, 47, 34);
		contentPane.add(btnJ);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(295, 67, 47, 34);
		contentPane.add(btnF);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(10, 157, 47, 34);
		contentPane.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(67, 157, 47, 34);
		contentPane.add(btnN);
		
		JButton btnN2 = new JButton("\u00D1");
		btnN2.setBounds(124, 157, 47, 34);
		contentPane.add(btnN2);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(181, 157, 47, 34);
		contentPane.add(btnO);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(239, 112, 47, 34);
		contentPane.add(btnK);
		
		JButton btnR = new JButton("R");
		btnR.setBounds(10, 202, 47, 34);
		contentPane.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(67, 202, 47, 34);
		contentPane.add(btnS);
		
		JButton btnQ = new JButton("Q");
		btnQ.setBounds(296, 157, 47, 34);
		contentPane.add(btnQ);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(238, 157, 47, 34);
		contentPane.add(btnP);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(296, 112, 47, 34);
		contentPane.add(btnL);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(10, 112, 47, 34);
		contentPane.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setBounds(67, 112, 47, 34);
		contentPane.add(btnH);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnC.setBounds(124, 67, 47, 34);
		contentPane.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnD.setBounds(181, 67, 47, 34);
		contentPane.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='E'){
						asignarLetras(i, "E");
					}
					else{
						cont+=1;
					}
				}
				if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnE.setBounds(239, 67, 47, 34);
		contentPane.add(btnE);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(124, 202, 47, 34);
		contentPane.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setBounds(181, 202, 47, 34);
		contentPane.add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.setBounds(239, 202, 47, 34);
		contentPane.add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(296, 202, 47, 34);
		contentPane.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(10, 247, 47, 34);
		contentPane.add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.setBounds(67, 247, 47, 34);
		contentPane.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBounds(124, 247, 47, 34);
		contentPane.add(btnZ);
		
		textField = new JTextField();
		textField.setBounds(10, 337, 47, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(67, 337, 47, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(124, 337, 47, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(181, 337, 47, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(239, 337, 47, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(295, 337, 47, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(352, 337, 47, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(409, 337, 47, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(466, 337, 47, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(523, 337, 47, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(580, 337, 47, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(637, 337, 47, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(10, 368, 47, 20);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(67, 368, 47, 20);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(124, 368, 47, 20);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(181, 368, 47, 20);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(239, 368, 47, 20);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(295, 368, 47, 20);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(352, 368, 47, 20);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(409, 368, 47, 20);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(466, 368, 47, 20);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(523, 368, 47, 20);
		contentPane.add(textField_21);
		
		JLabel palabra = new JLabel("New label");
		palabra.setBounds(33, 24, 46, 14);
		contentPane.add(palabra);
		palabra.setText(palabraPrueba);
		
		
	}
	public void asignarLetras(int i, String c){
		if(i==0)textField.setText(c);
		else if(i==1)textField_1.setText(c);
		else if(i==2)textField_2.setText(c);
		else if(i==3)textField_3.setText(c);
		else if(i==4)textField_4.setText(c);
		else if(i==5)textField_5.setText(c);
		else if(i==6)textField_6.setText(c);
		else if(i==7)textField_7.setText(c);
		else if(i==8)textField_8.setText(c);
		else if(i==9)textField_9.setText(c);
		else if(i==10)textField_10.setText(c);
		else if(i==11)textField_11.setText(c);
		else if(i==12)textField_12.setText(c);
		else if(i==13)textField_13.setText(c);
		else if(i==14)textField_14.setText(c);
		else if(i==15)textField_15.setText(c);
		else if(i==16)textField_16.setText(c);
		else if(i==17)textField_17.setText(c);
		else if(i==18)textField_18.setText(c);
		else if(i==19)textField_19.setText(c);
		else if(i==20)textField_20.setText(c);
		else if(i==21)textField_21.setText(c);
	}
}
