package com.example.orderservice.dto.request;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PreviewOrderRequest {
    private String billingAddressId;
    @NotBlank
    private String shippingAddressId;
    @NotBlank
    private String paymentMethodId;
}