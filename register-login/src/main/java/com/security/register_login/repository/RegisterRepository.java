package com.security.register_login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.security.register_login.entity.Register;
@Repository
public interface RegisterRepository extends JpaRepository<Register, Integer> {

}
