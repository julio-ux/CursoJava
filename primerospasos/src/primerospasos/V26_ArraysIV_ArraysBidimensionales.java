package primerospasos;

import javax.swing.JOptionPane;

public class V26_ArraysIV_ArraysBidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ccapital;
		double interes = 0.10;
		
		int agnos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de a�os"));
		
		double tabla_capital [][] = new double[6][agnos];
		
		for (int i = 0; i < 6; i++) {
			ccapital = 10000;
			for (int j = 0; j < agnos; j++) {
				tabla_capital[i][j] = ccapital;
				ccapital = ccapital + (ccapital * interes);
			}
			interes = interes + 0.01;
		}
		System.out.println("   10%   |    11%   |    12%   |    13%   |    14%   |    15%   |");
		System.out.println("----------------------------------------------------------------");
		for (int i = 0; i < agnos; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.printf("%1.2f",tabla_capital[j][i]);
				System.out.print(" | ");
			}
			System.out.println();
		}
		
//		for(double capital[] : tabla_capital) {
//			for(double c : capital) {
//				System.out.print(c + " | ");
//			}
//			System.out.println();
//		}
		
	}

}
