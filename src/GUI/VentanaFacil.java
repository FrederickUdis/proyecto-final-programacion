package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.SwingConstants;

import LOG.JuegoFacil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.ImageIcon;

public class VentanaFacil extends JFrame {

	private JPanel contentPane;
	private JLabel letra1;
	private JLabel letra2;
	private JLabel letra3;
	private JLabel letra4;
	private JLabel letra5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFacil frame = new VentanaFacil();
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
	public VentanaFacil() {
		JuegoFacil jf=new JuegoFacil();
		jf.setPalabra();
		String palabraPrueba=jf.getPalabra();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 409);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNivelFacil = new JLabel("NIVEL FACIL");
		lblNivelFacil.setBounds(10, 11, 79, 21);
		contentPane.add(lblNivelFacil);
		
		JLabel preuba = new JLabel("");
		preuba.setBounds(20, 342, 46, 14);
		contentPane.add(preuba);
		preuba.setText(palabraPrueba);
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
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnA.setBounds(10, 47, 59, 23);
		contentPane.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='B'){
						asignarLetras(i, "B");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnB.setBounds(79, 47, 59, 23);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='C'){
						asignarLetras(i, "C");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnC.setBounds(148, 47, 59, 23);
		contentPane.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='D'){
						asignarLetras(i, "D");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnD.setBounds(217, 47, 59, 23);
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
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnE.setBounds(10, 81, 59, 23);
		contentPane.add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='F'){
						asignarLetras(i, "F");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnF.setBounds(79, 81, 59, 23);
		contentPane.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='G'){
						asignarLetras(i, "G");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnG.setBounds(148, 81, 59, 23);
		contentPane.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='H'){
						asignarLetras(i, "H");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnH.setBounds(217, 81, 59, 23);
		contentPane.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='I'){
						asignarLetras(i, "I");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnI.setBounds(10, 115, 59, 23);
		contentPane.add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='J'){
						asignarLetras(i, "J");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnJ.setBounds(79, 115, 59, 23);
		contentPane.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='K'){
						asignarLetras(i, "K");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnK.setBounds(148, 115, 59, 23);
		contentPane.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='L'){
						asignarLetras(i, "L");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnL.setBounds(217, 115, 59, 23);
		contentPane.add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='M'){
						asignarLetras(i, "M");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnM.setBounds(10, 149, 59, 23);
		contentPane.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='N'){
						asignarLetras(i, "N");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnN.setBounds(79, 149, 59, 23);
		contentPane.add(btnN);
		
		JButton button = new JButton("\u00D1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='Ñ'){
						asignarLetras(i, "Ñ");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		button.setBounds(148, 149, 59, 23);
		contentPane.add(button);
		
		JButton btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='O'){
						asignarLetras(i, "O");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnO.setBounds(217, 149, 59, 23);
		contentPane.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='P'){
						asignarLetras(i, "P");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnP.setBounds(10, 183, 59, 23);
		contentPane.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='Q'){
						asignarLetras(i, "Q");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnQ.setBounds(79, 183, 59, 23);
		contentPane.add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='R'){
						asignarLetras(i, "R");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnR.setBounds(148, 183, 59, 23);
		contentPane.add(btnR);
		
		JButton btnT = new JButton("T");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='T'){
						asignarLetras(i, "T");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnT.setBounds(10, 217, 59, 23);
		contentPane.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='U'){
						asignarLetras(i, "U");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnU.setBounds(79, 217, 59, 23);
		contentPane.add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='V'){
						asignarLetras(i, "V");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnV.setBounds(148, 217, 59, 23);
		contentPane.add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='W'){
						asignarLetras(i, "W");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnW.setBounds(217, 217, 59, 23);
		contentPane.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='X'){
						asignarLetras(i, "X");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnX.setBounds(10, 251, 59, 23);
		contentPane.add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='Y'){
						asignarLetras(i, "Y");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnY.setBounds(79, 251, 59, 23);
		contentPane.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='Z'){
						asignarLetras(i, "Z");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnZ.setBounds(148, 251, 59, 23);
		contentPane.add(btnZ);
		
		letra1 = new JLabel("-");
		letra1.setHorizontalAlignment(SwingConstants.CENTER);
		letra1.setFont(new Font("Tahoma", Font.PLAIN, 32));
		letra1.setBounds(10, 301, 52, 30);
		contentPane.add(letra1);
		
		letra2 = new JLabel("-");
		letra2.setHorizontalAlignment(SwingConstants.CENTER);
		letra2.setFont(new Font("Tahoma", Font.PLAIN, 32));
		letra2.setBounds(79, 301, 52, 30);
		contentPane.add(letra2);
		
		letra3 = new JLabel("-");
		letra3.setHorizontalAlignment(SwingConstants.CENTER);
		letra3.setFont(new Font("Tahoma", Font.PLAIN, 32));
		letra3.setBounds(148, 301, 52, 30);
		contentPane.add(letra3);
		
		letra4 = new JLabel("-");
		letra4.setHorizontalAlignment(SwingConstants.CENTER);
		letra4.setFont(new Font("Tahoma", Font.PLAIN, 32));
		letra4.setBounds(217, 301, 52, 30);
		contentPane.add(letra4);
		
		letra5 = new JLabel("-");
		letra5.setHorizontalAlignment(SwingConstants.CENTER);
		letra5.setFont(new Font("Tahoma", Font.PLAIN, 32));
		letra5.setBounds(279, 301, 52, 30);
		contentPane.add(letra5);
		
		JButton btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cont=0;
				for (int i = 0; i < palabraPrueba.length(); i++) {
					if(palabraPrueba.charAt(i)=='S'){
						asignarLetras(i, "S");
					}
					else{
						cont+=1;
					}
				}
				//if(cont==palabraPrueba.length())ahorcado+=1;
			}
		});
		btnS.setBounds(217, 183, 59, 23);
		contentPane.add(btnS);
		
		JLabel label = new JLabel("New label");
		
		
		label.setBounds(321, 47, 124, 212);
		contentPane.add(label);
		
	}
	
	public void asignarLetras(int i, String c){
		if(i==0)letra1.setText(c);
		else if(i==1)letra2.setText(c);
		else if(i==2)letra3.setText(c);
		else if(i==3)letra4.setText(c);
		else letra5.setText(c);
	}
}