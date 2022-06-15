package com.javaGenerationf20220525;

import java.util.Scanner;

public class CalculadoraWhile {

	public static void main(String[] args) {

		System.out.println("Ingrese la opción (1) Entrar; (0) Salir");
		// dos formas de terminar el termino que el usuario ingrese el termino de while
		// que el termino de la iteración se corte con el ciclo doWhile
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
			opcion = sc.nextInt();
		
		}while(opcion < 0 || opcion > 4);
		while (opcion == 1) {
			System.out.println("Bienvenido");
		while (opcion < 0 || opcion > 4) { // V i V = V

			System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
			opcion = sc.nextInt();
		}
		switch (opcion) {
		case 1:// sumar
				// accion para la opcion 1
			System.out.println("** Suma");
			break;
		case 2:
			System.out.println("** Resta");
			break;
		case 3:
			System.out.println("** Multiplicacion");
			break;
		case 4:// division
			System.out.println("** Division");
			break;
		default:
			System.out.println("opcion invalida");
			break;
		}
		}
		}
	}
