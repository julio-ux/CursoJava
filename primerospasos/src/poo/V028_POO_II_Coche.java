package poo;

public class V028_POO_II_Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	public V028_POO_II_Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	public String dime_datos_generales(){//Metodo getter
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas," +
			"mide " + largo / 1000 + " metros, con ancho de " + ancho + " cm y "
					+ "un peso de plataforma de " + peso_plataforma + " kg";
	} 
	public void establece_color(String color) {//Metodo setter
		this.color = color;
	}
	public String dime_color() {
		return "El color del coche es: " + color;
	}
	public void configura_asientos(String asientos_cuero) {
		if(asientos_cuero.equalsIgnoreCase("si")) this.asientos_cuero = true;
		else this.asientos_cuero = false;
	}
	public String dime_asientos() {
		if(asientos_cuero) return "El coche tiene asientos de cuero";
		else return "El coche tiene asientos de serie";
	}
	public void configura_climatizador(String climatizador) {
		if(climatizador.equals("si")){
			this.climatizador = true;
		}else {
			this.climatizador = false;
		}
	}
	public String dime_climatizador() {
		if(climatizador) {
			return "El coche incorpora climatizador";
		}else {
			return "El coche lleva aire condicionado";
		}
	}
	public String dime_peso_coche() {
		int peso_carroceria = 500;
		peso_total = peso_plataforma + peso_carroceria;
		if(asientos_cuero) {
			peso_total = peso_total + 50;
		}
		if(climatizador) {
			peso_total = peso_total + 20;
		}
		return "El peso del coche es: " + peso_total;
	}
	public int precio_coche() {//GETTER
		int precio_final = 10000;
		if(asientos_cuero) {
			precio_final += 2000;
		}
		if(climatizador) {
			precio_final += 1500;
		}
		return precio_final;
	}
	
}
