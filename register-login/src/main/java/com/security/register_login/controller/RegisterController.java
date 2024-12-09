package com.security.register_login.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.security.register_login.entity.Register;
import com.security.register_login.service.RegisterService;

@RestController
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private RegisterService registerService;
     @PostMapping("/addUser")
	public Register addUser(@RequestBody Register register) {
		return registerService.addUser(register);
	}

	@GetMapping("/getAll")
	public List<Register> getAllRegisterUser() {
		return registerService.getAllRegisterUser();
	}

}
