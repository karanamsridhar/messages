package com.rest.api.messages.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/hello/{name}")
	public String getMessage(@PathVariable(name="name")String name) {
		return "Hello, "+name+". How are you?";
	}
}
