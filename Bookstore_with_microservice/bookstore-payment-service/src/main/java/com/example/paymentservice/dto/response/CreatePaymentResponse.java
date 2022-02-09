package com.example.paymentservice.dto.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreatePaymentResponse {
    private String paymentId;
    private LocalDateTime paymentDate;
    private boolean captured;
    private String receipt_url;
}
