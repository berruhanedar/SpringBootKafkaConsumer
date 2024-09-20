package com.berru.app.springbootkafkaconsumer.listener;

import com.berru.app.springbootkafkaconsumer.dto.OrderDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "order-topic", groupId = "group-id")
    public void consumeOrderMessage(ConsumerRecord<String, OrderDTO> payload) {
        System.out.println(payload.value());
    }
}