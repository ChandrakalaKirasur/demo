package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
	
	@GetMapping("/home")
	public String getWelcomed() {
		return "Welcome to your practice room";
	}
	
	@GetMapping("/wishes")
	public String getWishes() {
		return "Good Morning!! Welcome to Bangalore";
	}
	
	@GetMapping("/evening-wishes")
	public String getEveningWishes() {
		return "Good Evening!!";
	}

}
