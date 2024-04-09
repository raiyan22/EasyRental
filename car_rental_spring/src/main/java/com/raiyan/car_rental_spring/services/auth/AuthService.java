package com.raiyan.car_rental_spring.services.auth;

import com.raiyan.car_rental_spring.dto.SignupRequest;
import com.raiyan.car_rental_spring.dto.UserDto;

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);
}
