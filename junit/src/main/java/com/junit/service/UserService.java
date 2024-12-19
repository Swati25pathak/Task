package com.junit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junit.entity.User;
import com.junit.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	    public User getUserById(Long id) {
			return userRepository.getById(id);
	          
	    }

		public User addUser(User user) {
			
			return userRepository.save(user);
		}
	}


