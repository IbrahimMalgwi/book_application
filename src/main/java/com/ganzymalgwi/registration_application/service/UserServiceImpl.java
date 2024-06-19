package com.ganzymalgwi.registration_application.service;

import com.ganzymalgwi.registration_application.dto.RegistrationRequest;
import com.ganzymalgwi.registration_application.entity.User;
import com.ganzymalgwi.registration_application.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Override
    public String register(RegistrationRequest registrationRequest) {
        if (userRepository.findByEmail(registrationRequest.getEmail()).isPresent())
            throw new IllegalArgumentException("Email already exists");
        User newUser =  new User();
        newUser.setFirstName(registrationRequest.getFirstName());
        newUser.setLastName(registrationRequest.getLastName());
        newUser.setEmail(registrationRequest.getEmail());
        userRepository.save(newUser);
        return "saved successfully";
    }
}