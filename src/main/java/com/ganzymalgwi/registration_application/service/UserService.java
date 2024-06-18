package com.ganzymalgwi.registration_application.service;

import com.ganzymalgwi.registration_application.dto.RegistrationRequest;
import com.ganzymalgwi.registration_application.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


    public User register(RegistrationRequest registrationRequest);

}
