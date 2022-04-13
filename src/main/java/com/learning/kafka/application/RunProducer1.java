package com.learning.kafka.application;

import com.learning.kafka.config.ApplicationConfig;
import com.learning.kafka.producer.KafkaProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;

public class RunProducer1 {
    public static void main(String[] args) {
        System.setProperty("kafka.bootstrapAddress", "localhost:9092");
        System.setProperty("spring.profiles.active" , "producer");
        ApplicationContext context = SpringApplication.run(ApplicationConfig.class,args);
        KafkaProducer producer = (KafkaProducer) context.getBean("kafkaProducer");

    }
}
