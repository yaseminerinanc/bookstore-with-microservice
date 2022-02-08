package com.example.orderservice.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;


import com.example.orderservice.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, String> {

    @Modifying
    @Transactional
    void deleteByCartItemId(String cartItemId);

    Optional<CartItem> findByCartItemId(String cartItemId);
}
