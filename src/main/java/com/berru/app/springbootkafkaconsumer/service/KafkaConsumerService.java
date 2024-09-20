package com.berru.app.springbootkafkaconsumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "order-topic", groupId = "group-id")
    public void consumeOrderMessage(String message) {
        log.info("Kafka'dan gelen mesaj: {}", message);

        // Mesajı işleyin (Deserialization yaparak)
        // OrderDTO orderDTO = deserializeMessage(message);
        // Gelen mesajla ilgili işlemleri burada gerçekleştirin...
    }
}