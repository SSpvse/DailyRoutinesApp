package com.SS.DailyRoutine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "app_user")  // this is because user is a reserved keyword in SQL
public class User {
    // getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = false, length = 50)
    private String name;

    @Column(unique = false)
    private String email;


    private String password;
    private String provider;
    private String providerId;


}