package primerospasos;

import javax.swing.JOptionPane;

public class V018_1_Bucle_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String contra = "";
		while(!contra.equalsIgnoreCase("JULIO")) {
			contra = JOptionPane.showInputDialog("Escriba la contraseņa");
			if(!contra.equalsIgnoreCase("JULIO")) {
				System.out.println("Contraseņa incorrecta");
			}
		}
		System.out.println("Bienvenid@");
	}

}
