package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Usercontroller {
	@RestController
	public class UserController{
		@GetMapping("/user")
		String getUser() {
			System.out.println("Testing");
			return "Testing";
		}
	}

}
