package com.learning.kafka.application;

public class RunConsumer2 {
    public static void main(String[] args) {
        System.setProperty("kafka.bootstrapAddress", "localhost:9093");
        System.setProperty("spring.profiles.active" , "consumer");
        Application.main(args);
    }
}
