package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/user")
	public String getUser() {
		return "Access Granted : Inside get user method";
	}

	@PostMapping("/user")
	public String updateUser() {
		return "Access Granted : Inside update user method";
	}

}
