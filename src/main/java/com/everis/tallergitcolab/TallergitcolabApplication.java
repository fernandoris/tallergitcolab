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
	
	public static void escribeMiNombre () {
		System.out.println("Luca Gil de Montes de Vries");
	
		System.out.println("Miguel Alcantara Montero");
	
		System.out.println("Manuel C.L.");
		System.out.println("Miguel Alcántara Montero");
		System.out.println("Francisco José caro Carazo");
		System.out.println("Salvador Muñoz Cordero");

	

	
		System.out.println("Pablo Gómez Meléndez");
	}
}
