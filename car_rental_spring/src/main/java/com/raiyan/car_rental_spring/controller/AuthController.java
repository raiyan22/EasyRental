package com.raiyan.car_rental_spring.controller;

import com.raiyan.car_rental_spring.dto.SignupRequest;
import com.raiyan.car_rental_spring.dto.UserDto;
import com.raiyan.car_rental_spring.services.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<?> SignupCustomer(@RequestBody SignupRequest signupRequest) {
        UserDto createdCustomerDto = authService.createCustomer(signupRequest);
        if(createdCustomerDto == null)
            return new ResponseEntity<>("Customer not created", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(createdCustomerDto, HttpStatus.CREATED);
    }
}
