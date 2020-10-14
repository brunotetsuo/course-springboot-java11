package com.exemplo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
