package com.learning.kafka.application;


import com.learning.kafka.config.ApplicationConfig;
import com.learning.kafka.producer.KafkaProducer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import java.util.Date;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class Application {

    public static void main(String[] args) {

       // System.setProperty("kafka.bootstrapAddress",args[0]);
        ApplicationContext context = SpringApplication.run(ApplicationConfig.class,args);
        /*KafkaProducer producer = (KafkaProducer) context.getBean("kafkaProducer");
        try {
            producer.sendMessage("Hello from Java : " + new Date());

        } catch (Exception e) {
            e.printStackTrace();
        }*/
        System.out.println("Application Started");
    }

}
