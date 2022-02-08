package com.example.paymentservice.service;

import java.util.List;

import com.example.feign.response.GetPaymentMethodResponse;
import com.example.paymentservice.dto.request.CreatePaymentMethodRequest;

public interface PaymentMethodService {
	
    void createPaymentMethod(CreatePaymentMethodRequest createPaymentMethodRequest);

    List<GetPaymentMethodResponse> getAllMyPaymentMethods();

    GetPaymentMethodResponse getMyPaymentMethodById(String paymentMethodId);
}
