package LOG;
import java.util.*;
import java.io.*;
public abstract class Juego {
	
	private int oportunidades;
	private double puntaje;
	protected String palabra;
	
	
	
	public double getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(char letra) {
		if(letra=='/')this.puntaje=0;
		else{
		int contGan=0;
		//int contPerd=0;
		for(int i=0; i<this.palabra.length(); i++){
			if(palabra.charAt(i)!=letra){
				contGan=contGan+1;
			}
			//else contPerd+=1;
		}
		if(contGan!=0){
			contGan=contGan*100;
			this.puntaje=puntaje+contGan;
		}}
	}
	
	
	public String getPalabra() {
		return palabra;
	}
	public abstract void setPalabra();
	
	public abstract boolean sigueJuego();
	public abstract boolean ganar();
	
	public int getOportunidades() {
		return oportunidades;
	}
	
	public void setOportunidades(int oportunidades) {
		this.oportunidades = this.oportunidades+1;
	}
	
}
