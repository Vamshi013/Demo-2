package com.example.demo;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

public class IUserService {
	@Autowired //DI
    UserRepository userRepository;
	public void saveUser(User user) {
		userRepository.save(user);
		// TODO Auto-generated method stub
		
	}

}
