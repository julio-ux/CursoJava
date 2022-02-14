package poo;

import javax.swing.JOptionPane;

public class V028_POO_II_Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		V028_POO_II_Coche Renault = new V028_POO_II_Coche();
//		//Instanciar una clase, Ejemplar de una clase
//		System.out.println(Renault.dime_largo());
//		//System.out.println("Este coche tiene " + Renault.largo + " ruedas");
		
		V028_POO_II_Coche miCoche = new V028_POO_II_Coche();
		System.out.println(miCoche.dime_datos_generales());
		miCoche.establece_color(JOptionPane.showInputDialog("¿Cual es color del coche?"));
		miCoche.configura_asientos(JOptionPane.showInputDialog("¿El coche tiene asientos de cuero? si/no"));
		System.out.println(miCoche.dime_asientos());
		System.out.println(miCoche.dime_color());
		
		miCoche.configura_climatizador(JOptionPane.showInputDialog("¿El coche tiene climatizador? si/no"));
		
		System.out.println(miCoche.dime_climatizador());
		System.out.println(miCoche.dime_peso_coche());
		System.out.println("El precio final del coche es: " + miCoche.precio_coche());
	}

}
