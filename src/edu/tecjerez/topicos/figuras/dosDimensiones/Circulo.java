package edu.tecjerez.topicos.figuras.dosDimensiones;

public class Circulo {
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}
	public double obtenerArea() {
		return Math.PI*Math.pow(radio, 2);
	}
	public double obtenerPerimetro() {
		return 2*Math.PI*radio;
	}
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}

}
