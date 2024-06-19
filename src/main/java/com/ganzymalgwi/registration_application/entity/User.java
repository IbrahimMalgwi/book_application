package com.ganzymalgwi.registration_application.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "app_users")
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}