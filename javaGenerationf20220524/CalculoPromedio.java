package com.javaGenerationf20220524;

public class CalculoPromedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //cantidade de notas UN SOLO RAMO es int porque es un numero pequeño
		//int cantidadNotas =12;
		//como crear un arreglo ENJAVA
		//DEQUEFORMAS HACER UN ARREGLO
		Integer[] notas = {20,-50,67,99,-10,0,88,77,58,79,33,101};
		
		//creamos variable acumuladora, que guarde la suma de todas las notas
		int sumaNotas =0;//20
		
		//creamos una variable contador
		int notasFueraDeRango =0;
		//un ciclo for para reccorrer el arreglo de notas
		for (int i = 0; i < notas.length; i++) {// i=0
			sumaNotas = sumaNotas + notas[i];
			
			// 24/05
		   // ver cuantas notas estan fuera de rango
		//notas.lenght lo podemos reemplazar en la formula de notas nos ahorramos la variable en fila 8
			//validar la nota (negativa o >100)
			//accedemos a la nota a través del indice el && no se complue porque nunca va a ser negativa o mayor a 100
			if(notas[i] <0 || notas[i] >100) {
				//indicar cuales son las notas fuera de rango y en que posición se encuentra
				System.out.println("la nota:" +notas[i] + " en el lugar "+ (i+1) + " esta fuera de rango"  );

			}
			//para confirmar que no hay errores
			if (notasFueraDeRango ==0) {//no hay notas fuera de rango
				System.out.println("Todas las notras ingresadas estan correctas");
			} else {
				System.out.println("Existen notas fuera de Rango, lo que genera errores al calcular el promedio");
			}
				
			}
			
		}
		//Acotar que al usuario no le importa la nota
		//este es informativo para el desarrollador
		System.out.println("suma de notas :" +sumaNotas);
		//crear una variable promedio que sea de tipo float para imprimir 
		float promedio = sumaNotas / notas.length;
		System.out.println("El promedio es: "+promedio);
		
		//OPCION 1 //general pero no valida errores de mal tipeo
		//if (promedio >= 50){
          //  System.out.println("Aprobado");
        //}else{
          //  System.out.println("reprobado");
        //}
		
		//OPCION2 SIEMPRE VA LO QUE SE EVALUA CON LO QUE ESTAMOS COMPARANDO
		if (promedio >= 50 && promedio <=100){
			System.out.println("Alumno aprobado");
		// PUNTO CRITICO ya que el usuario por mal tipeo puede dar mayir a 100
			//0>=reprobado<=49; 50>=Aprobado<=100
			//ADEMAS debemos poner una condicional intermedia entre elif y else para limitar lo que pone el usuario
			//creamos un if aninado enq ue cumpla las 2 cosas para controlarlo
		}else if(promedio >= 0 && promedio <50 ) {
        // <=49 SE PONE <50 ya que entre el rango 49 y 50 hay infinidad de numeros
        System.out.println("Alumno reprobado");
         }else{
        	 //se puede poner error en ingreso de dato en el ejercicio NOS DAN LOS DATOS
        System.out.println("Pida revisión de notas ya que no se puede calcular el promedio con las notas otorgadas");
         //Nos lleva a revisar las notas
         //nos dio un promedio negativo o 101
        }
		// TODO VALIDAR promedio >= 50 es IGUAL a ((50 >= promedio) NO TIENE SENTIDO)
		//int test=52;
		//if (51 >=test);{
			//System.out.println("es lo mismo");
		//PROBADO EL ERROR DE CALCULO DEL PROMEDIO
			//COMO PODEMOS PONER UN PAR DE ERRORES NEGATIVOS Y DA APROBADO en caso de tener que poner notas
			//} else if (finalAvg <= 0 || finalAvg > 100){
			//print an invalid response if negative or bigger than 100 values extracted from the IF ELSE
			//System.out.println("Invalid data, try again.");
		
		}

	}

