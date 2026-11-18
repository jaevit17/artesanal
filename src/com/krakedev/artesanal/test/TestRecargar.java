package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestRecargar {

	public static void main(String[] args) {
		boolean resultado;
		Maquina roja=new Maquina("Pilsener","La amarilla tricolor","72345",0.20,20000);
		System.out.println("----------ESTADO INICIAL----------");
		roja.imprimir();
		System.out.println("-------------RECARGA1----------");
		resultado=roja.recargarCerveza(4000);
		System.out.println("Se recargo correctamente? "+resultado);
		roja.imprimir();
		System.out.println("-------------RECARGA2----------");
		resultado=roja.recargarCerveza(5000);
		System.out.println("Se recargo correctamente? "+resultado);
		roja.imprimir();
		System.out.println("-------------RECARGA3----------");
		resultado=roja.recargarCerveza(1000000);
		System.out.println("Se recargo correctamente? "+resultado);
		roja.imprimir();
	}

}
