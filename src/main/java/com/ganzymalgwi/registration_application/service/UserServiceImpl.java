package com.ganzymalgwi.registration_application.service;

import com.ganzymalgwi.registration_application.dto.RegistrationRequest;
import com.ganzymalgwi.registration_application.entity.User;
import com.ganzymalgwi.registration_application.repository.UserRepository;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public User register(RegistrationRequest registrationRequest) {

            if (userRepository.findByEmail(registrationRequest.getTitle()).isPresent())
                throw new IllegalArgumentException("Book already exists");
            User newBook = new User();
            newBook.setFirstName(registrationRequest.getTitle());
            newBook.setLastName(registrationRequest.getAuthor());
            newBook.setEmail(registrationRequest.getGenre());
            userRepository.save(newBook);
            return newBook;
    }
}
