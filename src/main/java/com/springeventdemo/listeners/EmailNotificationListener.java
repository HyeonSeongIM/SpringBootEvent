package com.springeventdemo.listeners;

import com.springeventdemo.events.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener {

    @EventListener
    public void handleOrderCreatedAndSendEmail(OrderCreatedEvent event) {
        System.out.println("Email Notification Listener received an email notification : " + event.getOrderId());
    }
}
