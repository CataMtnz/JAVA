package com.javaGenerationf20220601pruebasunitarias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void test() {
		/*se debe ser especifico para decir cual es el valor que va a requerir*/
		Calculadora calc = new Calculadora();
		int resultado =calc.suma(12, 42); //54
		
		//assertEquals(valorEsperado,resultado);
		assertEquals(54,resultado);
		
		}
	

}
