package com.cursoceat.controller;

public class CuentaCorriente {

	
	Gestor miGestor;
	public String nombre;
	String dni;
	private double saldo;
	static private String nombreBanco = "International Java Bank";
	
	
//	metodos getter (get) y setter (set) de nombreBanco 
	public static String getNombreBanco() {
		return nombreBanco;
	}
	public static void setNombreBanco(String nombreBanco) {
		CuentaCorriente.nombreBanco = nombreBanco;
	}
	public CuentaCorriente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = 0;
	}
	public CuentaCorriente(String dni, double saldo) {
		this.dni = dni;
		this.saldo = saldo;
		this.nombre = "Sin definir";
	}
	
	public CuentaCorriente(String nombre, String dni, double saldo, Gestor miGestor) {
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = saldo;
	}
//	asignar un nuevo objeto gestor a la Cta
	void setGestor (Gestor miGestor) {
		this.miGestor = miGestor;
	}
	boolean egreso (double cant) {
		boolean operacionPosible;
		if (saldo>=cant) {
			saldo-=cant;
			System.out.println("Tú nuevo saldo es >> "+saldo);
			operacionPosible = true;
		}else {
			System.err.println("No tiene saldo suficiente... Ingreseeeeee");
			operacionPosible = false;
		}
		return operacionPosible;
	}
	void ingreso (double cant) {
		saldo += cant;
		System.out.println("Tú nuevo saldo es >> "+saldo);
	}
	void mostrarInformacion() {
		if (miGestor == null) { // la cuenta no tiene gestor asignado
			System.out.println("Cuenta sin Gestor");
		}else {
			System.err.println("Informacion del Gestor");
			miGestor.mostrarInfoGestor();
		}
//		mostramos informacion de la cta
		System.out.println("*** Informacion de la cuenta ***");
		System.out.println("Nombre >> \t"+nombre);
		System.out.println("Dni >>    \t"+dni);
		System.out.println("Saldo >>  \t"+saldo+ "€");
		System.out.println("Banco >>  \t"+nombreBanco);
	}
}
	
	
	
	
	
	
	
	

