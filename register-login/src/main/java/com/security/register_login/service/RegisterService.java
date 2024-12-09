package com.security.register_login.service;

import java.util.List;

import com.security.register_login.entity.Register;
import com.security.register_login.repository.RegisterRepository;


public interface RegisterService {

	public Register addUser(Register register);

	public List<Register> getAllRegisterUser();

}
