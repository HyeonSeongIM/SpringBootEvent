package com.springeventdemo.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class LogOrderDetailsListener {
    
    @EventListener
    public void logOrderCreated(OrderCreatedEvent event) {
        System.out.println("Order placed orderId : " + event.getOrderId());
    }
}
