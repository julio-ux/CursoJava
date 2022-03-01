package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado Julio = new Empleado("Julio",2000,2019,8,21);
		System.out.println("El nombre del empleado es: " + Julio.getNombre());
		Julio.setAumentaSueldo(5);
		System.out.println("El sueldo de este empleado es: $" + Julio.getSueldo());
		System.out.println("y la fecha de alta es: " + Julio.getFecha());
	}

}
class Empleado {
	private String nombre;
	private double sueldo;
	private Date fecha_alta;
	public Empleado(String nombre, double sueldo, int agno, int mes, int dia) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		Calendar fecha = new GregorianCalendar(agno,(mes - 1),dia);
		fecha_alta = fecha.getTime();
	}
	public String getNombre() {
		return nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public Date getFecha() {
		return fecha_alta;
	}
	public void setAumentaSueldo(double porcentaje) {
		sueldo = sueldo + sueldo * (porcentaje / 100);
	}
}
