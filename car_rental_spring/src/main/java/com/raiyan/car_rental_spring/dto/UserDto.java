package com.raiyan.car_rental_spring.dto;

import com.raiyan.car_rental_spring.enums.UserRole;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;

@Data
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private UserRole userRole;
}
