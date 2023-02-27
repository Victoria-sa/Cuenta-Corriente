package com.cursoceat.controller;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		 mi objeto 1 >> miCta
		System.out.print("Indique el nombre >> ");
		String nombre = new Scanner(System.in).nextLine();
		System.out.print("Indique el Dni >> ");
		String midni = new Scanner(System.in).nextLine();
		
		CuentaCorriente miCta = new CuentaCorriente(nombre, midni);
//		preguntamos el importe a ingresar
		System.out.print("Cuanto quieres ingresar >> ");
		double miIngreso = new Scanner(System.in).nextDouble();
//		actualiza el saldo segun el importe ingresado
		miCta.ingreso(miIngreso);
//		pregunto el banco
		System.out.print("Nombre del Banco >> ");
		CuentaCorriente.setNombreBanco(new Scanner(System.in).nextLine());
//		preguntamos el importe a retirar
		System.out.print("Cuanto quieres retirar >> ");
		double miEgreso = new Scanner(System.in).nextDouble();
//		actualiza el saldo segun el importe retirado
		miCta.egreso(miEgreso);
		Gestor miGestor1 = new Gestor("Antonio Gonzalez", "654896254");
		miCta.miGestor = miGestor1;
//		mostramos la informacion
		miCta.mostrarInformacion();
//		creo mi objeto 2 >> miCta2
		System.out.println("********Creo objeto 2 ********");
		System.out.print("Indique le DNI >> ");
		midni = new Scanner(System.in).nextLine();
		System.out.print("Indique el saldo inicial al crear la cuenta >> ");
		Double saldoInicial = new Scanner(System.in).nextDouble();
		CuentaCorriente miCta2 = new CuentaCorriente(midni, saldoInicial); // llama al cosntructor
		System.out.print("Indique el nombre >> ");
		miCta2.nombre = new Scanner(System.in).nextLine(); //llamar
		Gestor miGestor2 =new Gestor("Beatriz Lopez", "626598741");
		miCta2.miGestor = miGestor2;
		System.out.print("Datos de la cuenta 1: ");
		miCta.mostrarInformacion();
		System.out.print("Datos de la cuenta 2: ");
		miCta2.mostrarInformacion();
		
		
		
	}

}
		
		
		
		
		
	


