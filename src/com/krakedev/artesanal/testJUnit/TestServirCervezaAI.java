
package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestServirCervezaAI {

	@Test
	public void testServirCervezaCorrectamente() {

		// CASO 1: Verificar que se sirva correctamente la cerveza,
		// se descuente la cantidad servida y se calcule el valor a pagar.

		Maquina maquina = new Maquina("Pilsener", "Cerveza rubia", 0.05, 5000);

		maquina.llenarMaquina();

		double resultado = maquina.servirCerveza(100);

		assertEquals(5.0, resultado, 0.0001);
		assertEquals(4800, maquina.getCantidadActual(), 0.0001);
	}

	@Test
	public void testServirTodaLaCervezaDisponible() {

		// CASO 2: Verificar que se pueda servir toda la cerveza disponible
		// y que la cantidad actual quede en cero.

		Maquina maquina = new Maquina("Club", "Cerveza rubia", 0.04, 1000);

		maquina.llenarMaquina();

		double resultado = maquina.servirCerveza(900);

		assertEquals(36.0, resultado, 0.0001);
		assertEquals(0, maquina.getCantidadActual(), 0.0001);
	}

	@Test
	public void testCantidadInsuficiente() {

		// CASO 3: Verificar que no se sirva cerveza cuando la cantidad
		// solicitada supera la cantidad disponible.

		Maquina maquina = new Maquina("Corona", "Cerveza importada", 0.03, 1000);

		maquina.llenarMaquina();

		double resultado = maquina.servirCerveza(950);

		assertEquals(0, resultado, 0.0001);
		assertEquals(900, maquina.getCantidadActual(), 0.0001);
	}

	@Test
	public void testNoModificarCantidadCuandoNoAlcanza() {

		// CASO 4: Verificar que la cantidad actual de cerveza
		// no se modifique cuando no existe suficiente disponibilidad.

		Maquina maquina = new Maquina("Heineken", "Cerveza verde", 0.06, 2000);

		maquina.llenarMaquina();

		double cantidadInicial = maquina.getCantidadActual();

		double resultado = maquina.servirCerveza(2500);

		assertEquals(0, resultado, 0.0001);
		assertEquals(cantidadInicial, maquina.getCantidadActual(), 0.0001);
	}

	@Test
	public void testConstructorTresParametros() {

		// CASO 5: Verificar el funcionamiento del constructor de tres
		// parametros y comprobar que se pueda servir cerveza correctamente.

		Maquina maquina = new Maquina("Stella", "Cerveza premium", 0.08);

		assertEquals(10000, maquina.getCapacidadMaxima(), 0.0001);

		maquina.llenarMaquina();

		double resultado = maquina.servirCerveza(200);

		assertEquals(16.0, resultado, 0.0001);
		assertEquals(9700, maquina.getCantidadActual(), 0.0001);
	}

	@Test
	public void testMaquinaSinCerveza() {

		// CASO 6: Verificar que no se pueda servir cerveza cuando
		// la maquina esta vacia y que no se modifique su cantidad actual.

		Maquina maquina = new Maquina("Budweiser", "Cerveza americana", 0.05, 3000);

		double resultado = maquina.servirCerveza(100);

		assertEquals(0, resultado, 0.0001);
		assertEquals(0, maquina.getCantidadActual(), 0.0001);
	}
}
