package com.srinivart.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics="mytopic",groupId ="mygroup")
    public void consumerFromTopic(String msg){
        System.out.println("Consumed msg "+msg);

    }
}
