package primerospasos;
import javax.swing.*;
public class V015_2_Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double x = 10000.0;
//		System.out.println(x/3);
//		System.out.printf("%1.2f",x/3);
		String num1 = JOptionPane.showInputDialog("Introduce un n�mero");
		double num2 = Double.parseDouble(num1);
		System.out.print("La ra�z de " + num2 + " es ");
		System.out.printf("%1.4f",Math.sqrt(num2));
	}

}
