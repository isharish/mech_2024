package com.example.login.model;

import jakarta.persistence.spi.*;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;



@Entity
@Getter
@Setter
// @Table(name="event4")
public class User3 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NonNull
    private String name;
    private String col_name;

    private String email;
    private String phone;

}
