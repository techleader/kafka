package com.learning.kafka.consumer;

import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;


public class KafkaConsumer {

    @KafkaListener(topics = "kafka-learning")
    public void listenGroupFoo(String message) {
        System.out.println("Java Consumer : Received Message in group foo: " + message);
    }
}
