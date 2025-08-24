package com.kafka.producer.Controller;

import com.kafka.producer.service.KafkaProducerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final KafkaProducerService kafkaProducerService;


    public KafkaController(KafkaProducerService kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @GetMapping("post-message/{message}")
    public void postMessage(@PathVariable("message") final String message){
        kafkaProducerService.sendMessage(message);
    }
}
