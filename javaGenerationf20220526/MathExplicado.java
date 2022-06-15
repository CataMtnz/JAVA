package com.javaGenerationf20220526;

public class MathExplicado {//NO SE PUEDE CREAR EL PACKAGE CON PALABRAS RESERVADAS

	public static void main(String[] args) {
		// elevar/ potencia
		double numeroElevado = Math.pow(4.5, 3); //EL POW VIENE DOBLE
		// POW: (numero, exponente) 
		System.out.println(numeroElevado);
		
		//Redondear al entero mayor
		double enteroMayor = Math.ceil(numeroElevado);
		// 
		System.out.println(enteroMayor);
		
		//edondear al entero menor
		double enteroMenor = Math.floor(numeroElevado);
		//
		System.out.println(enteroMayor);
		
		//Redondeo
		double enteroRedondeado = Math.round(3.4);
		// CORTA
		System.out.println(enteroRedondeado);
		//
		//double enteroMenor = Math.floor(enteroMayor);
		//
		//System.out.println(enteroMayor);
		
		//PRIMERO VERIFICAR QUE VALOR TIRA LAS VARIABLES
		
		//double num1 = 12;
		//double num2 = 5;
		//double div = num1/num2;
		//System.out.println(div);//
		
		//numeros aleatorios
		double aleatorio = Math.random(); //randmo agrega >= 0.0 y <1.0
		System.out.println(aleatorio);
		
		//numeros aleatorios entre RANGOSUPERIOR
		double num010 = Math.random()*10; //randmo agrega >= 0.0 y <1.0
		System.out.println(num010);
		
		//numeros aleatorios entre RANGOS INICIAL CON FINAL
		// con la otra 8.679748180489458
		// (Math.random()*(FINAL-INICIAL))+INICIAL;
		double nummenos23 = (Math.random()*(3+2))+-2; //randmo agrega >= 0.0 y <1.0
		System.out.println(nummenos23);
		
		//Numero aleatorio
		double nummenos24 = (Math.random()*(3+2))+-2; //randmo agrega >= 0.0 y <1.0
		System.out.println(nummenos24);
		//System.out.println("negativo " + num44.intValue());

	}

}
