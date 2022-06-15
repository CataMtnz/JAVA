package com.javaGenerationf20220526;

import java.util.Arrays;
//SON FIJOS NO SE PUEDE VARIAR EL TAMAÑO SOLO REASIGNAR

public class ColeccionArray {

	public static void main(String[] args) {
		// Array: puede contener más de un tipo de datos, 
		//DEFINIR EL TIPO DE DATOS
		String [] colores = {"red","blue","yellow","orange","black"};
		Integer [] numPares = {2,4,6,8,10};
		//Double [] num = {2,4,6,8,10};
		//int[] numPares = {2,4,6,8,10};
		int[] primeros = {1,2,3,4,5,6,7,8,9,0};
		
		//posición inicial es cero
		//nombreArray[posición] -->accediendo
		
		System.out.println(colores [0]);
		System.out.println(numPares [3]);
		System.out.println(primeros [7]);
		
		numPares [3] = 14; //reasignamos modificamos el elemento en esa posición
		System.out.println(numPares[3]);
		
		//numPares [7] GENERA ERROR NO SE PUEDE IMPRIMIR NI CREAR A DIFERENCIA DE JAVASCRIPT
		
		System.out.println("Tamaño array colores:" +colores.length);
		System.out.println("Tamaño array numPares:" +numPares.length);
		System.out.println("Tamaño array primeros:" +primeros.length);
		
		System.out.println(colores);
		System.out.println(numPares);
		System.out.println(primeros); //imprime el tipo de array y la localización de la información
		System.out.println(primeros.toString()); // es para imprimirlo sin necesidad de recorrer el recorrido
		
		//imprimir todo el arreglo
		System.out.println(Arrays.toString(colores));
		
		//recorrer el arreglo
		for (int i = 0; i < primeros.length; i++) {
			System.out.println(primeros [i] + " ");//con salto de linea
			//System.out.print(primeros [i]); DEBE SER EN 3 FOR DISTINTOS POR ESO EL ERROR
			
		}
		//foreach
		for (String elemento : colores) {
			System.out.println(elemento);
		}
		for (int i = 0; i < primeros.length; i++) {
			System.out.println(primeros [i] + " ");//con salto de linea
	}

	}

}
