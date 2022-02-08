package com.example.orderservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

import com.example.orderservice.entity.Cart;

@Transactional
public interface CartRepository extends JpaRepository<Cart, String> {

    Cart findCartByUserName(String userName);

    Optional<Cart> findByCartId(String cartId);
}