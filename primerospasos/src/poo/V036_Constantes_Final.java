package poo;

public class V036_Constantes_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
//		trabajador1.setNombre("Julio");
		trabajador1.setSeccion("RRHH");
		System.out.println(trabajador1.getInformacion() + "\n" 
		+ trabajador2.getInformacion() + "\n" 
		+ trabajador3.getInformacion() + "\n" 
		+ trabajador4.getInformacion());
		System.out.println(Empleados.getIdSiguiente());
	}

}
class Empleados{
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1;
	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administración";
		Id = IdSiguiente;
		IdSiguiente++;
	}
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getInformacion() {
		return "El empleado " + nombre + " con el id "+ Id +" esta en la seccion " + seccion;
	}
	public static String getIdSiguiente() {
		return "El idSiguiente es: " + IdSiguiente;
	}
}
