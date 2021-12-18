package primerospasos;
import javax.swing.*;
public class V015_1_Entrada_Salida_datos_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre_Usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		int edad_Usuario = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
		System.out.println("Hola " + nombre_Usuario + " El año que viene trendras " +  (edad_Usuario + 1) + " años");
		
	}

}
