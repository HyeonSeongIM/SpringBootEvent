package com.springeventdemo.listeners;

import com.springeventdemo.events.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

// Conditional Listener
@Component
public class HighValueOrderListener {

    @EventListener(condition = "#event.amount >= 1000")
    public void handleHighValueOrder(OrderCreatedEvent event) {
        System.out.println("HighValueOrder Detected : " + event.getOrderId() + " / Amount : " + event.getAmount());
    }
}
