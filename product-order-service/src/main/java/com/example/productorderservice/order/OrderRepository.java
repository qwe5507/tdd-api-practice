package com.example.productorderservice.order;

import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
class OrderRepository {
    private Map<Long, Order> persistence = new HashMap<>();
    private Long seq = 0L;

    public void save(final Order order) {
        order.assignId(++seq);
        persistence.put(order.getId(), order);
    }
}
