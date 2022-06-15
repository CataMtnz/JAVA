package com.javaGenerationf20220531;

import java.util.List;

public class Cliente {
	private String rut;
	private Integer id; //identificador
	private List <Integer> numerosVenta;
	private String nombre;
	private String correo;
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Integer> getNumerosVenta() {
		return numerosVenta;
	}
	public void setNumerosVenta(List<Integer> numerosVenta) {
		this.numerosVenta = numerosVenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", id=" + id + ", numerosVenta=" + numerosVenta + ", nombre=" + nombre
				+ ", correo=" + correo + "]"+ "\n";
	}
	/*
	 *  PRIVADO PUEDO TRABAJAR ATRIBUTOS DENTRO DE LA MISMA CLASE
	 *  como dejamos las variables del día 31/05 en un main del día 30/05 por default sólo CLASES DENTRO DEL PACKAGE pueden acceder
		Cliente cliente = new Cliente(); 
		cliente. 
	*/
	
	/*FUNCIONES GETTER AND SETTER ES PUBLICA Y COMO ESTA INTERNA DENTRO DE CLIENTE PUEDO MODIFICAR
	 * */
	
	
}
