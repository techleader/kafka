package com.learning.kafka.rest;

import com.learning.kafka.modal.Message;
import com.learning.kafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class RestDataController {

    @Autowired
    private KafkaProducer producer;

    @GetMapping("/data-set1")
    public Message[] testData(){
        Message[] messages = new Message[100];
        for(int i=0;i<100;i++){
            messages[i]=new Message(new Date().toString(), "Payload");
        }
        return messages;
    }

    @GetMapping("/publish-to-producer1")
    public String publish() throws Exception {
        System.out.println("Publish to Producer1 - called");
        producer.sendMessage("Message from rest : "+ new Date());
        return "SUCCESS";
    }

}
