package com.example.productorderservice.payment;

public class ConsolePaymentGateway implements PaymentGateway {
    @Override
    public void excute(final int totalPrice, final String cardNumber) {
        // PG 연동 가정
        System.out.println("결제 완료");
    }
}
