package primerospasos;
import javax.swing.*;
public class V020_1_Bucles_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String genero = "";
		do {
			genero = JOptionPane.showInputDialog("�Cual es su genero (H/M)?");
		}while(!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("�Cual es su altura? en cm"));
		if(genero.equalsIgnoreCase("H")) {	
			System.out.println("Su peso ideal es: " + (altura - 110) + " kg");
		}else {
			System.out.println("Su peso ideal es: " + (altura - 120) + " kg");
		}
	}

}
