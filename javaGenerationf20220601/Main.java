package com.javaGenerationf20220601;

import com.javaGenerationf20220601modelo.Mascota;
import com.javaGenerationf20220601modelo.Michi;
import com.javaGenerationf20220601modelo.Perro;

import java.util.ArrayList;
import java.util.List;

import com.javaGenerationf20220601modelo.Gato;

public class Main {

	public static void main(String[] args) {
		// Herencia
		Mascota mascota = new Mascota();
		//para asignar valores para lograr determinar que sea un perro o un gato
		mascota.setColor("gris");
		mascota.setNombre("tom");
		mascota.setNombre("tom");
		
		/*creamos una instancia de perro y gato con el EXTENDS MASCOTAS
		*accedemos a los metodos getter and setter
		 si usamos perro. y luego gato. y no hemos llamado a ningun atributo genera error
		 comenta perro. para ver que sucede con gato.*/
		Perro perro = new Perro();
		perro.setColor("Amarillo");
		perro.setNombre("Cachupin");
		perro.setEspecie("canina");
		perro.setPelaje("liso y puntiagudo");
		perro.setPeso(5);
		perro.setSexo("masculino");
		perro.setColor("negro");
		perro.setCantPaseos(7);
		perro.setTamanoHocico(10.5f);
		perro.setSonidoVocal("ladrido");
		
		Gato gato = new Gato();
		gato.setColor("Amarillo");
		gato.setNombre("Michi");
		gato.setEspecie("felino");
		gato.setPelaje("rulitos");
		gato.setPeso(3);
		gato.setVisionNocturna(true);
		gato.setGarrasRetractil(true);
		gato.setSonidoVocal("maullido");
		gato.setSexo("femenino");
		
		
		System.out.println(perro.toString());
		System.out.println(gato.toString());
		
		/*SE PUEDEN AGREGAR VALORES A TRAVES DEL CONSTRUCTOR O EL SET*/
		Michi michi = new Michi(true);
		System.out.println(michi.toString());
		
		/*POLIMORFISMO*/
		List<Mascota> listaMascotas = new ArrayList<Mascota>();
		Mascota regalona = new Mascota("negro", "Canes", "Pelo", "Firulais", 1.5f,"Hembra");
		listaMascotas.add(regalona);
		
		Mascota akira = new Gato(); //vemos los metodos del padre MASCOTA
		akira.setNombre("akira hermosa");
		akira.setColor("naranja");
		akira.setPeso(3.4f);
		listaMascotas.add(akira);
		
		System.out.println(akira);
		
		Mascota chocolo= new Perro(); //vemos los metodos del padre MASCOTA
		chocolo.setNombre("chocolo");
		chocolo.setColor("negro");
		chocolo.setPeso(5);
		listaMascotas.add(chocolo);
		
		System.out.println(akira);		System.out.println(chocolo);
		regalona.hacerSonido();
		akira.hacerSonido();
		chocolo.hacerSonido();
		
		//para recorrer arreglo
		System.out.println("******");
		//recorrer el arreglo
		
		//objeto : lista mascocta
		for (Mascota mascota2 : listaMascotas) {
			mascota2.hacerSonido();
		}
		//transformar el objeto generico a uno especifico
		Perro perroChocolo = (Perro) chocolo;
		perroChocolo.setCantPaseos(6);
		
		System.out.println(perroChocolo);
	}

}
