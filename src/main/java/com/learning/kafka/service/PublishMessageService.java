package com.learning.kafka.service;


import com.learning.kafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class PublishMessageService {

    @Autowired
    KafkaProducer producer;

    public PublishMessageService(){
    }

    public void init(){
        try {
            producer.sendMessage("Hello from Java Service : " + new Date());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
