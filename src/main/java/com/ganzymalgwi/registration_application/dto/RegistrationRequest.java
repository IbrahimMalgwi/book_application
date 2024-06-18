package com.ganzymalgwi.registration_application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class RegistrationRequest {
    private String title;
    private String author;
    private String genre;
}
