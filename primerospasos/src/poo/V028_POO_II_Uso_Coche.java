package poo;

public class V028_POO_II_Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		V028_POO_II_Coche Renault = new V028_POO_II_Coche();
//		//Instanciar una clase, Ejemplar de una clase
//		System.out.println(Renault.dime_largo());
//		//System.out.println("Este coche tiene " + Renault.largo + " ruedas");
		
		V028_POO_II_Coche miCoche = new V028_POO_II_Coche();
		System.out.println(miCoche.dime_largo());
		miCoche.establece_color("Verde");
		System.out.println(miCoche.dime_color());
	}

}
