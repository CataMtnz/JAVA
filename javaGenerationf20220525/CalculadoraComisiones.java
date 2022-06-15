package com.javaGenerationf20220525;

import java.util.Scanner;
public class CalculadoraComisiones {
	public static void main(String[] args) {
      	
        Scanner entrada = new Scanner(System.in);
      	//EJERCICIO 1
      	float comision1= 0.3f; //recordar poner f para que la primitiva se tome como propiedad Float
        float comision2= 0.2f;
        float comision3= 0.1f;
		
      	int venta; //precio fijo de venta
        float valorResultante; //debido a porcentajes de comisiones
        System.out.println("Ingrese el valor de la venta obtenida");
  		venta = Integer.parseInt(entrada.nextLine());//parseamos la variable objeto Integer a int
		
  		if(venta>=10000){
          valorResultante=(venta*comision1);
          System.out.println("La comisión de la venta es de 30% equivalente a: "+valorResultante);
        }else if(venta >= 5001 && venta <=9999 ){
         	valorResultante=(venta*comision2);
            System.out.println("La comisión de la venta es de 20% equivalente a: "+valorResultante);
        }else if(venta >= 1001 && venta <=4999){
          	valorResultante=(venta*comision3);
            System.out.println("La comisión de la venta es de 10% equivalente a: "+valorResultante);
        }else{
            System.out.println("No hay comisión por su venta");//que tambien cuenta al valor 5000
        }
	
  		
  		
  		//EJERCICIO 2
  		
  		float descuento1, descuento2, descuentoCantidad, totalPago, descuentoFinal;
  		//declaramos todas las variables juntas 
		int edadUsuario, edadDescuento1, edadDescuento2;
		int ticketNormal = 3500;//valor referencia cine en Chile
		//inicializamos en puntos criticos
		edadDescuento1 = 15;
		edadDescuento2 = 60;
		descuentoFinal = 0f;//variable float debido a descuentos en porcentajes
		// int cantidadTicket = 2;
		
		//pedimos dato de edad al usuario
		System.out.println("Por favor, ingrese su edad para calcular el precio final");
		edadUsuario = Integer.parseInt(entrada.nextLine());
		//<= a 15 años
		descuento1 = (float) (ticketNormal - (ticketNormal * 0.6));
		//Mayores de 60 años
		descuento2 = (float) (ticketNormal - (ticketNormal * 0.55));
		//según el total de tiket aplicando descuentos anteriores
		//descuentoPorCantidad = totalPago – (totalPago*0.3);
		if (edadUsuario > edadDescuento1 && edadUsuario <= edadDescuento2) {
			descuentoFinal = (float) ticketNormal;
			//variable float debe ser igual a variable float
		} else {
			if (edadUsuario <= edadDescuento1) {
				descuentoFinal = descuento1;
			} else {
				if (edadUsuario > edadDescuento2) {
					descuentoFinal = descuento2;
				}
			}
		}
		System.out.println("Su precio final de acuerdo a su edad es: $" + descuentoFinal + " CLP");
  		
  		
	}
	
	
}
