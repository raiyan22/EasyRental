package com.raiyan.car_rental_spring.entity;

import com.raiyan.car_rental_spring.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    // issue: https://stackoverflow.com/questions/25851029/org-hibernate-annotationexception-no-identifier-specified-for-entity-i-dont-ha

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String password;

    private UserRole userRole;
}
