package com.example.demo.controller;

import com.example.demo.service.TokenService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class TokenController {

	private final TokenService tokenService;

	public TokenController(TokenService tokenService) {
		this.tokenService = tokenService;
	}

	@PostMapping("/token")
	public String getToken() {
		String clientId = "TM7ZF2TTGrP6TFKJBeZsXXqGmuYVSpqi";
		String clientSecret = "B1HH6DJ8eCn2dH7OG6BrAHzCtn_g1yxcL3nVB7xerYLDFR8OQhrD2qK8P0hgEnhm";
		String audience = "https://userapi";

		return tokenService.getAuthToken(clientId, clientSecret, audience);
	}
}
