package com.springboot.employee.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.springboot.employee.model.User;
import com.springboot.employee.dto.UserRegistrationDto;


public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
