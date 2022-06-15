package com.javaGenerationf20220523;

public class Main {

	public static void main(String[] args) {
		// Tipos de variables
		//En JAVA tenemos que definir el tipo de dato al cual pertence
		//VARIABLES DE TIPO TEXTO, estructura:
		//Tipo de dato, nombre de la variable, inicializar/asignación, nomenclatura string ""
		String nombre = "Catalina";
		System.out.println(nombre);
		//es un caracter que vale 16 bytes
		// cuando queira trabajar con un caracter lo haga con comill simple
		// el char lo utilizamos para crear varios char en un solo texto
	
		char LetraA = 'a';
		System.out.println(LetraA);
		
		//variable booleana valor true o false
		boolean acepta = true; //o false 
		System.out.println(acepta);
		
		//variables numericas
		// int es para numeros enteros, que no estan con puntodecimal
		// 32 bit, 2147483648 a 2147483647
		int numeroInt = 26;
		System.out.println(numeroInt +2);
		// byte deja hasta el 127
		// 8 bit
		byte numeroByte = (100);
		System.out.println(numeroByte);
		// short deja hasta 32767
		// 16 bit
		short numeroShort = (234);
		System.out.println(numeroShort);
		// long 9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
		// 2147483647 999999999
		//64 bit, al buscar debes poner como LONG PRIMITIVO
		long numeroLong = (999999999);
		System.out.println(numeroLong);
		
		//float y double aceptan decimales
		
		//TAREA Género
		//Color de cabello
		//Si están comprometidos o no
		
		String genero = "Indique su genero";
		System.out.println(genero);
		
		String colorCabello = "Castaño rojizo";
		System.out.println(colorCabello);
		//
		boolean compromiso = true;
		if (compromiso ==true) {
			System.out.println("Usted esta comprometido");
		}
		else {
			System.out.println("Usted NO esta comprometido");
			}

		// Se podría hacer una base de datos
		//boolean generoF = true;
		//boolean generoM = false;
		
		
		//Tarea QUE VA A ALMACENAR ESTA VARIABLE
		//Población 
		//Edad
		//Nombre
		//Ocupación
		//Género
		
		int población = 777;
		System.out.println(población);
		
		String poblaciónMetros2 = "888";
		System.out.println(poblaciónMetros2);
		
		int edad = 26;
		System.out.println(edad);
		
		String nombre2 = "Ingrese su nombre";
		System.out.println(nombre2);
		
		String ocupación = "Ingrese su ocupación";
		System.out.println(ocupación);
		
		//Para Genero
		
		//Variables de tipo objeto
		System.out.println(poblaciónMetros2.charAt(2));
		
		//String.
		//Los String se comparan con equals
		
		//DEBEN SER ESTRICTAMENTE IGUALES
		String curso ="G1";
		System.out.println(curso);
		
		if(curso.equals("g1")) {
			System.out.println("iguales");
		}else {
			System.out.println("distintos");
		}
		
		//TRANSFORMA TODO EN MAYUSCULA
		String curso1 = "G1";
		if(curso1.equalsIgnoreCase("g1")) {
			System.out.println("iguales");
		}else {
			System.out.println("distintos");
		
			
		}
		if(curso1.toLowerCase().equals("g1")) {
			System.out.println("iguales");
		
		}
		if(curso1.equals("g1".toUpperCase())) {
			System.out.println("iguales");
		}
		//String curso2 = ""; //variable vacía
		//Strig curso3= null; // VARIABLE NULA EMPTY no tiene anda asignado solo esta creada 
		//curso1.isBlank();
		//curso1.isEmpty();
		//if(null.equals(curso3) ) {}
		
		String curso3 = null;     //null
		//comparar un String con null
		if(null == curso3 ) {}
		
		//FLOAT Y DOUBLE
		float altura = 1.61f; //CASTEO CONVERTIR UN DATO A OTRO TIPO DE DATO
		//float altura1 = (float)1.61; =float altura1 =1.73f;
		Float peso = 93.4f;
		System.out.println(altura +"\n" +peso);
		
		Float gravedad = Float.parseFloat("9.6");
		System.out.println(gravedad);
		
		//CONVERTIR 
		Integer.parseInt("25");
		Long.parseLong("99999999999");
		Float.parseFloat("93.4");
		Double.parseDouble("12345.67");
		
		//Entregue los datos en PRIMIMTIVO Y OBJETO visceversa
		int edad3 = (int)25;
		long caminarMetros = (long)100;
		float peso1 = 93.4f;
		double altura1 = (double)1.61;
		System.out.println(edad3 +" "+ caminarMetros +" "+ peso1 +" "+altura1);
		
		Integer.parseInt("25");
		Long.parseLong("100");
		Float.parseFloat("93.4");
		Double.parseDouble("1");
		System.out.println(edad3 +" "+ caminarMetros +" "+ peso1 +" "+altura1);
		
		Double peso2 = 93.4;
		//OPCIÓN2
		//float peso2PF =  peso2.floatValue();
		//Float peso2F =  peso2PF;
		//System.out.println(peso2F);
		float peso2F = peso2.floatValue();
		System.out.println(peso2);
		
		//Diferencias de nomenclatura
		//float numPrimitico = 123.4f;
		//Float numObjeto = 123.4;
		
		//OPCION 1 Float.valueOf(peso2.toString())

		//peso2.toString();
		//Comparación de expresión identica 5 == 5si son iguales
		//se sale el guarning cuando asignamos variables
		int dos = 23214;
		int tres = 3345678;
		//como buena practica crear variable para el if
		if( 5 == (tres+dos) ) {
			
		}

		}
		
	}

