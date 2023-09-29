package com.example.productorderservice.product;

import com.example.productorderservice.ApiTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static com.example.productorderservice.product.ProductSteps.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductApiTest extends ApiTest {

    @Test
    void 상품등록() {
        final var request = 상품등록요청_생성();

        final var response = 싱픔등록요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }

    @Test
    void 상품조회() {
        싱픔등록요청(상품등록요청_생성());
        Long productId = 1L;

        final var response = 상품조회요청(productId);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.jsonPath().getString("name")).isEqualTo("상품명");
    }

}
