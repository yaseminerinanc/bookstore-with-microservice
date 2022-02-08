package com.example.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.orderservice.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository <OrderItem, String>{

}
