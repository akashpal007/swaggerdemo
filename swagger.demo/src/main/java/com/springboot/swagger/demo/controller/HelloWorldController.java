package com.springboot.swagger.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	@ApiOperation(value = "Returns Hello World")
	@GetMapping
	public String hello() {
		return "Hello World";
	}

	@ApiOperation(value = "Returns which you enter")
	@PostMapping("/post")
	public String helloPost(@RequestBody String hello) {
		return hello;
	}

	@ApiOperation(value = "Returns which you enter")
	@PutMapping("/put")
	public String helloPut(@RequestBody String hello) {
		return hello;
	}
}
