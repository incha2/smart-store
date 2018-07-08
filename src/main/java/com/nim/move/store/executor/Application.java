package com.nim.move.store.executor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Application file for startup
 * 
 * @param args
 */
@Configuration
@SpringBootApplication
@EntityScan("com.nim.move.store.model")
@ComponentScan("com.nim.move.store")
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}

}
