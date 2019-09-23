package com.example.HelloWorld.myService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HelloWorld.Entidades.User;
import com.example.HelloWorld.Repositorios.HelloRepository;

@Service
public class ServiceClass {
	
	@Autowired
	private HelloRepository repository;

	public String message() {
		User user = new User("soy el nombre");
		this.repository.save(user);
		
		return "mensaje service";
	}
	
	public String getEntidades(){
		return this.repository.findAll().toString();
	}
}
