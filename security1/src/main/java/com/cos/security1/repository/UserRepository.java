package com.cos.security1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.security1.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
	User findByUsername(String username);
}
