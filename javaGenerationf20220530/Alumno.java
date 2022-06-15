package com.javaGenerationf20220530;

public class Alumno {
	/*
	 * Atrivutos : 
	 * private , protected , public 
	 * private nos permite trabajar con uno de los 4 pilares
	 * private = ENCAPSULACION, este huevito que no todos tengan acceso al interior 
	 * private = SOLO ACCEDEMOS DENTRO DE LA MISMA CLASE. departamento
	 * protected = accedemos a todos lo dentro del package. edificio
	 * public = parque publico 
	 * LOA ATRIBUTOS CARACTERISTICAS DEL OBJETO en general son en singular al igual que el objeto Alumno,
	 * SOLO CON MATRIZ ARRAY se utiliza nombres de atributos plurales
	 * Se acostumbra a hacer 
	 * una junta curso letra
	 * curso numeral
	 * curso letra
	 * ya que la cocadednación de ambos con o sin cambios
	 * */
		//atributos    //private, usados en la misma clase, protected para todos dentro del package, public puede acceder todo
		private String nombre;
		private String apellido;
		private int edad;
		private String curso;
		//constructores
		//get y set
		//funciones
		
		public Alumno() {
			
		}
		
		public Alumno (String nombre, String apellido, int edad, String curso) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.curso = curso;
			
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		
		public String datos() {
			
			return "Los datos son los siguientes: Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Edad: " + this.edad + ", Curso: " + this.curso;
		}

		@Override
		public String toString() {
			return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", curso=" + curso + "]";
		}
		
		
		
		
	}