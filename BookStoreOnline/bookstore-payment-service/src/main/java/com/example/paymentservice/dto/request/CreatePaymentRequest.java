package com.example.paymentservice.dto.request;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePaymentRequest {

    private int amount;
    @NotBlank
    private String currency;
    @NotBlank
    private String paymentMethodId;

}
