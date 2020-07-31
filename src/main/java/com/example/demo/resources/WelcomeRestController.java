package com.example.demo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Swagger2WelcomeRestController", description = "This REST Api related to Welcome Message!!!!")
@RestController
public class WelcomeRestController {

	@ApiOperation(value = "Get Welcome Message For The Given Name ", response = String.class, tags = "getWelcomeNote")
	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable("name") String name) {
		return name+", Welcome to Ashok IT Family..!!";
	}

}
