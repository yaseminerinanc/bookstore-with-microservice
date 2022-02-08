package com.example.paymentservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.feign.response.GetPaymentMethodResponse;
import com.example.paymentservice.dto.request.CreatePaymentMethodRequest;
import com.example.paymentservice.service.PaymentMethodService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PaymentMethodController {

    @Autowired
    private PaymentMethodService paymentMethodService;

    @PostMapping("/paymentMethod")
    public ResponseEntity<?> createPaymentMethod(@RequestBody @Valid CreatePaymentMethodRequest createPaymentMethodRequest){
        paymentMethodService.createPaymentMethod(createPaymentMethodRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/paymentMethod")
    public ResponseEntity<?> getAllMyPaymentMethods() {
        List<GetPaymentMethodResponse> allMyPaymentMethods = paymentMethodService.getAllMyPaymentMethods();
        return new ResponseEntity<>(allMyPaymentMethods, HttpStatus.OK);
    }

    @GetMapping("/paymentMethod/{paymentMethodId}")
    public ResponseEntity<GetPaymentMethodResponse> getMyPaymentMethodById(@PathVariable("paymentMethodId") String paymentMethodId) {
        GetPaymentMethodResponse paymentMethodDetail = paymentMethodService.getMyPaymentMethodById(paymentMethodId);
        return new ResponseEntity<>(paymentMethodDetail, HttpStatus.OK);
    }

}
