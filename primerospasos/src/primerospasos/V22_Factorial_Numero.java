package primerospasos;

import javax.swing.JOptionPane;

public class V22_Factorial_Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero_dado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un n?mero"));
		Long numero_asignado = 1L;
		for (int i = numero_dado; i > 0; i--) {
			numero_asignado = numero_asignado * i;
		}
		
		System.out.println("El factorial de: " + numero_dado + " es: " + numero_asignado);
	}

}
