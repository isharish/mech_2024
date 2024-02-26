package com.example.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.login.model.User;
import com.example.login.model.User1;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}

