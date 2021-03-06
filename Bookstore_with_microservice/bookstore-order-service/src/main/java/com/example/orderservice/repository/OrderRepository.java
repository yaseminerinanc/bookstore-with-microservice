package com.example.orderservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository <Order, String> {
	

    Order findByOrderId(String orderId);

    List<Order> findByUserId(String userId);

}
