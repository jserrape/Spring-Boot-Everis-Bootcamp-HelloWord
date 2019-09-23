package com.example.HelloWorld.myController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {
	
	@Autowired
	com.example.HelloWorld.myService.ServiceClass servicio;
	
	@RequestMapping("/hello")
	public String hello() {
		return servicio.message();
	}
	
	@RequestMapping("/hellos")
	public String hellos() {
		return servicio.getEntidades();
	}
	
	@RequestMapping("/hellos/{id}")
	public String userHellos() {
		return servicio.getEntidades();
	}

}
