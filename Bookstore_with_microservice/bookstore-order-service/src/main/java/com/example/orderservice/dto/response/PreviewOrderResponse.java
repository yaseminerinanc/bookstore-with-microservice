package com.example.orderservice.dto.response;

import java.util.ArrayList;
import java.util.List;

import com.example.orderservice.dto.Card;
import com.example.orderservice.entity.OrderItem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class PreviewOrderResponse {
	
    private List<OrderItem> orderItems = new ArrayList<>();
    private GetAddressResponse shippingAddress;
    private Card card;
    private Double itemsTotalPrice;
    private Double taxPrice;
    private Double shippingPrice;
    private Double totalPrice;
	public void setShippingAddress(com.example.common.GetAddressResponse shippingAddress2) {
		// TODO Auto-generated method stub
		
	}
}