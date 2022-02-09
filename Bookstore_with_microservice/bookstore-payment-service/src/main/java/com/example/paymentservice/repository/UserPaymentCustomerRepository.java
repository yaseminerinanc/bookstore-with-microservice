package com.example.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.paymentservice.entity.UserPaymentCustomer;

@Repository
public interface UserPaymentCustomerRepository extends JpaRepository<UserPaymentCustomer,String> {
	
    UserPaymentCustomer findByUserId(String userId);


}
