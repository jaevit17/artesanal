package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestLlenarJUnit {
	@Test
	public void testLlenarMaquina() {
		Maquina roja=new Maquina("Pilsener","cerveza","23124",0.02,8000);
		roja.llenarMaquina();
		assertEquals(7900, roja.getCantidadActual(),0.0001);
	}
}
