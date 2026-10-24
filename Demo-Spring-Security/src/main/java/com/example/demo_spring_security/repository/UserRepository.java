package com.example.demo_spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo_spring_security.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
}
