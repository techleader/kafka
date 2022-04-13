package com.learning.kafka.config;

import com.learning.kafka.consumer.KafkaConsumer;
import com.learning.kafka.producer.KafkaProducer;
import com.learning.kafka.service.PublishMessageService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@EnableAutoConfiguration
@Configuration
@ImportAutoConfiguration({KafkaTopicConfig.class,KafkaProducerConfig.class,KafkaConsumerConfig.class})
@ComponentScan(basePackages ="com.learning.kafka.rest")
public class ApplicationConfig {

    @Bean
    public KafkaProducer kafkaProducer(){
        return new KafkaProducer();
    }

    @Bean
    @Profile("consumer")
    public KafkaConsumer kafkaConsumer(){
        return new KafkaConsumer();
    }

    @Bean
    @Profile("producer")
    public PublishMessageService publishMessageService(){
        return new PublishMessageService();
    }



}
