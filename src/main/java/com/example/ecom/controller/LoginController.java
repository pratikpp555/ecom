package com.example.ecom.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecom.model.LogIn;

@RestController
public class LoginController {

	@PostMapping("/login")
	LogIn login( @RequestBody LogIn login) {
		return login;
	}
}
