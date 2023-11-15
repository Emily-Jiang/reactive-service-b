package com.example.demo.reactive;

import jakarta.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class KafkaConsumer {


    @Incoming("prices")
    public void consume(int price) {
        System.out.println("Consumer received: " + price + " @" + System.currentTimeMillis());
    }
}