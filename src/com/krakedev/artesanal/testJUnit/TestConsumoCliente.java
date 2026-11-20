package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.Negocio;

public class TestConsumoCliente {
	@Test
	public void probarConsumo() {
		Maquina maquinaA=new Maquina("CLUB","robusta","4323",0.02,8000);
		Negocio barM=new Negocio("BarM",maquinaA);
		Cliente cliente=new Cliente("Josue","12345678");
		
		barM.cargarMaquinaA();
		barM.consumirCervezaMaquinaA(cliente,100);
		assertEquals(7700, maquinaA.getCantidadActual(),0.0001);
		assertEquals(2, cliente.getTotalConsumido(),0.0001);
		
		barM.consumirCervezaMaquinaA(cliente,200);
		assertEquals(7500, maquinaA.getCantidadActual(),0.0001);
		assertEquals(6, cliente.getTotalConsumido(),0.0001);
		
	}
}
