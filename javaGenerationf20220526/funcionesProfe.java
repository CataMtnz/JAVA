package com.javaGenerationf20220526;
import java.util.Scanner;

public class funcionesProfe {

	public static void main(String[] args) {
		//Funciones
		//4 tipo de funciones
		// las funciones de tipo void, no retornan, solo ejecutan codigo 
		// nombre_funcion se escribe con minuscula la primera letra
		
		// se debe poner las variable dentro del main
		saludo();//LLAMADO AL METODO
		calculoSumaPares(true, 23, "33", 44l, "Sumar");
		int mayorEdad = 18;
		
		int edad = obtenerEdad(mayorEdad);// RETORNA UN INTEGER EN UNA VARIABLE TIPO ENT
		//INT E INTEGER SON DEL MISMO TIPO
		// ENTRE OBJETO Y PRIMITIVO DEL MISMO TIPO NO HAY CONFLICTOS
		// Float con float
		System.out.println(edad);
		
		boolean mayorOmenor = validarMayorEdad(edad);
		//DETERMINAR QUE HACER CON LA VARIABLE
	// ver los errores que generan y los posibles cambios
		//creamos otro mensajed distintode la validación
		if(mayorOmenor) {
			System.out.println("Pueded ingresar al curso");
		}else{
			System.out.println("No puede ingresar al curso");
		}
		
	}
	
	//accesador tipo_de_retorno nombre_funcion(parametro a recibir)
	public static void calculoSumaPares(boolean verdad,int numero1, String numero2, Long numero3, String accion) {
		
		System.out.println(numero1 + numero3 + Integer.parseInt(numero2));
		//casterlo string a numero INTEGER solo en esta operación FUNCIONA EL PARSEO/CASTEO
	}
	
	public static void saludo() { //VOID NO ACEPTA RETURN
		// SIN EL STATIC NO ME PERMITE ACCEDER AL METODO
		// SIN EL LLAMADO EN MAIN NO EJECUTA
		//solicitar el ingreso de datos
		System.out.println("Bueno dias");
	}
	
	//funciones que retornan un tipo de datos
	public static Integer obtenerEdad(int edad2) { //AGREGAR UN STATIC
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese edad");
		Integer edad = scanner.nextInt();//18;
		return edad;//retornar el contenido de la variable
		
	}   //retornar el contenido de la variable
		 

	public static Boolean validarMayorEdad(Integer edad) {
		
		if(edad >= 18) {
			System.out.println("Es mayor de edad");
			return true;
		}else {
			System.out.println("Es menor de edad");
			return false;
		}
		
		
		//return true; //false
	}

}
