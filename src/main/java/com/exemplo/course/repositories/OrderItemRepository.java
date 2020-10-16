package com.exemplo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
