package com.javaGenerationf20220525;

import java.util.Scanner;

public class CalculadoraComisionesclases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese opción:");
		System.out.println("1 sumar \n 2 restar \n 3 multiplicar \n 4 dividir");
		int opcion = sc.nextInt();
		//Para trabajar con numeros
		switch (opcion) { // .toLowerCase
		//Ejemplo calculadora que se haga antes del case 
		//porque sería redundante pedir los datos consecutivamente
		//hay validaciones que se deben hacer para la division
		case 1: //para string  "1" la opción del usuario
			System.out.println("** Suma");
			break;
		case 2:
			System.out.println("** Resta");
			break;
		case 3:
			System.out.println("** Multiplicación");
			break;
		case 4:
			System.out.println("** División");
			break;

		default:
			System.out.println("opción invalida");
			break;
		}
		System.out.println("Fuera del Switch");
	}

}
