package com.example.orderservice.service;

import java.util.List;

import com.example.orderservice.dto.request.CreateOrderRequest;
import com.example.orderservice.dto.request.PreviewOrderRequest;
import com.example.orderservice.dto.response.CreateOrderResponse;
import com.example.orderservice.dto.response.PreviewOrderResponse;

public interface OrderService {

    CreateOrderResponse createOrder(CreateOrderRequest createOrderRequest);

    PreviewOrderResponse previewOrder(PreviewOrderRequest previewOrderRequest);

    CreateOrderResponse getOrderById(String orderId);

    List<CreateOrderResponse> getMyOrders();

    List<CreateOrderResponse> getAllOrders();
}
