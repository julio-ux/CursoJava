package poo;

import java.util.*;

import javax.swing.JOptionPane;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Empleado empleado1 = new Empleado("Paco G?mez",85000,1990,12,17);
//		Empleado empleado2 = new Empleado("Anna L?pez",95000,1995,6,2);
//		Empleado empleado3 = new Empleado("Maria Mart?n",105000,2002,3,15);
//		
//		empleado1.setAumentaSueldo(5);
//		empleado2.setAumentaSueldo(5);
//		empleado3.setAumentaSueldo(5);
//		
//		System.out.println("Nombre: " + empleado1.getNombre() + " "
//				+ "Sueldo: " + empleado1.getSueldo() + " "
//				+ "Fecha de alta: " + empleado1.getFecha());
//		
//		System.out.println("Nombre: " + empleado2.getNombre() + " "
//				+ "Sueldo: " + empleado2.getSueldo() + " "
//				+ "Fecha de alta: " + empleado2.getFecha());
//		
//		System.out.println("Nombre: " + empleado3.getNombre() + " "
//				+ "Sueldo: " + empleado3.getSueldo() + " "
//				+ "Fecha de alta: " + empleado3.getFecha());
		int nEmpleados = Integer.parseInt(JOptionPane.showInputDialog("?Cual es el numero de empleados?"));
		Empleado empleados [] = new Empleado[nEmpleados];
		for (int i = 0; i < empleados.length; i++) {
			String nombre = JOptionPane.showInputDialog("Nombre del empleado " + (i + 1) + ":");
			double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Sueldo del empleado " + (i + 1) + ":"));
			int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia de ingreso del empleado " + (i + 1) + ":"));
			int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes de ingreso del empleado " + (i + 1) + ":"));
			int agno = Integer.parseInt(JOptionPane.showInputDialog("A?o de ingreso del empleado " + (i + 1) + ":"));
			empleados[i] = new Empleado(nombre,sueldo,dia,mes,agno);
		}
		
		for(Empleado e : empleados) {
			e.setAumentaSueldo(5);
			System.out.println("Nombre: " + e.getNombre() + " "
					+ "Sueldo: " + e.getSueldo() + " "
					+ "Fecha de alta: " + e.getFecha());
		}
		
		
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
