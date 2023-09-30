package com.example.productorderservice.payment.adaptor;

interface PaymentGateway {
    void excute(int totalPrice, String cardNumber);
}
