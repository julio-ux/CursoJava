package primerospasos;

public class V25_ArraysIII_ArraysBidimiensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros [][] = new int [4][5];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				numeros[i][j] = (int)(Math.random() * 100);
			}
		}
		for(int [] arr_num : numeros) {
			for(int num : arr_num) {
				System.out.print(num + "|");
			}
			System.out.println();
			System.out.println("*********************************************************");
		}
	}

}
