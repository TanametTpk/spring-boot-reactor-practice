package com.example.tutorial.services;

import com.example.tutorial.models.Hello;

import reactor.core.publisher.Flux;

public interface IHelloService {
	public Flux<Hello> getAll();
}
