package com.springeventdemo.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void createdOrder(String orderId) {
        System.out.println("Order created : " + orderId);
    }
}
