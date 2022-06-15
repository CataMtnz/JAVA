package com.javaGenerationf20220525;

import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//para que reconozca el do la deifincion de variable se pone arriba
		int termino =20;
		do {
			System.out.println("el valor de termino es " + termino);
		//al menos se ejecuta una vez
		} while (termino <=10); //estructura del du while termina con ; tiene dos instrucciones distintas
		System.out.println("***************");
		while (termino <= 10) {
			System.out.println("el valor de termino es " + termino);
			termino++;
		}
		System.out.println("***fin***");
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("(0) salir \n (1) sumar \n (2) restar \n (3) multiplicar \n (4) dividir");
			opcion = sc.nextInt();
		
		}while(opcion < 0 || opcion > 4);
}
}