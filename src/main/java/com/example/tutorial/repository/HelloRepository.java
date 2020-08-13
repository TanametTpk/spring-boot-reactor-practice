package com.example.tutorial.repository;

import org.springframework.stereotype.Repository;

import com.example.tutorial.models.Hello;

import reactor.core.publisher.Flux;

@Repository
public class HelloRepository implements IHelloRepository {

	public Flux<Hello> getAll(){
		Hello hello1 = new Hello();
		Hello hello2 = new Hello();

		hello1.setMessage("hello1");
		hello2.setMessage("hello2");

		return Flux.just(hello1, hello2);
	}

}
