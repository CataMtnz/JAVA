package com.javaGenerationf20220525;

//import java.util.Scanner;

//public class CalculadoraWhile {

//public static void main(String[] args) {

//System.out.println("Ingrese la opción (1) Entrar; (0) Salir");
// dos formas de terminar el termino que el usuario ingrese el termino de while
// que el termino de la iteración se corte con el ciclo doWhile
//Scanner sc = new Scanner(System.in);
//int opcion = 0;
//do {
//	System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
//	opcion = sc.nextInt();

//}while(opcion < 0 || opcion > 4);
//while (opcion == 1) {
//	System.out.println("Bienvenido");
//while (opcion < 0 || opcion > 4) { // V i V = V

import java.util.Scanner;

public class CondicionalSwitch {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // creacion clase Scanner

		// creacion de variables
		int num1, num2, suma, resta;
		float division, multiplicacion;

		// pedimos al usuario su dato de entrada
		System.out.println("Ingrese opción: ");
		System.out.println("1.- Sumar \n2.- Restar \n3.- Multiplicar \n4.- Dividir");

		// ingresa dato del usuario
		int opcion = Integer.parseInt(entrada.nextLine());

		// pedir dos numeros
		System.out.println("Ingrese dos números para la operación: ");

		// ingresa dos números
		num1 = Integer.parseInt(entrada.nextLine());
		num2 = Integer.parseInt(entrada.nextLine());

		switch (opcion) {
		case 1:
			suma = num1 + num2; // redefinimos suma
			System.out.println("La suma es igual a: " + suma);
			break;
		case 2:
			resta = num1 - num2;
			System.out.println("La resta es igual a: " + resta);
			break;
		case 3:
			multiplicacion = num1 * num2;
			System.out.println("La multiplicacion es igual a: " + multiplicacion);
			break;
		case 4:
			if (num2 == 0) {

				System.out.println("La división no debe ser por 0");

			} else {

				division = num1 / num2;
				System.out.println("La division es igual a: " + division);
			}
			break;
		default:
			System.out.println("Opción no reconocida");
			break;
		}
		entrada.close();
	}
}

//
