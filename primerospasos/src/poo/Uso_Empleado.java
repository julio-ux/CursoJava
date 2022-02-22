package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado Julio = new Empleado("Julio",2000,2019,8,21);
	}

}
class Empleado {
	private String nombre;
	private double sueldo;
	private Date fecha_alta;
	public Empleado(String nombre, double sueldo, int agno, int mes, int dia) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		GregorianCalendar fecha = new GregorianCalendar(agno,(mes - 1),dia);
		fecha_alta = fecha.getTime();
	}
}
