package com.cursoceat.controller;



import java.lang.reflect.Constructor;

public class Gestor {
	
	public String nombreGestor;
	private String telefono;
	double importeMax;
	
	//  Constructor con todos los atributos
	public Gestor(String nombreGestor, String telefono, double importeMax) {
		this.nombreGestor = nombreGestor;
		this.telefono = telefono;
		this.importeMax = importeMax;
	}
//	Constructor con solo nombre y telefono
	public Gestor(String nombreGestor, String telefono) {
		this.nombreGestor = nombreGestor;
		this.telefono = telefono;
		this.importeMax = 10000;
	}
//	Metodo getter solo para consultar el telefono
	public String getTelefono() {
		return telefono;
	}
	void mostrarInfoGestor() {
		System.out.println("Nombre >> "+this.nombreGestor+ "\nTelefono >> "+this.telefono+ "\nImporte Maximo >> "+this.importeMax+ "€");
	}
	

}

