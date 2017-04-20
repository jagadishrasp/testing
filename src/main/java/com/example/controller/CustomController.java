package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {
	
	@RequestMapping(value="/demo")
	public String greetings(){
		return "Greetings from tomcat 9";
	}

}
