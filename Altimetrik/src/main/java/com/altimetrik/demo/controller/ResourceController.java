package com.altimetrik.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@RequestMapping("/testingUser")
	public ResponseEntity<String> getUser()
	{
		return ResponseEntity.ok("I am User");
	}
	
	@RequestMapping("/testingAdmin")
	public ResponseEntity<String> getAdmin()
	{
		return ResponseEntity.ok().body("I am Admin");
	}

}
