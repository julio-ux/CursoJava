package primerospasos;
import javax.swing.*;
public class V017_Condicional_ll_AreaFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una figura\n1.-Cuadrado\n2.-Rectangulo\n3.-Triangulo\n4.-Circulo"));
		switch(opcion) {
		case 1:
			double lado = Double.parseDouble(JOptionPane.showInputDialog("Lado"));
			System.out.println("El area del cuadrado: " + lado * lado);
			break;
		case 2:
			double base = Double.parseDouble(JOptionPane.showInputDialog("Base"));
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
			System.out.println("El area del rectangulo: " + base * altura);
			break;
		case 3:
			base = Double.parseDouble(JOptionPane.showInputDialog("Base"));
			altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
			System.out.println("El area del triangulo: " + (base * altura) / 2);
			break;
		default:
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Radio"));
			System.out.println("El area del circulo: " + Math.PI * Math.pow(radio, 2));	
		}
	}

}
