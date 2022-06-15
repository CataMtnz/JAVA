package com.javaGenerationf20220530;

import java.util.ArrayList;
import java.util.List;

import com.javaGenerationf20220531.Cliente;

public class Main {

		public static void main(String[] args) {
			/* crear una lista para agregar al alumno
			recomendación siempr hace un ArrayList al otro lado
			 agregar de manera dinamica
			 INTERFAZ SOLO ES definición de métodos SOLO LA ESTRUCTURA
			Lista es una interfaz de coleccion de elementos guardado con secuencia, ACCEDEMOS A ELLO CON CON UN INDICE
			Array list es una clase de lista, arreglo dinamico, atributos, funciones y metodos
			 */ 
			List<Alumno> listaG4 = new ArrayList<Alumno>();
			
			//intancia de una clase
			Alumno alumno = new Alumno();
			Alumno alumno1 = new Alumno();
			Alumno alumno2 = new Alumno();
			Alumno alumno3 = new Alumno();
			Alumno alumno4 = new Alumno();
					
			alumno = new Alumno("Danko", "Abarca", 25, "G1");
			alumno1 = new Alumno("Catalina", "Martínez", 25, "G1");
			alumno2 = new Alumno("Esteban", "Castañeda", 22, "G1");
			alumno3 = new Alumno("Katherina", "Orellana", 24, "G1");
			alumno4 = new Alumno("Wladimir", "Rojas", 27, "G1");
			
			listaG4.add(alumno);
			listaG4.add(alumno1);
			listaG4.add(alumno2);
			listaG4.add(alumno3);
			listaG4.add(alumno4);
			/*.get accedemos al arreglo listaG4.get(i). OBJETO EN ESA POSICION y luego ACCEDEMOS las caracterisitcas propias del objeo
			 * */
			for (int i = 0; i < listaG4.size(); i++) {
				System.out.println(listaG4.get(i).getNombre());
				System.out.println(listaG4.get(i).getApellido());
			}
			//for each sale la lista completa OBJETO ALUMNO
			//for each ES MAS ESPECIFICO objetoAlumno
			for (Alumno objetoAlumno : listaG4) {
				System.out.println(objetoAlumno.getNombre());
				System.out.println(objetoAlumno.getCurso());
				System.out.println(objetoAlumno.toString());
				
			}
	
			
			/* UNA FORMA
			 * System.out.println("Alumno 1" + " " + alumno.datos());
			System.out.println("Alumno 2" + " " + alumno1.datos());
			System.out.println("Alumno 3" + " " + alumno2.datos());
			System.out.println("Alumno 4" + " " + alumno3.datos());
			System.out.println("Alumno 5" + " " + alumno4.datos());*/
			
			/*otra forma aplicando toString
			 * nos permite generar el contenido de TODOS LOS METODOS
			 * accedemos al valor de los atributos en este momento
			 */
			
			System.out.println(alumno.toString());
			System.out.println(alumno1.toString());
			System.out.println(alumno2.toString());
			System.out.println(alumno3.toString());
			System.out.println(alumno4.toString());
			
		}
		
	}
	
