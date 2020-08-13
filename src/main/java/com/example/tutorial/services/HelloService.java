package com.example.tutorial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tutorial.models.Hello;
import com.example.tutorial.repository.IHelloRepository;

import reactor.core.publisher.Flux;

@Service
public class HelloService implements IHelloService {

	@Autowired
	private IHelloRepository helloRepository;

	public Flux<Hello> getAll(){
		return helloRepository.getAll();
	}

}
