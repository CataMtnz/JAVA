package com.javaGenerationf20220526;

public class Funciones {

	public static void main(String[] args) { //NO PUEDE CREAR UNA FUNCION O METODO DENTRO DE OTRO METODO
		// Estructura de las funciones, el main ya es una función
		//4 tipos de funciones
		// 2 RETORNAN OTORGA UN VALOR
			//Entrega o no parametros??
		// 2 NO RETORNAN
		//Para crear una funcion se hae fuera

	}
	//procesador 1° //
	///creaicion de funcion de tipo publica PODEMOS LLAMARLA EN CUALQUIER INSTANCIA
	//ACCESADOR SON 3: PUBLICO PRIVADA PROTEGIDA
	//TIPO DE RETORNO : RETORNA O NO
	// NOMBRE FUNCION: SE ESCRIBE SIEMPRE CON MINUSCULA LA PRIMERA LETRA sUMA, calculoPares
	// (PARAMETROS A RECIBIR), PUEDE ENTREGAR O NO ENTREGAR PARAMETROS
		//DEFINIR EL TIPO DE DATOS DE LOS PARAMETROS
			// CUANDO NO QUEREMOS ENTREGAR ALGO ENTREGAMOS VOID EJ PUBLIC VOID SOLO EJECUTA CODIGO
	//(int numro1, Integer numero2)
	//Funciones
			//4 tipo de funciones
			// las funciones de tipo void, no retornan, solo ejecutan codigo 
			// nombre_funcion se escribe con minuscula la primera letra
			
		
		//accesador tipo_de_retorno nombre_funcion(parametro a recibir)
	public void calculoSumaPares(boolean verdad,int numero1, String numero2, Long numero3, String accion) {
			
		System.out.println(numero1 + numero3 + numero2 );
		}
		
	public void saludo() {
		//solicitar el ingreso de datos
		System.out.println("Bueno dias");
		}
		
		//funciones que retornan un tipo de datos
	public Integer obtenerEdad() {
			
		Integer edad = 18;
			
		return 18;//retornar el contenido de la variable
			
		}   

	public Boolean validarMayorEdad(Integer edad) {
			
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

