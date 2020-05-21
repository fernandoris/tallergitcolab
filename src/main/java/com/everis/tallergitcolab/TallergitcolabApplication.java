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
		escribeNombre();
		
		
		
	}
	

	public static void escribeNombre() {
		System.out.println("Alicia G L");
		System.out.println("Miguel Alcantara Montero");
		System.out.println("Luca Gil de Montes de Vries");
	}
}
