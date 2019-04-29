package com.bublik.app.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	private static final String GREETING = "Hello, world!";

	public String getMessage() {
		return GREETING;
	}

}
