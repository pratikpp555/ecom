package com.example.ecom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*
 * RestController = Controller + ResponseBody
 * Controller only returns accepts html(view)
 * RestConstroller can be return json response
 * 
 * Rest Representationl state transfer over http protocol get put post 
 *  It provides a set of guidelines and constraints that help create scalable, 
 *  maintainable, and stateless APIs.
 * They use standard HTTP methods like GET, POST, PUT, DELETE to 
 *  perform operations on resources (e.g., data objects) identified by URLs. 
 *  The API responses are often in JSON or XML format, 
 *  making them easy to consume and process by various programming languages.
 * 
 * Responsebody used to convert object into http response 
 * in the form client is expecting like json ,XML or simply text
 * 
 * RequestBody maps the httpRequest body to a transfer or domain object,
 * enabling automatic deserialization of inbound http request body onto a 
 * java object
 * Spring automatically deserializes the json into a java type
 * 
 * In a traditional RESTful API, a REST controller typically does not return 
 * views. Instead, it returns data in various formats like JSON or XML, as 
 * discussed in the previous response. 
 * The purpose of a RESTful API is to provide a way for clients to 
 * interact with the server and exchange data, not to render views or web pages.
 */


@RestController
public class HelloController {
    
	@GetMapping("/hello")
	String hello() {
		return "Hello World"; 
	}
	
}
