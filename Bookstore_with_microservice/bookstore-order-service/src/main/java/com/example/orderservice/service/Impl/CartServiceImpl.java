package com.example.orderservice.service.Impl;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.orderservice.entity.Cart;
import com.example.orderservice.entity.CartItem;
import com.example.orderservice.repository.CartRepository;
import com.example.orderservice.service.CartService;


@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

	@Override
	public Cart getCart() {
		
		 Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	        String userName = (String) authentication.getPrincipal();
	    
	        Cart cartByUserName = cartRepository.findCartByUserName(userName);

	        synchronized (CartServiceImpl.class){
	            if (cartByUserName == null) {
	                createCart();
	                cartByUserName = cartRepository.findCartByUserName(userName);
	            }
	        }
	    
	        double totalPrice = cartByUserName.getCartItems()
	                                          .stream()
	                                          .mapToDouble(CartItem::getExtendedPrice)
	                                          .sum();
	    
	        cartByUserName.setTotalPrice(totalPrice);
	    
	        return cartByUserName;
	}

	@Override
	public Cart getCartByCartId(String cartId) {
		Optional<Cart> byCartId = cartRepository.findByCartId(cartId);
        return byCartId.orElseThrow(() -> new RuntimeException("Cart doesn't exist!!"));
		
	}
		 

	@Override
	public String createCart() {
		  Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	        String userName = (String) authentication.getPrincipal();

	        Cart cartByUserName = cartRepository.findCartByUserName(userName);

	        if (cartByUserName != null) {
	            return cartByUserName.getCartId();
	        }

	        Cart cart = Cart.builder()
	                .cartItems(new ArrayList<>())
	                .userName(userName)
	                .build();

	        Cart savedCart = cartRepository.save(cart);

	        return savedCart.getCartId();
	}

	@Override
	public Cart getCartByUserName(String userName) {
		  Cart cartByUserName = cartRepository.findCartByUserName(userName);
	        return cartByUserName;
	}

    
}
