package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestAtributos {

	public static void main(String[] args) {
		//OBJETO1
		Maquina m1=new Maquina("PILSENER","Amarilla tricolor","23123",0.20,20000);
		 m1.imprimir();
		//OBJETO2
		Maquina m2=new Maquina("CLUB","Verde naturaleza","23123",0.24);
		m2.imprimir();

	}

}
