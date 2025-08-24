package com.kafka.consumer.service;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "kafka.topic")
@Data
public class KafkaTopicProperties {
    private String name;
}
