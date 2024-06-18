package com.ganzymalgwi.registration_application.controller;

import com.ganzymalgwi.registration_application.dto.RegistrationRequest;
import com.ganzymalgwi.registration_application.entity.User;
import com.ganzymalgwi.registration_application.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class Controller {

    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegistrationRequest registrationRequest) {
        return ResponseEntity.ok(userService.register(registrationRequest));
    }

}
