package com.javaGenerationf20220523;

public class CalculoPromedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //cantidade de notas UN SOLO RAMO es int porque es un numero pequeño
		//int cantidadNotas =12;
		//como crear un arreglo ENJAVA
		//DEQUEFORMAS HACER UN ARREGLO
		Integer[] notas = {20,50,67,99,10,0,88,77,58,79,33,50};
		
		//creamos variable acumuladora, que guarde la suma de todas las notas
		int sumaNotas =0;//20
		//un ciclo for para reccorrer el arreglo de notas
		for (int i = 0; i < notas.length; i++) {
			sumaNotas = sumaNotas + notas[i];
		//notas.lenght lo podemos reemplazar en la formula de notas nos ahorramos la variable en fila 8
			
		}
		System.out.println("suma de notas :" +sumaNotas);
		//crear una variable promedio que sea de tipo float para imprimir 
		float promedio = sumaNotas / notas.length;
		
		OPCION 1
		if (promedio >= 50){
            System.out.println("Aprobado");
        }else{
            System.out.println("reprobado");
        }
		
		//OPCION2 SIEMPRE VA LO QUE SE EVALUA CON LO QUE ESTAMOS COMPARANDO
		//if (promedio >= 50 && promedio <=100 ){
         //   System.out.println("Aprobado");
       // }else{
        //    System.out.println("reprobado");
        //}
		// TODO VALIDAR 
		

	}

}
