package com.learning.kafka.config;

import com.learning.kafka.consumer.KafkaConsumer;
import com.learning.kafka.producer.KafkaProducer;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ImportAutoConfiguration({KafkaTopicConfig.class,KafkaProducerConfig.class,KafkaConsumerConfig.class})
public class ApplicationConfig {

    @Bean
    public KafkaProducer kafkaProducer(){
        return new KafkaProducer();
    }

    @Bean
    public KafkaConsumer kafkaConsumer(){
        return new KafkaConsumer();
    }

}
