package com.ganzymalgwi.registration_application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;

}
