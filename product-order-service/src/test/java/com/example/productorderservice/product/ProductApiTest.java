package com.example.productorderservice.product;

import com.example.productorderservice.ApiTest;
import com.example.productorderservice.product.adaptor.ProductRepository;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import static com.example.productorderservice.product.ProductSteps.*;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductApiTest extends ApiTest {
    @Autowired
    ProductRepository productRepository;

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

    @Test
    void 상품수정() {
        ProductSteps.싱픔등록요청(ProductSteps.상품등록요청_생성());
        final long productId = 1L;

        final ExtractableResponse<Response> response = ProductSteps.상품수정요청(productId);
        assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
        assertThat(productRepository.findById(1L).get().getName()).isEqualTo("상품 수정");
    }
}
