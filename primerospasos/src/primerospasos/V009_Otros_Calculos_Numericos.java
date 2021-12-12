package primerospasos;

import javax.swing.JOptionPane;

public class V009_Otros_Calculos_Numericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Raiz cuadrada de un numero
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Numero a sacar raiz"));
		double raiz = Math.sqrt(numero);
		System.out.println("La raiz cuadrada de: " + numero + " es: " + raiz);
		
		//Redondear un numero
		double numeroR = Double.parseDouble(JOptionPane.showInputDialog("Numero a redondear"));
		int redondeo = (int)Math.round(numeroR);
		System.out.println("El redondeo del numero " + numeroR + " es " + redondeo);
		
		//Elevar un numero a una potencia
		double numeroP1 = Double.parseDouble(JOptionPane.showInputDialog("¿Base?"));
		double numeroP2 = Double.parseDouble(JOptionPane.showInputDialog("¿Exponente?"));
		int potencia = (int)Math.pow(numeroP1, numeroP2);
		System.out.println("El numero: " + numeroP1 + " elevado a " + numeroP2 + " es igual a = " + potencia);
	}

}
