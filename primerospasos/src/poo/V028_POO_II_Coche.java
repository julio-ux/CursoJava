package poo;

public class V028_POO_II_Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	String color;
	int peso_total;
	boolean asientos_cuero, climatizador;
	
	public V028_POO_II_Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	public String dime_largo(){//Metodo getter
		return "El largo del coche es: " + largo;
	} 
	public void establece_color(String color) {//Metodo setter
		this.color = color;
	}
	public String dime_color() {
		return "El color del coche es: " + color;
	}
}
