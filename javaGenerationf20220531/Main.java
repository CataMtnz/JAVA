package com.javaGenerationf20220531;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.javaGenerationf20220531.manager.ClienteManager;

public class Main {

	public static void main(String[] args) {
		/*
		 *  ver tipos de creación de main: public, protected, default, private
		 *  1. Cliente como público
		 */
		/* Crear una instancia de cliente Cliente cliente
		 * SE puede instanciar, si no agregamos constructores POR DEFAULT VIENE EL CONSTRUCTOR VACÍO
		 * se recomienda escribir en el objeto cuando agregue parametros en el constructor
		 */
		
		Scanner sc = new Scanner(System.in);
		
		/* Lista <tipo de datos> una lista puede tener 0 o más clienteS permite crear sin definir el tipo de datos a asignar new Arraylist <>();
		 * Dato Cliente
		 * */
		List<Cliente> listaCliente = new ArrayList <Cliente>();
		// para que reconoza el while deginimos la variable
		int opcion = 0;
		/*creamos el do incluyemos */
		
		/*
		Cliente cliente = new Cliente();;
		cliente.setCorreo("uwu@correo.cl");
		cliente.setId(1234);
		cliente.setNumerosVenta(null);
		cliente.setNombre("El cucho");*/
		
		//tomar y poner variable. : accedes a las variables de la clase
		/*cliente.id = 1234; /*PROTECTED accesibles dentro del mismo package
		*cliente.correo = "uwu@gmail.com";son privadas
		cliente.getId();
		Cliente. al poner publico puedo trabajarlo en otro package SIN PASAR NI POR GETTER AND SETTER*/
		
		
		/* SOLICITAR DATOS AL USUARIO
		 * EXCEPCIONES
		 * */
		
		/*NullPointerException si asignamos el id nulo/null no se puede sumar ni agregar rut para abajo*/
		do {
		Cliente clienteDatosDinamicos = new Cliente();
		System.out.println("Ingrese el id de Cliente");
		//Integer id = sc.nextInt();
		String idString = sc.nextLine();
		/*"TRABAJAR EXCEPCIONES controlar que el usuario"*/
		
		try {
			Integer id = Integer.parseInt(idString); // si esto logra pasar lo ponemos al set
			clienteDatosDinamicos.setId(id);
		}catch (NumberFormatException nfe) { // e es variable de tipo expetion
			System.out.println("No puede ingresar una letra como identificador" +nfe);
		}catch (Exception e) { // e es variable de tipo expetion
			System.out.println("Ha ocurrido un error, contacte conel adiministrador" +e.getLocalizedMessage());
		}
		/*clienteDatosDinamicos.setId(id);*/
		sc.nextLine();
		
		System.out.println("Ingrese el nombre de Cliente");
		String nombre = sc.nextLine();
		clienteDatosDinamicos.setNombre(nombre);
		
		System.out.println("Ingrese el correo de Cliente");
		String correo = sc.nextLine();
		clienteDatosDinamicos.setCorreo(correo);
		
		/*ArithmeticException:
		 * */
		/*Integer division =100/0;
		System.out.println(division);
		
		/* Integer.parseInt(sc.nextLine();
		 * */
		
		listaCliente.add(clienteDatosDinamicos);
		/*preguntar si quiere agregar más clientes*/
		
		do {
		System.out.println("Desea ingresar un nuevo cliente? (1)sí (0)no");
		//debemos capturar la opción del usuario int es suficiente para la cantidad de opciones
		//int opcion = sc.nextInt();
		opcion = sc.nextInt();
		
		}while(opcion <0 || opcion>1);
		sc.nextLine();
		}while(opcion ==1);{
			
		/* Para acceder a info de otro package
		 * SE DEBE IMPORTAR*/
			ClienteManager cm = new ClienteManager();
			cm.recorrerArregloCliente(listaCliente);
			
			/**acceder al metodo de otra clase**/
			//Creando una instancia de la clase

			}
		}
		
	}

