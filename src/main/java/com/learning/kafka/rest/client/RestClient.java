package com.learning.kafka.rest.client;

import com.learning.kafka.modal.Message;
import com.learning.kafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class RestClient {

    public static void publishMessage(KafkaProducer producer) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/data-set1";
        ResponseEntity<Message[]> response
                = restTemplate.getForEntity(url , Message[].class);
        System.out.println("Response Code : " + response.getStatusCode());
        Message[] messages = response.getBody();
        for(Message message : messages) {
            System.out.println("Sending messages : {} "+ message);
            producer.sendMessage(message.toString());
        }

    }



}
