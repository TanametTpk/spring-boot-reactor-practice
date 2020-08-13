package com.example.tutorial.repository;

import com.example.tutorial.models.Hello;

import reactor.core.publisher.Flux;

public interface IHelloRepository {
	public Flux<Hello> getAll();
}
