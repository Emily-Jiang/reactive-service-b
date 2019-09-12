package dev.appsody.starter;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class KafkaConsumer {


    @Incoming("prices")
    public void consume(int price) {
        System.out.println("2nd Consumer received: " + price + " @" + System.currentTimeMillis());
    }
}