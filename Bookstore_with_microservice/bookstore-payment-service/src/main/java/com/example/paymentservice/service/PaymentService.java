package com.example.paymentservice.service;

import com.example.paymentservice.dto.request.CreatePaymentRequest;
import com.example.paymentservice.dto.response.CreatePaymentResponse;

public interface PaymentService {
    CreatePaymentResponse createPaymentRequest(CreatePaymentRequest createPaymentRequest);


}
