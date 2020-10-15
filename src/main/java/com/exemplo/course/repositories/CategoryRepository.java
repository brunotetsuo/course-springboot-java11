package com.exemplo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
