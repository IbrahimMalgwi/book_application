package com.ganzymalgwi.registration_application.repository;

import com.ganzymalgwi.registration_application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByEmail(String email);


}
