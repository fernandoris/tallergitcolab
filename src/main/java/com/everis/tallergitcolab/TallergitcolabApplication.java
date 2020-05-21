package com.everis.tallergitcolab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TallergitcolabApplication {

	public static void main(String[] args) {
		SpringApplication.run(TallergitcolabApplication.class, args);
		start();
		escribeMiNombre();
	}

	public static void start() {
		
		System.out.println("Hello world!");
		
	}
	
	public static void escribeMiNombre() {
		System.out.println("Alberto Ruiz");
	}
}
