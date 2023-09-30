package com.example.productorderservice.order;

import com.example.productorderservice.product.ProductService;
import com.example.productorderservice.product.ProductSteps;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.example.productorderservice.order.OrderSteps.상품주문요청_생성;

@SpringBootTest
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;

    @Test
    void 상품주문() {
        productService.addProduct(ProductSteps.상품등록요청_생성());

        final CreateOrderRequest request = 상품주문요청_생성();

        orderService.createOrder(request);
    }

}
