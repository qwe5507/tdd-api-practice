package com.example.productorderservice.product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
//    private Long sequence = 0L;
//    private Map<Long, Product> persistence = new HashMap<>();
//
//    public void save(final Product product) {
//        product.assignId(++sequence);
//        persistence.put(product.getId(), product);
//    }
}
