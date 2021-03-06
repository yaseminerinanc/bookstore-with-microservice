package com.example.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.orderservice.entity.OrderShippingAddress;

public interface OrderShippingAddressRepository extends JpaRepository<OrderShippingAddress, String> {
	
	 OrderShippingAddress findByOrderId(String orderId);

}
