package com.kafka.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "${kafka.topic}", groupId = "my-group")
    public void getMessage(String message) {
        System.out.println("message received: "+message);
    }
}
