package com.springeventdemo.listeners;

import com.springeventdemo.events.OrderCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener {

    @EventListener
    @Async
    public void handleOrderCreatedAndSendEmail(OrderCreatedEvent event) throws InterruptedException {
        System.out.println("Email Notification Listener received an email notification : " + event.getOrderId());
        Thread.sleep(3000);
        System.out.println("Email sent : " + event.getOrderId());
    }
}
