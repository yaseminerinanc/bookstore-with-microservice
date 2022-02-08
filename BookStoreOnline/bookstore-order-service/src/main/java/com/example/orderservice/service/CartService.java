package com.example.orderservice.service;

import com.example.orderservice.entity.Cart;

public interface CartService {
	
	 Cart getCart();
	    
	 Cart getCartByCartId(String cartId);

	 String createCart();

	 Cart getCartByUserName(String userName);

}
