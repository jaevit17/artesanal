package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestServir {

	public static void main(String[] args) {
		double valor;
		Maquina roja=new Maquina("Pilsener","La amarilla tricolor","71345",0.02,8000);
		System.out.println("----------ESTADO INICIAL----------");
		roja.imprimir();
		System.out.println("----------LLENANDO MAQUINA----------");
		roja.llenarMaquina();
		roja.imprimir();
		System.out.println("----------SERVIR 1000 ML----------");
		valor=roja.servirCerveza(1000);
		System.out.println("Valor a pagar: "+valor);
		roja.imprimir();
		System.out.println("----------SERVIR 2000 ML----------");
		valor=roja.servirCerveza(2000);
		System.out.println("Valor a pagar: "+valor);
		roja.imprimir();
		System.out.println("----------SERVIR 6000 ML----------");
		valor=roja.servirCerveza(6000);
		System.out.println("Valor a pagar: "+valor);
		roja.imprimir();
		

	}

}
