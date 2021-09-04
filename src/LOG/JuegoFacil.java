package LOG;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class JuegoFacil extends Juego {

	File archivo = new File("Palabras_5.txt");
	
	public JuegoFacil(){
		this.setPuntaje('/');
		//this.setPalabra();
	}
	
	@Override
	public void setPalabra() {
		// File archivo = new File("PalabrasFacil.txt");
		ArrayList<String> aux = new ArrayList<>();
		try {
			String t = "";
			if (archivo.exists()) {
				BufferedReader lector = new BufferedReader(new FileReader(
						archivo));
				while ((t = lector.readLine()) != null) {
					aux.add(t);
				}
			} else {
				// JOptionPane.showMessageDialog(null, "Archivo no encontrado");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		int palabraAleatoria = new Random().nextInt(aux.size());
		this.palabra = aux.get(palabraAleatoria);
	}

	@Override
	public boolean sigueJuego() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ganar() {
		// TODO Auto-generated method stub
		return false;
	}

}
