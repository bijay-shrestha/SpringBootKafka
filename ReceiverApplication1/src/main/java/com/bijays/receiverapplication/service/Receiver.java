package com.bijays.receiverapplication.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Receiver {

    @KafkaListener(topics={"topicA"})
    public void receive(@Payload String message){
        System.out.println("Receiver1 received message: " + message);
    }
}