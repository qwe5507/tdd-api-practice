package com.example.productorderservice.payment.adaptor;

import com.example.productorderservice.payment.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
