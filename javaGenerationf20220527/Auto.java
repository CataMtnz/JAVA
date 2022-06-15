package com.javaGenerationf20220527;

public class Auto {

	/*LUVIA DE IDEA PARA EL CONCEPTO OBJETO
	1 Clase es un modelo o prototipo
	2 objeto proviene de una clase, tiene características, 
	3 tiene metodos o funciones
	4 algo concreto lo convertimos en abstracto (no tangible), definimos sus características 
	5 Definimos las caracteristicas producto de una accion, (metodos y funciones)
	6 tangible que lo puedo sentir y tocar
	
 Definimos las caracteristicas DE UN OBJETO producto de una accion (metodos y funciones)
   TENER EN CUENTA EL VALOR AGREGADO
   EL OBJETO ES CREADO Y NO SIEMPE PARA SU OBJETIVO INICIAL
*/
	
	//ATRIBUTO DE COLABORACION
	// ES TOMAR UN OBJETO Y USARLO COMO ATRIBUTO
	
	//SIEMPRE
	//atributo
	//constructores
	//accesadores y mutadores (get y set)
	//metodos o funciones
	
	
	//atributos LOS ATRIBUTOS SON PRIVADOS
	private String color;
	private String marca;
	private String modelo;
	private Double velocidad;
	
	//constructores
	// SI LO DEJAMOS PRIVADO NO MAVOS A PODER ACCEDER
	//CLICK DERECHO SOURCE, GENERATE CONSTRUCUTR USING FIELD
	public Auto(String color, String marca, String modelo, Double velocidad) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
	}
    //CONSTRUCTOR CON PARAMETRO
	//CLICK DERECHO SOURCE, GENERATE CONSTRUCUTR USING FIELD SIN SELECCIONAR NADA
	public Auto() {
		super();
	}
	
	//accesadores y mutadores (get y set)
	//CLICK DERECHO SOURCE, GENERATE GETTER AND SETTER
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
	
	//metodos o funciones
	//FUNCIONES PERSONALIZADAS
	public void aumentarVelocidad() {
		//  NO SE OCUPA STATIC EN LAS FUNCIONES CREADAS DENTRO DE UN OBJETO
		//this a este atributo/variable le agregamos un valor
		this.velocidad =10d;
		
	}
	
	
	
}
