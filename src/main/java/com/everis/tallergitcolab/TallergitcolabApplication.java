package com.everis.tallergitcolab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	
	public static void escribeMiNombre(){
		System.out.println("Fernando Rodríguez-Izquierdo Serrano");	
		System.out.println("Irene Rengel Ruiz");
		System.out.println("Samuel Piñero Gómez");
		System.out.println("Alvaro Rueda Sanchez");
		System.out.println("Manuel C.L.");
		System.out.println("Miguel Alcántara Montero");
		System.out.println("Francisco José caro Carazo");
	}
  	 

	

	
}
