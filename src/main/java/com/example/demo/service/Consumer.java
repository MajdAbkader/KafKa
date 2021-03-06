package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
  
private static final Logger log = LoggerFactory.getLogger(Consumer.class);

	@KafkaListener(topics="mytopic", groupId="mygroup")
	
	public void consumeFromTopic(String message) {
		log.info("consummed message"+ message);
	}
}