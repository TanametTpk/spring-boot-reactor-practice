package com.example.tutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorial.models.Hello;
import com.example.tutorial.services.IHelloService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/hellos")
public class HelloController {

	@Autowired
	private IHelloService helloService;

	@GetMapping
	public Flux<Hello> getAllHello(){
		return helloService.getAll();
	}

}
