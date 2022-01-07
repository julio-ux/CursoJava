package primerospasos;

public class V23_Arrays_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mi_matriz [] = new int[5];
		for (int i = 0; i < mi_matriz.length; i++) {
			mi_matriz[i] = (i + 1) * 5;
		}
		for (int i : mi_matriz) {
			System.out.println(i);
		}
	}

}
