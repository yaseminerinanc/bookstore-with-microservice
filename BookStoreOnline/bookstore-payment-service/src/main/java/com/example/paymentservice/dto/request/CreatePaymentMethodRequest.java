package com.example.paymentservice.dto.request;

	
import javax.validation.constraints.NotNull;

import com.example.paymentservice.dto.Card;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePaymentMethodRequest {

    @NotNull
    private Card card;
}
