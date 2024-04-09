package com.raiyan.car_rental_spring.services.auth;

import com.raiyan.car_rental_spring.dto.SignupRequest;
import com.raiyan.car_rental_spring.dto.UserDto;
import com.raiyan.car_rental_spring.entity.User;

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);
}
