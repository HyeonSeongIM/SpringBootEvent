package com.springeventdemo.service;

import com.springeventdemo.events.OrderCreatedEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ApplicationEventPublisher publisher;

    public OrderService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void createdOrder(String orderId, double amount) {
        System.out.println("Order created : " + orderId);
        publisher.publishEvent(new OrderCreatedEvent(orderId, amount));
    }
}
