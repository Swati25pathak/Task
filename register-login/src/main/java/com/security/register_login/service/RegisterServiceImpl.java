package com.security.register_login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.register_login.entity.Register;
import com.security.register_login.repository.RegisterRepository;
@Service
public class RegisterServiceImpl implements RegisterService{
	@Autowired
	private RegisterRepository registerRepository;

	@Override
	public Register addUser(Register register) {
		
		return registerRepository.save(register);
	}

	@Override
	public List<Register> getAllRegisterUser() {
		
		return registerRepository.findAll();
	}

}
