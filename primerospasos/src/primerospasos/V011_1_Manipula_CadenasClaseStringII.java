package primerospasos;

public class V011_1_Manipula_CadenasClaseStringII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombreCompleto = "Julio Cesar Castillo Gutierrez";
		//Metodo Substring I
		String nombre = nombreCompleto.substring(0, 11);
		System.out.println(nombre);
		//Metodo Substring II
		String apellidos = nombreCompleto.substring(12);
		System.out.println(apellidos);
	}

}
