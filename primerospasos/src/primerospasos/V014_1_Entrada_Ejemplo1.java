package primerospasos;
import java.util.*;;
public class V014_1_Entrada_Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("�Cual es tu nombre?");
		String nombre = teclado.nextLine();
		System.out.println("�Cual es tu edad?");
		int edad = teclado.nextInt();
		System.out.println("Tu nombre es: " + nombre + " el a�o que viene tendras: " + (edad + 1) + " a�os");
	}

}
