package com.example.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.HelloWorld.myService.ServiceClass;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner {
	
	
	@Value("${hello.message: valor por defecto}")
	private String message;

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		
	}
	
	@Override
	public void run(String... args) {
		System.out.println(message);
	}

}
