package com.javaGenerationf20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {

	public static void main(String[] args) {
		// COLECCIONES MAP O HASHMAP
		//Pares clave <-> valor
		//HashMap<K, V> key, value
			//al igual que la array list debemoms crear una instancia
		//EXISTEN 2 FORMAS DE ESCRIBIRLO
		
		// 1:HashMap<K, V> map = new HashMap<K, V> ();
		// 2:HashMap mapa = new HashMap(); EL MAS UTILIZADO
		
		// Se genera para PARTE 2
		HashMap<String, String> objHashMap = new HashMap<> ();
		// AQUI ESTABLECEMOS CLAVE VALOR, Y NOS LIMITAMOS EN LOS TIPOS DE DATOS A ASIGNAR
		
		// HashMap objHashMap = new HashMap(); // SE COMENTA PARA PARTE 2
		// GENERA DIFUCULTAD PARA RECORRER, 
		//VARIABLE. PARA VER LAS OPCIONES
		// misma estructura
		// Al posicionarse en el put (OBJK,OBJV)
		// SI NO ENCUENTRA LA LLAVE/KEY ARROJA UN NULL
		
			//OTRAOPCION
		//String nombre = "Andrea";
		//objHashMap.put("Nombre2", nombre);
		// puedes agregar un objeto como clave y obj como valor
		objHashMap.put("Nombre", "Catalina");
		objHashMap.put("ApellidoP", "Martínez");
		objHashMap.put("ApellidoM", "Flores");
		objHashMap.put("edad", "25");
		//POR DEFAULT MAYUSCULAS AL PRINCIPIO Y MINISCULAS AL FINAL
		
		
		//PUEDE DETECTAR LA CLAVE Y REASIGNAR EL VALOR
		
		System.out.println(objHashMap);
		
		//TRABAJAMOS CON CLAVEF VALOR no con posiciones
		System.out.println(objHashMap.get("ApellidoM"));
		
		//ELiminar un par 
		System.out.println(objHashMap.remove("edad")); //NO ME SIRVE ?? REV. DEBO PONERLO SEPARADO
		// Imprimiendo el mapa
		objHashMap.remove("edad");
		
		System.out.println(objHashMap);
		
		// MUESTRA LLAVES DISPONIBLES
		System.out.println(objHashMap.keySet());	
		
		//MUESTRA LOS VALORES DISPONIBLES
		System.out.println(objHashMap.values());	
		
		
		//CREAR ARREGLO DINAMICO
		ArrayList<String> vocales = new ArrayList<String> ();
		//EL ARRAY LIST ES UN OBJETO
		// DINAMICO Y ENTREGA FUNCIONES
		vocales.add("a");
		vocales.add("e");
		vocales.add("i");
		vocales.add("o");
		vocales.add("u");
		// para una sola clave, AGREGAMOS UN OBJETO DE TIPO ARRAYLOST
		// objHashMap.put("vocales",vocales); COMENTADO PARA PARTE 2
		//put (clave objeto vocales,valor ARRAY);  
		
		System.out.println(objHashMap.get("vocales"));
		
		//como recorrer 
		
		//PARTE 2
		// SI BIEN String ES UN OBJETO NO SABE QUE TIPO DE OBJETO ES 
		// por ello no se utiliza for (String
		for(Object clave : objHashMap.keySet()) {
			System.out.println("clave: "+clave +" - valor: "+objHashMap.get(clave)); 
			
		}

		
	}

}
