package com.everis.tallergitcolab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yaml.snakeyaml.external.com.google.gdata.util.common.base.Escaper;

@SpringBootApplication
public class TallergitcolabApplication {

	public static void main(String[] args) {
		SpringApplication.run(TallergitcolabApplication.class, args);
		start();
	}

	public static void start() {
		
		System.out.println("Hello world!");
		escribeMiNombre();
		
		
	}
	
	public static void escribeMiNombre () {
		System.out.println("Luca Gil de Montes de Vries");
		System.out.println("Yi Chen");
		System.out.println("Fernando Rodríguez-Izquierdo Serrano");
		System.out.println("Miguel Alcantara Montero");
		System.out.println("Alvaro Rueda Sanchez");
		System.out.println("Irene Rengel");
		System.out.println("Fernando Vázquez Boza");
	}

}
