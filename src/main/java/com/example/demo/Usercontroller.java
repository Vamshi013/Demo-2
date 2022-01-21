package com.example.demo;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	public class UserController{
		IUserService userService;
		@GetMapping("/user")
		String getUser() {
			System.out.println("Testing");
			return "Testing";
		}
		@PostMapping("/user")
		void createUser(@RequestBody User user) {
			System.out.println(user.getName());
			userService.saveUser(user);
		}
		@DeleteMapping("/user")
		void deleteUser() {	}

}