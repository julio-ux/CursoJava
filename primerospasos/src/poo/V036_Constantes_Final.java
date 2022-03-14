package poo;

public class V036_Constantes_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
//		trabajador1.setNombre("Julio");
		trabajador1.setSeccion("RRHH");
		System.out.println(trabajador1.getInformacion());
		System.out.println(trabajador2.getInformacion());
	}

}
class Empleados{
	private final String nombre;
	private String seccion;
	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administración";
	}
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	public String getInformacion() {
		return "El nombre es: " + nombre + " y la seccion es: " + seccion;
	}
}
