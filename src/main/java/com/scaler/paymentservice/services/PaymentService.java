package com.scaler.paymentservice.services;

import com.stripe.exception.StripeException;

public interface PaymentService {
    String generatePaymentLink(String orderId) throws StripeException;
}