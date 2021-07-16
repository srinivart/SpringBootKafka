package com.srinivart.controller;

import com.srinivart.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    Producer producer;

    @PostMapping(value="/post")
    public void sendMessage(@RequestParam("msg") String msg){
        producer.publishToTopic(msg);
    }

}
