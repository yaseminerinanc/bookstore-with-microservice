package com.example.orderservice.service;

import com.example.orderservice.dto.request.CartItemRequest;
import com.example.orderservice.entity.CartItem;

public interface CartItemService {
	
	 void addCartItem(CartItemRequest cartItemRequest);
	 
	 void removeCartItem(String cartItemId);
	    
	 CartItem getCartItem(String cartItemId);
	    
	 void removeAllCartItems(String cartId);

}
