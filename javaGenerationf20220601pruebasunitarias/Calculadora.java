package com.javaGenerationf20220601pruebasunitarias;

public class Calculadora {

	public int suma(int num1, int num2) {
		return num1 + num2;
	}

	public int resta(int num1, int num2) {
		return num1 - num2;
	}

	public int multiplicacion(int num1, int num2) {
		return num1 * num2;
	}

	public String division(int num1, int num2) {
		if (num2 != 0) {
			String resultado = Integer.toString(num1 / num2);
			return resultado;
		}
		return "No se puede dividir por cero";
	}

	public String numeroPar(int num1, int num2) {
		if((num1/num2)%2 == 0){
			String resultado = "Es par";
			return resultado;
		}
		return "No se puede dividir por dos, es impar";
	}
	public String numeroImpar(int num1, int num2) {
		if ((num1/num2)%2 != 0) {
			String resultado = "Es impar";
			return resultado;
		}
		return "Se puede dividir por dos, es par";
	}
}
