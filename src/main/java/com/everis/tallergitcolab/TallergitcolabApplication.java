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
		escribeminombre();
	}
	public static void escribeminombre() {
		System.out.println("Juan González Cabezuelo - IES ALIXAR");
	}
}
