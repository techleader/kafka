package com.learning.kafka.application;

public class RunProducer1 {
    public static void main(String[] args) {
        System.setProperty("kafka.bootstrapAddress", "localhost:9092");
        Application.main(args);
    }
}
