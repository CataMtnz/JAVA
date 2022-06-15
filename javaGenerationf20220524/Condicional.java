package com.javaGenerationf20220524;

import java.util.Scanner; //ctrl shift O cuidao
// en inteligy es alt "mayus" enter or alt shift enter

public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub // ponemos main para que se ejecute independientemente
		//ante un proycto solo se ebe tener un main
		Scanner sc = new Scanner(System.in);
		//capturar el ingreso por consola

	//validar la mayoría de edad
		//establecer nuestro punto crítico
    //solicitar el ingreso de edad
		
		
		//Ejercicio Casino
		//String
		System.out.println("Ingrese su nombre");
		String nombre= sc.nextLine();
		
		System.out.println("Ingrese su apellido");
		String apellido= sc.nextLine();
		
		System.out.println("Ingrese su región");
		String region= sc.nextLine();
		
		System.out.println("Ingrese su comuna");
		String comuna= sc.nextLine();
		
		System.out.println("Ingrese su dirección, sin número #");
		String direccion= sc.nextLine();
		
		System.out.println("Ingrese el número de dirección");
		String numeroDireccion= sc.nextLine();
		
		//puntos de quiebre
		
		int saldoMin =50000;
		
		
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();// estamos capturando el ingreso por consola
		
		if (edad >=18 ) {
			System.out.println("Usted es mayor de edad");
		} else {
			System.out.println("Usted es menor de edad");
			
			//Convención de grupo
			
		//package com.generation.dia20220524;
			import java.util.Scanner;

			public class condicional{
			    public static void main(String[] args){
			        /* if else y switch*/
			        Scanner sc = new Scanner(System.in);// ingreso por consola
			        //validar mayoria de edad
			        //establecer punto critico= de momento como la ley en chile



			        //ingreso de datos
			       // //int mayoriaEdad = 18;
			        //System.out.println("ingrese su edad");
			        //int edad = sc.nextInt(); //normalmente se usa nextline para usar parseint y verificar si es un numero

			        //nombre apellido direccion
			      // // System.out.println("ingrese nombre:");
			       // String nombre = sc.nextLine();
			       // System.out.println("ingrese apellido:");
			      // // String apellido = sc.nextLine();
			      // // System.out.println("ingrese region:");
			      //  String region = sc.nextLine();
			     // //  System.out.println("ingrese comuna:");
			      //  String comuna = sc.nextLine();
			    //    System.out.println("ingrese calle:");
			     // //  String calle = sc.nextLine();
			    //    System.out.println("¿Desea apostar?");
			     //   String apuesta = sc.nextLine();



			       // //edad numero direccion numero
			      // // System.out.println("Ingrese su numero de calle:");
			       // //int numCalle = sc.nextInt();
			      // // System.out.println("Ingrese su edad:");
			      //  int edad = sc.nextInt();

			        //billullo
			      // // System.out.println("Ingrese su saldo:");
			      //  float saldo = sc.nextFloat();


			        //puntos de quiebre
			      //  int saldoMin = 50000;
			      //  int minApuesta = 10000;


			        //validar
			        //mayoria edad(mas importante), billullo tiene q tener saldo minimo 50.000
			        //cuanto va a apostar, ojo que tiene que ser menos del saldo, minimo apuesta 10.000


			        //verificaciones
			       // if(edad>=mayoriaEdad && saldo >= saldoMin){
			            //variables boolean para ver si apuesta
			            //if y if else que entre a "si quiere apostar" si no, mensaje "vuelva pronto"
			          //  System.out.println("puede ingresar");
			       // }else if(edad>= mayoriaEdad && saldo<saldoMin){
			           // System.out.println("no esta permitido su ingreso");
			        //}
			    //}
			//}
		}
	}

}
