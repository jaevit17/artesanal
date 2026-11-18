package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestLlenar {

	public static void main(String[] args) {
		Maquina roja=new Maquina("Pilsener","La amarilla tricolor",0.20,20000);
		roja.imprimir();
		System.out.println("---------");
		roja.llenarMaquina();
		roja.imprimir();
		//OBJETO2
		System.out.println("====================================================");
		Maquina negra=new Maquina("CLUB","La negra wi",0.25);
		negra.imprimir();
		System.out.println("---------");
		negra.llenarMaquina();
		negra.imprimir();
		
	}

}
