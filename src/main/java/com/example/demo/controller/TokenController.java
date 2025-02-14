package com.example.demo.controller;

import com.example.demo.service.TokenService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class TokenController {

	private final TokenService tokenService;

	public TokenController(TokenService tokenService) {
		this.tokenService = tokenService;
	}
	
	@Value("${spring.security.oauth2.client.registration.auth0.client-id}")
	private String clientId;
	
	@Value("${spring.security.oauth2.client.registration.auth0.client-secret}")
	private String clientSecret;
	
	@Value("${spring.security.oauth2.resourceserver.jwt.audiences}")
	private String audience;

	@PostMapping("/token")
	public String getToken() {
		return tokenService.getAuthToken(clientId, clientSecret, audience);
	}
}
