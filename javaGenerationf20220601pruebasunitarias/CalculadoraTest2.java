package com.javaGenerationf20220601pruebasunitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest2 {
	/*
	 * TDD o Test-Driven Development (desarrollo dirigido por tests) ya que cuando
	 * el usuario haga tal acción el usuario es tal
	 */
	@Test
	public void testSuma() {
		/* se debe ser especifico para decir cual es el valor que va a requerir */
		Calculadora calc = new Calculadora();
		int resultado = calc.suma(12, 42); // 54

		// assertEquals(valorEsperado,resultado);
		assertEquals(54, resultado);
		//asertFalse
		assertFalse(false);
		
		assertNotEquals(resultado, resultado);
	
	}
	@Test
	public void testResta() {
		Calculadora calc = new Calculadora();
		int resultado = calc.resta(10, 4);//6 

		assertEquals(6, resultado);
		assertNotEquals(true, resultado);
	}

	@Test
	public void testMultiplicacion() {
		Calculadora calc = new Calculadora();
		int resultado = calc.multiplicacion(5, 5); // 25

		assertEquals(25, resultado);
		//assertNotEquals(!25, resultado);
		//es netamente del Test
		//assertFalse(false);
	}
	
	@Test
	public void testDivision() {
		Calculadora calc = new Calculadora();
		String resultado = calc.division(0, 0); //(5, 5) = 1

		//assertEquals("1", resultado);
		assertEquals("No se puede dividir por cero",resultado);
		assertNotNull(resultado);
		
		assertThrows(resultado, null, null);
	}
	@Test
	public void testNumeroPar() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumeroImpar() {
		fail("Not yet implemented");
	}
	
}
