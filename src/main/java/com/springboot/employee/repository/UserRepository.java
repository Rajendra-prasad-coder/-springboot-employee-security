package com.springboot.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.employee.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
 
	User findByEmail(String userName);
}
