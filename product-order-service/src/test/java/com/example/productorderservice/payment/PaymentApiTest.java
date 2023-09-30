package com.example.productorderservice.payment;

import com.example.productorderservice.ApiTest;
import com.example.productorderservice.order.OrderSteps;
import com.example.productorderservice.product.ProductSteps;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static com.example.productorderservice.payment.PaymentSteps.주문결제요청;
import static org.assertj.core.api.Assertions.assertThat;

public class PaymentApiTest extends ApiTest {

    @Test
    void 상품주문() {
        ProductSteps.싱픔등록요청(ProductSteps.상품등록요청_생성());
        OrderSteps.상품주문요청(OrderSteps.상품주문요청_생성());

        final var request = PaymentSteps.주문결제요청_생성();

        final var response = 주문결제요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
    }
}
