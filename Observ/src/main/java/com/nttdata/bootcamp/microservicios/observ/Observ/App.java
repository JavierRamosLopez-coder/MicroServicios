package com.nttdata.bootcamp.microservicios.observ.Observ;

import reactor.core.publisher.Flux;


public class App {
	public static void main(String[] args) {

		
		
		Flux<String> messageSender = Flux.just("Mensaje 1","Mensaje 2","Mensaje 3");
		
		//messageSender.subscribe(message -> System.out.println("Observer  1. " + message));
		
		messageSender.doOnNext((element) -> {
			System.out.println(element);
		}).blockLast();
	}
}
