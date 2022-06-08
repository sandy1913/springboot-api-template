package com.dcs.prototype;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypeApplication {

	// silence console logging
	@Value("${logging.level.root:OFF}")
	String message = "";

	public static void main(String[] args) {
		SpringApplication.run(PrototypeApplication.class, args);
	}

}
