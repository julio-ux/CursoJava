package primerospasos;

import javax.swing.JOptionPane;

public class V21_BuclesIV_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < 10; i++) {
//			System.out.println((i + 1) + ".-Julio Castillo");
//		}
		String mail = JOptionPane.showInputDialog("�Cual es la direccion de correo?");
		boolean encontrado = false;
		for (int i = 0; i < mail.length(); i++) {
			if(mail.charAt(i) == '@') {
				encontrado = true;
			}
		}
		if(encontrado) {
			System.out.println("Correo correcto");
		}else {
			System.out.println("Correo incorrecto");
		}
	}

}
