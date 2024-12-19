package com.junit.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junit.entity.User;
import com.junit.service.UserService;
@RestController
@RequestMapping("/user")
public class UserController {
	    @Autowired
	    private UserService userService;

	    @GetMapping("/{id}")
	    public ResponseEntity<User> getUser(@PathVariable Long id) {
	        User user = userService.getUserById(id);
	        if (user != null) {
	            return ResponseEntity.ok(user);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
	    @PostMapping("/addUser")
		public User addUser(@RequestBody User user) {
			return userService.addUser(user);
		}

}
