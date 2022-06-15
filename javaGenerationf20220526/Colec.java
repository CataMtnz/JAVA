package com.javaGenerationf20220526;

import java.util.ArrayList;

public class Colec {

	public static void main(String[] args) {
		// Array DE TIPO OBJETO PUEDE CAMBIAR SU LENGHT
		// PARA VER EL TAMAÑO LENGTH ESTATIVO, SIZE DINAMICO
		//ESTATICO CORCHETE, DINAMICO OMVIBLE
		ArrayList<String> colores = new ArrayList<String> ();
		ArrayList<Integer> numerosPares = new ArrayList<Integer>();
		
		colores.add("rojo");
		System.out.println(colores);
		colores.add("azul");
		colores.add("amarillo");
		colores.add("verde");
		colores.add("naranjo");
		colores.add("rojo"+"amarillo"+"verde"+"naranja"+"azul");//concadenación de string
		System.out.println(colores);
		
		//se posiciona en el elemento si existe lomueve a la derecha
		colores.add(1,"verde");
		System.out.println(colores);
		// si accedo a un elemento que no esta geenra error. si pongo un elemento en la posicion subsiguiente a la final da error
		
		//acceder a un elemento
		System.out.println(colores.get(2));
		
		//tamaño del arreglo 
		System.out.println(colores.size());
		
		// SET PARA MODIFICAR 
		colores.set(1, "negro");
		System.out.println(colores);
		
		//Para remover 
		System.out.println(colores.remove(2)); //QUE OCURRE SI ELIMINO NOMBRES STRING CON COSAS QUE SE REPITAN 
		System.out.println(colores);
		
		for (int i = 0; i < colores.size(); i++) {
			System.out.println(colores.get(i));
			
		}
		
		for (int i = 0; i < colores.size(); i++) {
			System.out.println(colores.get(i));
		}
		//quitar todos los elementos
		colores.clear();
		System.out.println(colores);
		
		
		}
	
	}

