package primerospasos;

import javax.swing.JOptionPane;

public class V018_2_Bucle_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero_random = (int)(Math.random() * 100);
		int numero_dado = 0;
		int intentos = 0;
		do {
			intentos++;
			numero_dado = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero de 1 a 100"));
			if(numero_dado > numero_random) {
				System.out.println(intentos + ".-El numero dado debe ser menor");
			}else {
				System.out.println(intentos + ".-El numero dado debe ser mayor");
			}
		}while(numero_random != numero_dado);
		
		System.out.println("Felicidades, el numero es: " + numero_random + " ,lo logro en: " + intentos + " intentos");
	}

}
