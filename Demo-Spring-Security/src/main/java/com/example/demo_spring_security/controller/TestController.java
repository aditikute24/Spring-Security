package com.example.demo_spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/register")
	// @PostMapping("/register")
	public String openRegister() {
		return "Register page is open";
	}

	 @PostMapping("/home")
	    public String openHome() {
	        return "Welcome to Home Page";
	    }

	@GetMapping("/cart")
	public String openCart() {
		return "Cart page is open";
	}
	
	@PostMapping("/admin")
	public String openAdmin() {
		return "Admin Page";
	}
	
	@GetMapping("/user")
	public String openUser() {
		return "User Page";
	}

}